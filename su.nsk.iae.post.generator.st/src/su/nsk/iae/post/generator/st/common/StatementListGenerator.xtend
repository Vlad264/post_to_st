package su.nsk.iae.post.generator.st.common

import java.util.Arrays
import java.util.List
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import su.nsk.iae.post.generator.st.common.statement.AssignmentStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.CaseStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.ErrorProcessStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.ForStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.IStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.IfStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.RepeatStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.ResetTimerStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.SetStateStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.StartProcessStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.StopProcessStatementGenerator
import su.nsk.iae.post.generator.st.common.statement.WhileStatementGenerator
import su.nsk.iae.post.poST.AddExpression
import su.nsk.iae.post.poST.AddOperator
import su.nsk.iae.post.poST.AndExpression
import su.nsk.iae.post.poST.ArrayVariable
import su.nsk.iae.post.poST.CompExpression
import su.nsk.iae.post.poST.CompOperator
import su.nsk.iae.post.poST.EquExpression
import su.nsk.iae.post.poST.EquOperator
import su.nsk.iae.post.poST.Expression
import su.nsk.iae.post.poST.MulExpression
import su.nsk.iae.post.poST.MulOperator
import su.nsk.iae.post.poST.PowerExpression
import su.nsk.iae.post.poST.PrimaryExpression
import su.nsk.iae.post.poST.ProcessStatusExpression
import su.nsk.iae.post.poST.SignedInteger
import su.nsk.iae.post.poST.Statement
import su.nsk.iae.post.poST.StatementList
import su.nsk.iae.post.poST.SymbolicVariable
import su.nsk.iae.post.poST.UnaryExpression
import su.nsk.iae.post.poST.UnaryOperator
import su.nsk.iae.post.poST.XorExpression

import static su.nsk.iae.post.generator.st.common.util.GeneratorUtil.*

class StatementListGenerator {
	
	ProgramGenerator program
	ProcessGenerator process
	List<IStatementGenerator> statementGenerators
	
	new(ProgramGenerator program, ProcessGenerator process, StateGenerator state) {
		this.program = program
		this.process = process
		statementGenerators = Arrays.asList(
			new AssignmentStatementGenerator(program, process, state, this),
			new IfStatementGenerator(program, process, state, this),
			new CaseStatementGenerator(program, process, state, this),
			new ForStatementGenerator(program, process, state, this),
			new WhileStatementGenerator(program, process, state, this),
			new RepeatStatementGenerator(program, process, state, this),
			new StartProcessStatementGenerator(program, process, state, this),
			new StopProcessStatementGenerator(program, process, state, this),
			new ErrorProcessStatementGenerator(program, process, state, this),
			new SetStateStatementGenerator(program, process, state, this),
			new ResetTimerStatementGenerator(program, process, state, this)
		)
	}
	
	def String generateStatementList(StatementList statementList) '''
		�FOR s : statementList.statements�
			�s.generateStatement�
		�ENDFOR�
	'''
	
	def String generateStatement(Statement statement) {
		for (sg : statementGenerators) {
			if (sg.checkStatement(statement)) {
				return sg.generateStatement(statement)
			}
		}
		return '''RETURN'''
	}
	
	def String generateExpression(Expression exp) {
		switch exp {
			PrimaryExpression: {
				if (exp.const !== null) {
					return NodeModelUtils.getNode(exp.const).text.trim
				} else if (exp.variable !== null) {
					return exp.variable.generateVar
				} else if (exp.array !== null) {
					return exp.array.generateArray
				} else if (exp.procStatus !== null) {
					return '''�exp.procStatus.generateProcessStatus�'''
				} else {
					return '''(�exp.nestExpr.generateExpression�)'''
				}
			}
			UnaryExpression:
				return '''�IF exp.unOp == UnaryOperator.NOT�NOT �ELSEIF exp.unOp == UnaryOperator.UNMINUS�-�ENDIF��exp.right.generateExpression�'''
			PowerExpression:
				return '''�exp.left.generateExpression� ** �exp.right.generateExpression�'''
			MulExpression:
				return '''�exp.left.generateExpression� �exp.mulOp.generateMulOperators� �exp.right.generateExpression�'''
			AddExpression:
				return '''�exp.left.generateExpression� �IF exp.addOp == AddOperator.PLUS�+�ELSE�-�ENDIF� �exp.right.generateExpression�'''
			EquExpression:
				return '''�exp.left.generateExpression� �exp.equOp.generateEquOperators� �exp.right.generateExpression�'''
			CompExpression:
				return '''�exp.left.generateExpression� �IF exp.compOp == CompOperator.EQUAL�=�ELSE�<>�ENDIF� �exp.right.generateExpression�'''
			AndExpression:
				return '''�exp.left.generateExpression� AND �exp.right.generateExpression�'''
			XorExpression:
				return '''�exp.left.generateExpression� XOR �exp.right.generateExpression�'''
			Expression:
				return '''�exp.left.generateExpression� OR �exp.right.generateExpression�'''
				
		}
	}
	
	def String generateVar(SymbolicVariable varName) {
		if (process.containsVar(varName.name)) {
			return process.getVarName(varName.name)
		}
		return varName.name
	}
	
	def String generateArray(ArrayVariable varDecl) {
		return '''�varDecl.varName.generateVar�[�varDecl.index.generateExpression�]'''
	}
	
	def String generateEquOperators(EquOperator op) {
		switch op {
			case EquOperator.LESS:
				return '''<'''
			case EquOperator.LESS_EQU:
				return '''<='''
			case EquOperator.GREATER:
				return '''>'''
			case EquOperator.GREATER_EQU:
				return '''>='''
		}
	}
	
	def String generateMulOperators(MulOperator op) {
		switch op {
			case MulOperator.MUL:
				return '''*'''
			case MulOperator.DIV:
				return '''/'''
			case MulOperator.MOD:
				return '''MOD'''
		}
	}
	
	def String generateProcessStatus(ProcessStatusExpression exp) {
		if (exp.active) {
			return '''((�program.generateProcessEnum(exp.process.name)� <> �generateStopConstant�) AND (�program.generateProcessEnum(exp.process.name)� <> �generateErrorConstant�))'''
		} else if (exp.inactive) {
			return '''((�program.generateProcessEnum(exp.process.name)� = �generateStopConstant�) OR (�program.generateProcessEnum(exp.process.name)� = �generateErrorConstant�))'''
		} else if (exp.stop) {
			return '''(�program.generateProcessEnum(exp.process.name)� = �generateStopConstant�)'''
		}
		return '''(�program.generateProcessEnum(exp.process.name)� = �generateErrorConstant�)'''
	}
	
	def String generateSignedInteger(SignedInteger sint) {
		return '''�IF sint.ISig�-�ENDIF��sint.value�''' 
	}
	
}
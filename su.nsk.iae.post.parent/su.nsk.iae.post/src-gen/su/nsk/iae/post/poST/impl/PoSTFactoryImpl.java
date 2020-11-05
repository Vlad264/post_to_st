/**
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.poST.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import su.nsk.iae.post.poST.AddExpression;
import su.nsk.iae.post.poST.AddOperator;
import su.nsk.iae.post.poST.AndExpression;
import su.nsk.iae.post.poST.ArrayInitialization;
import su.nsk.iae.post.poST.ArraySpecInit;
import su.nsk.iae.post.poST.ArraySpecification;
import su.nsk.iae.post.poST.ArrayVariable;
import su.nsk.iae.post.poST.AssignmentStatement;
import su.nsk.iae.post.poST.CaseElement;
import su.nsk.iae.post.poST.CaseList;
import su.nsk.iae.post.poST.CaseStatement;
import su.nsk.iae.post.poST.CompExpression;
import su.nsk.iae.post.poST.CompOperator;
import su.nsk.iae.post.poST.Constant;
import su.nsk.iae.post.poST.EquExpression;
import su.nsk.iae.post.poST.EquOperator;
import su.nsk.iae.post.poST.ErrorProcessStatement;
import su.nsk.iae.post.poST.ExitStatement;
import su.nsk.iae.post.poST.Expression;
import su.nsk.iae.post.poST.ExternalVarDeclaration;
import su.nsk.iae.post.poST.ExternalVarInitDeclaration;
import su.nsk.iae.post.poST.ForList;
import su.nsk.iae.post.poST.ForStatement;
import su.nsk.iae.post.poST.FunctionBlock;
import su.nsk.iae.post.poST.GlobalVarDeclaration;
import su.nsk.iae.post.poST.GlobalVarInitDeclaration;
import su.nsk.iae.post.poST.IfStatement;
import su.nsk.iae.post.poST.InputOutputVarDeclaration;
import su.nsk.iae.post.poST.InputVarDeclaration;
import su.nsk.iae.post.poST.IntegerLiteral;
import su.nsk.iae.post.poST.IterationStatement;
import su.nsk.iae.post.poST.Model;
import su.nsk.iae.post.poST.MulExpression;
import su.nsk.iae.post.poST.MulOperator;
import su.nsk.iae.post.poST.NumericLiteral;
import su.nsk.iae.post.poST.OutputVarDeclaration;
import su.nsk.iae.post.poST.PoSTFactory;
import su.nsk.iae.post.poST.PoSTPackage;
import su.nsk.iae.post.poST.PowerExpression;
import su.nsk.iae.post.poST.PrimaryExpression;
import su.nsk.iae.post.poST.ProcessStatements;
import su.nsk.iae.post.poST.ProcessStatusExpression;
import su.nsk.iae.post.poST.Program;
import su.nsk.iae.post.poST.RealLiteral;
import su.nsk.iae.post.poST.RepeatStatement;
import su.nsk.iae.post.poST.ResetTimerStatement;
import su.nsk.iae.post.poST.SelectionStatement;
import su.nsk.iae.post.poST.SetStateStatement;
import su.nsk.iae.post.poST.SignedInteger;
import su.nsk.iae.post.poST.SimpleSpecificationInit;
import su.nsk.iae.post.poST.StartProcessStatement;
import su.nsk.iae.post.poST.State;
import su.nsk.iae.post.poST.Statement;
import su.nsk.iae.post.poST.StatementList;
import su.nsk.iae.post.poST.StopProcessStatement;
import su.nsk.iae.post.poST.SubprogramControlStatement;
import su.nsk.iae.post.poST.SymbolicVariable;
import su.nsk.iae.post.poST.TempVarDeclaration;
import su.nsk.iae.post.poST.TimeLiteral;
import su.nsk.iae.post.poST.TimeoutStatement;
import su.nsk.iae.post.poST.UnaryExpression;
import su.nsk.iae.post.poST.UnaryOperator;
import su.nsk.iae.post.poST.VarDeclaration;
import su.nsk.iae.post.poST.VarInitDeclaration;
import su.nsk.iae.post.poST.VarList;
import su.nsk.iae.post.poST.WhileStatement;
import su.nsk.iae.post.poST.XorExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PoSTFactoryImpl extends EFactoryImpl implements PoSTFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PoSTFactory init()
  {
    try
    {
      PoSTFactory thePoSTFactory = (PoSTFactory)EPackage.Registry.INSTANCE.getEFactory(PoSTPackage.eNS_URI);
      if (thePoSTFactory != null)
      {
        return thePoSTFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PoSTFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PoSTFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PoSTPackage.MODEL: return createModel();
      case PoSTPackage.PROGRAM: return createProgram();
      case PoSTPackage.FUNCTION_BLOCK: return createFunctionBlock();
      case PoSTPackage.SET_STATE_STATEMENT: return createSetStateStatement();
      case PoSTPackage.PROCESS_STATEMENTS: return createProcessStatements();
      case PoSTPackage.PROCESS_STATUS_EXPRESSION: return createProcessStatusExpression();
      case PoSTPackage.START_PROCESS_STATEMENT: return createStartProcessStatement();
      case PoSTPackage.STOP_PROCESS_STATEMENT: return createStopProcessStatement();
      case PoSTPackage.ERROR_PROCESS_STATEMENT: return createErrorProcessStatement();
      case PoSTPackage.TIMEOUT_STATEMENT: return createTimeoutStatement();
      case PoSTPackage.RESET_TIMER_STATEMENT: return createResetTimerStatement();
      case PoSTPackage.PROCESS: return createProcess();
      case PoSTPackage.STATE: return createState();
      case PoSTPackage.EXPRESSION: return createExpression();
      case PoSTPackage.XOR_EXPRESSION: return createXorExpression();
      case PoSTPackage.AND_EXPRESSION: return createAndExpression();
      case PoSTPackage.COMP_EXPRESSION: return createCompExpression();
      case PoSTPackage.EQU_EXPRESSION: return createEquExpression();
      case PoSTPackage.ADD_EXPRESSION: return createAddExpression();
      case PoSTPackage.MUL_EXPRESSION: return createMulExpression();
      case PoSTPackage.POWER_EXPRESSION: return createPowerExpression();
      case PoSTPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case PoSTPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case PoSTPackage.STATEMENT_LIST: return createStatementList();
      case PoSTPackage.STATEMENT: return createStatement();
      case PoSTPackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
      case PoSTPackage.SELECTION_STATEMENT: return createSelectionStatement();
      case PoSTPackage.IF_STATEMENT: return createIfStatement();
      case PoSTPackage.CASE_STATEMENT: return createCaseStatement();
      case PoSTPackage.CASE_ELEMENT: return createCaseElement();
      case PoSTPackage.CASE_LIST: return createCaseList();
      case PoSTPackage.ITERATION_STATEMENT: return createIterationStatement();
      case PoSTPackage.FOR_STATEMENT: return createForStatement();
      case PoSTPackage.FOR_LIST: return createForList();
      case PoSTPackage.WHILE_STATEMENT: return createWhileStatement();
      case PoSTPackage.REPEAT_STATEMENT: return createRepeatStatement();
      case PoSTPackage.SUBPROGRAM_CONTROL_STATEMENT: return createSubprogramControlStatement();
      case PoSTPackage.EXIT_STATEMENT: return createExitStatement();
      case PoSTPackage.ARRAY_VARIABLE: return createArrayVariable();
      case PoSTPackage.SYMBOLIC_VARIABLE: return createSymbolicVariable();
      case PoSTPackage.VAR_INIT_DECLARATION: return createVarInitDeclaration();
      case PoSTPackage.VAR_LIST: return createVarList();
      case PoSTPackage.INPUT_VAR_DECLARATION: return createInputVarDeclaration();
      case PoSTPackage.OUTPUT_VAR_DECLARATION: return createOutputVarDeclaration();
      case PoSTPackage.INPUT_OUTPUT_VAR_DECLARATION: return createInputOutputVarDeclaration();
      case PoSTPackage.VAR_DECLARATION: return createVarDeclaration();
      case PoSTPackage.TEMP_VAR_DECLARATION: return createTempVarDeclaration();
      case PoSTPackage.EXTERNAL_VAR_DECLARATION: return createExternalVarDeclaration();
      case PoSTPackage.EXTERNAL_VAR_INIT_DECLARATION: return createExternalVarInitDeclaration();
      case PoSTPackage.GLOBAL_VAR_DECLARATION: return createGlobalVarDeclaration();
      case PoSTPackage.GLOBAL_VAR_INIT_DECLARATION: return createGlobalVarInitDeclaration();
      case PoSTPackage.ARRAY_SPEC_INIT: return createArraySpecInit();
      case PoSTPackage.ARRAY_SPECIFICATION: return createArraySpecification();
      case PoSTPackage.ARRAY_INITIALIZATION: return createArrayInitialization();
      case PoSTPackage.TIME_LITERAL: return createTimeLiteral();
      case PoSTPackage.SIMPLE_SPECIFICATION_INIT: return createSimpleSpecificationInit();
      case PoSTPackage.CONSTANT: return createConstant();
      case PoSTPackage.SIGNED_INTEGER: return createSignedInteger();
      case PoSTPackage.NUMERIC_LITERAL: return createNumericLiteral();
      case PoSTPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case PoSTPackage.REAL_LITERAL: return createRealLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PoSTPackage.COMP_OPERATOR:
        return createCompOperatorFromString(eDataType, initialValue);
      case PoSTPackage.EQU_OPERATOR:
        return createEquOperatorFromString(eDataType, initialValue);
      case PoSTPackage.ADD_OPERATOR:
        return createAddOperatorFromString(eDataType, initialValue);
      case PoSTPackage.MUL_OPERATOR:
        return createMulOperatorFromString(eDataType, initialValue);
      case PoSTPackage.UNARY_OPERATOR:
        return createUnaryOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PoSTPackage.COMP_OPERATOR:
        return convertCompOperatorToString(eDataType, instanceValue);
      case PoSTPackage.EQU_OPERATOR:
        return convertEquOperatorToString(eDataType, instanceValue);
      case PoSTPackage.ADD_OPERATOR:
        return convertAddOperatorToString(eDataType, instanceValue);
      case PoSTPackage.MUL_OPERATOR:
        return convertMulOperatorToString(eDataType, instanceValue);
      case PoSTPackage.UNARY_OPERATOR:
        return convertUnaryOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionBlock createFunctionBlock()
  {
    FunctionBlockImpl functionBlock = new FunctionBlockImpl();
    return functionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetStateStatement createSetStateStatement()
  {
    SetStateStatementImpl setStateStatement = new SetStateStatementImpl();
    return setStateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessStatements createProcessStatements()
  {
    ProcessStatementsImpl processStatements = new ProcessStatementsImpl();
    return processStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessStatusExpression createProcessStatusExpression()
  {
    ProcessStatusExpressionImpl processStatusExpression = new ProcessStatusExpressionImpl();
    return processStatusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StartProcessStatement createStartProcessStatement()
  {
    StartProcessStatementImpl startProcessStatement = new StartProcessStatementImpl();
    return startProcessStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StopProcessStatement createStopProcessStatement()
  {
    StopProcessStatementImpl stopProcessStatement = new StopProcessStatementImpl();
    return stopProcessStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ErrorProcessStatement createErrorProcessStatement()
  {
    ErrorProcessStatementImpl errorProcessStatement = new ErrorProcessStatementImpl();
    return errorProcessStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeoutStatement createTimeoutStatement()
  {
    TimeoutStatementImpl timeoutStatement = new TimeoutStatementImpl();
    return timeoutStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResetTimerStatement createResetTimerStatement()
  {
    ResetTimerStatementImpl resetTimerStatement = new ResetTimerStatementImpl();
    return resetTimerStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public su.nsk.iae.post.poST.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XorExpression createXorExpression()
  {
    XorExpressionImpl xorExpression = new XorExpressionImpl();
    return xorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompExpression createCompExpression()
  {
    CompExpressionImpl compExpression = new CompExpressionImpl();
    return compExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EquExpression createEquExpression()
  {
    EquExpressionImpl equExpression = new EquExpressionImpl();
    return equExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddExpression createAddExpression()
  {
    AddExpressionImpl addExpression = new AddExpressionImpl();
    return addExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MulExpression createMulExpression()
  {
    MulExpressionImpl mulExpression = new MulExpressionImpl();
    return mulExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PowerExpression createPowerExpression()
  {
    PowerExpressionImpl powerExpression = new PowerExpressionImpl();
    return powerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StatementList createStatementList()
  {
    StatementListImpl statementList = new StatementListImpl();
    return statementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssignmentStatement createAssignmentStatement()
  {
    AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
    return assignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectionStatement createSelectionStatement()
  {
    SelectionStatementImpl selectionStatement = new SelectionStatementImpl();
    return selectionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseStatement createCaseStatement()
  {
    CaseStatementImpl caseStatement = new CaseStatementImpl();
    return caseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseElement createCaseElement()
  {
    CaseElementImpl caseElement = new CaseElementImpl();
    return caseElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseList createCaseList()
  {
    CaseListImpl caseList = new CaseListImpl();
    return caseList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IterationStatement createIterationStatement()
  {
    IterationStatementImpl iterationStatement = new IterationStatementImpl();
    return iterationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForList createForList()
  {
    ForListImpl forList = new ForListImpl();
    return forList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RepeatStatement createRepeatStatement()
  {
    RepeatStatementImpl repeatStatement = new RepeatStatementImpl();
    return repeatStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubprogramControlStatement createSubprogramControlStatement()
  {
    SubprogramControlStatementImpl subprogramControlStatement = new SubprogramControlStatementImpl();
    return subprogramControlStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExitStatement createExitStatement()
  {
    ExitStatementImpl exitStatement = new ExitStatementImpl();
    return exitStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayVariable createArrayVariable()
  {
    ArrayVariableImpl arrayVariable = new ArrayVariableImpl();
    return arrayVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SymbolicVariable createSymbolicVariable()
  {
    SymbolicVariableImpl symbolicVariable = new SymbolicVariableImpl();
    return symbolicVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarInitDeclaration createVarInitDeclaration()
  {
    VarInitDeclarationImpl varInitDeclaration = new VarInitDeclarationImpl();
    return varInitDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarList createVarList()
  {
    VarListImpl varList = new VarListImpl();
    return varList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputVarDeclaration createInputVarDeclaration()
  {
    InputVarDeclarationImpl inputVarDeclaration = new InputVarDeclarationImpl();
    return inputVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OutputVarDeclaration createOutputVarDeclaration()
  {
    OutputVarDeclarationImpl outputVarDeclaration = new OutputVarDeclarationImpl();
    return outputVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputOutputVarDeclaration createInputOutputVarDeclaration()
  {
    InputOutputVarDeclarationImpl inputOutputVarDeclaration = new InputOutputVarDeclarationImpl();
    return inputOutputVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarDeclaration createVarDeclaration()
  {
    VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
    return varDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TempVarDeclaration createTempVarDeclaration()
  {
    TempVarDeclarationImpl tempVarDeclaration = new TempVarDeclarationImpl();
    return tempVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalVarDeclaration createExternalVarDeclaration()
  {
    ExternalVarDeclarationImpl externalVarDeclaration = new ExternalVarDeclarationImpl();
    return externalVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalVarInitDeclaration createExternalVarInitDeclaration()
  {
    ExternalVarInitDeclarationImpl externalVarInitDeclaration = new ExternalVarInitDeclarationImpl();
    return externalVarInitDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalVarDeclaration createGlobalVarDeclaration()
  {
    GlobalVarDeclarationImpl globalVarDeclaration = new GlobalVarDeclarationImpl();
    return globalVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalVarInitDeclaration createGlobalVarInitDeclaration()
  {
    GlobalVarInitDeclarationImpl globalVarInitDeclaration = new GlobalVarInitDeclarationImpl();
    return globalVarInitDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArraySpecInit createArraySpecInit()
  {
    ArraySpecInitImpl arraySpecInit = new ArraySpecInitImpl();
    return arraySpecInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArraySpecification createArraySpecification()
  {
    ArraySpecificationImpl arraySpecification = new ArraySpecificationImpl();
    return arraySpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayInitialization createArrayInitialization()
  {
    ArrayInitializationImpl arrayInitialization = new ArrayInitializationImpl();
    return arrayInitialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeLiteral createTimeLiteral()
  {
    TimeLiteralImpl timeLiteral = new TimeLiteralImpl();
    return timeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleSpecificationInit createSimpleSpecificationInit()
  {
    SimpleSpecificationInitImpl simpleSpecificationInit = new SimpleSpecificationInitImpl();
    return simpleSpecificationInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SignedInteger createSignedInteger()
  {
    SignedIntegerImpl signedInteger = new SignedIntegerImpl();
    return signedInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompOperator createCompOperatorFromString(EDataType eDataType, String initialValue)
  {
    CompOperator result = CompOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquOperator createEquOperatorFromString(EDataType eDataType, String initialValue)
  {
    EquOperator result = EquOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEquOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddOperator createAddOperatorFromString(EDataType eDataType, String initialValue)
  {
    AddOperator result = AddOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAddOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulOperator createMulOperatorFromString(EDataType eDataType, String initialValue)
  {
    MulOperator result = MulOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMulOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue)
  {
    UnaryOperator result = UnaryOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PoSTPackage getPoSTPackage()
  {
    return (PoSTPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PoSTPackage getPackage()
  {
    return PoSTPackage.eINSTANCE;
  }

} //PoSTFactoryImpl

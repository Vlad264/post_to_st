/**
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.poST;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mul Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.MulExpression#getMulOp <em>Mul Op</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getMulExpression()
 * @model
 * @generated
 */
public interface MulExpression extends AddExpression
{
  /**
   * Returns the value of the '<em><b>Mul Op</b></em>' attribute.
   * The literals are from the enumeration {@link su.nsk.iae.post.poST.MulOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mul Op</em>' attribute.
   * @see su.nsk.iae.post.poST.MulOperator
   * @see #setMulOp(MulOperator)
   * @see su.nsk.iae.post.poST.PoSTPackage#getMulExpression_MulOp()
   * @model
   * @generated
   */
  MulOperator getMulOp();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.MulExpression#getMulOp <em>Mul Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mul Op</em>' attribute.
   * @see su.nsk.iae.post.poST.MulOperator
   * @see #getMulOp()
   * @generated
   */
  void setMulOp(MulOperator value);

} // MulExpression

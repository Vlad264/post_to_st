/**
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.poST;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.UnaryExpression#getUnOp <em>Un Op</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends PowerExpression
{
  /**
   * Returns the value of the '<em><b>Un Op</b></em>' attribute.
   * The literals are from the enumeration {@link su.nsk.iae.post.poST.UnaryOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Un Op</em>' attribute.
   * @see su.nsk.iae.post.poST.UnaryOperator
   * @see #setUnOp(UnaryOperator)
   * @see su.nsk.iae.post.poST.PoSTPackage#getUnaryExpression_UnOp()
   * @model
   * @generated
   */
  UnaryOperator getUnOp();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.UnaryExpression#getUnOp <em>Un Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Un Op</em>' attribute.
   * @see su.nsk.iae.post.poST.UnaryOperator
   * @see #getUnOp()
   * @generated
   */
  void setUnOp(UnaryOperator value);

} // UnaryExpression

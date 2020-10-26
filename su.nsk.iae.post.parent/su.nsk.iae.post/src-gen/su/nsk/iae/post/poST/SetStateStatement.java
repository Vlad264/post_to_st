/**
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.poST;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set State Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.SetStateStatement#getState <em>State</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.SetStateStatement#isNext <em>Next</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getSetStateStatement()
 * @model
 * @generated
 */
public interface SetStateStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see su.nsk.iae.post.poST.PoSTPackage#getSetStateStatement_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.SetStateStatement#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' attribute.
   * @see #setNext(boolean)
   * @see su.nsk.iae.post.poST.PoSTPackage#getSetStateStatement_Next()
   * @model
   * @generated
   */
  boolean isNext();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.SetStateStatement#isNext <em>Next</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' attribute.
   * @see #isNext()
   * @generated
   */
  void setNext(boolean value);

} // SetStateStatement

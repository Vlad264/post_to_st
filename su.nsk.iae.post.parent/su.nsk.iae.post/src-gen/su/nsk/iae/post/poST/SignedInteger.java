/**
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signed Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.SignedInteger#isISig <em>ISig</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.SignedInteger#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getSignedInteger()
 * @model
 * @generated
 */
public interface SignedInteger extends EObject
{
  /**
   * Returns the value of the '<em><b>ISig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>ISig</em>' attribute.
   * @see #setISig(boolean)
   * @see su.nsk.iae.post.poST.PoSTPackage#getSignedInteger_ISig()
   * @model
   * @generated
   */
  boolean isISig();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.SignedInteger#isISig <em>ISig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ISig</em>' attribute.
   * @see #isISig()
   * @generated
   */
  void setISig(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see su.nsk.iae.post.poST.PoSTPackage#getSignedInteger_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.SignedInteger#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // SignedInteger

/**
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Spec Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.ArraySpecInit#getInit <em>Init</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.ArraySpecInit#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getArraySpecInit()
 * @model
 * @generated
 */
public interface ArraySpecInit extends EObject
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(ArraySpecification)
   * @see su.nsk.iae.post.poST.PoSTPackage#getArraySpecInit_Init()
   * @model containment="true"
   * @generated
   */
  ArraySpecification getInit();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.ArraySpecInit#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(ArraySpecification value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference.
   * @see #setValues(ArrayInitialization)
   * @see su.nsk.iae.post.poST.PoSTPackage#getArraySpecInit_Values()
   * @model containment="true"
   * @generated
   */
  ArrayInitialization getValues();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.ArraySpecInit#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(ArrayInitialization value);

} // ArraySpecInit

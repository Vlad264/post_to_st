/**
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.ArrayInitialization#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getArrayInitialization()
 * @model
 * @generated
 */
public interface ArrayInitialization extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link su.nsk.iae.post.poST.Constant}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see su.nsk.iae.post.poST.PoSTPackage#getArrayInitialization_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Constant> getElements();

} // ArrayInitialization
/**
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Init Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.VarInitDeclaration#getVarList <em>Var List</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.VarInitDeclaration#getSpec <em>Spec</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.VarInitDeclaration#getArrSpec <em>Arr Spec</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getVarInitDeclaration()
 * @model
 * @generated
 */
public interface VarInitDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Var List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var List</em>' containment reference.
   * @see #setVarList(VarList)
   * @see su.nsk.iae.post.poST.PoSTPackage#getVarInitDeclaration_VarList()
   * @model containment="true"
   * @generated
   */
  VarList getVarList();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.VarInitDeclaration#getVarList <em>Var List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var List</em>' containment reference.
   * @see #getVarList()
   * @generated
   */
  void setVarList(VarList value);

  /**
   * Returns the value of the '<em><b>Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec</em>' containment reference.
   * @see #setSpec(SimpleSpecificationInit)
   * @see su.nsk.iae.post.poST.PoSTPackage#getVarInitDeclaration_Spec()
   * @model containment="true"
   * @generated
   */
  SimpleSpecificationInit getSpec();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.VarInitDeclaration#getSpec <em>Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spec</em>' containment reference.
   * @see #getSpec()
   * @generated
   */
  void setSpec(SimpleSpecificationInit value);

  /**
   * Returns the value of the '<em><b>Arr Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arr Spec</em>' containment reference.
   * @see #setArrSpec(ArraySpecInit)
   * @see su.nsk.iae.post.poST.PoSTPackage#getVarInitDeclaration_ArrSpec()
   * @model containment="true"
   * @generated
   */
  ArraySpecInit getArrSpec();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.VarInitDeclaration#getArrSpec <em>Arr Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arr Spec</em>' containment reference.
   * @see #getArrSpec()
   * @generated
   */
  void setArrSpec(ArraySpecInit value);

} // VarInitDeclaration
/**
 * generated by Xtext 2.23.0
 */
package su.nsk.iae.post.poST.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import su.nsk.iae.post.poST.AddExpression;
import su.nsk.iae.post.poST.AddOperator;
import su.nsk.iae.post.poST.PoSTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.impl.AddExpressionImpl#getAddOp <em>Add Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddExpressionImpl extends EquExpressionImpl implements AddExpression
{
  /**
   * The default value of the '{@link #getAddOp() <em>Add Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddOp()
   * @generated
   * @ordered
   */
  protected static final AddOperator ADD_OP_EDEFAULT = AddOperator.PLUS;

  /**
   * The cached value of the '{@link #getAddOp() <em>Add Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddOp()
   * @generated
   * @ordered
   */
  protected AddOperator addOp = ADD_OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PoSTPackage.Literals.ADD_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddOperator getAddOp()
  {
    return addOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAddOp(AddOperator newAddOp)
  {
    AddOperator oldAddOp = addOp;
    addOp = newAddOp == null ? ADD_OP_EDEFAULT : newAddOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.ADD_EXPRESSION__ADD_OP, oldAddOp, addOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PoSTPackage.ADD_EXPRESSION__ADD_OP:
        return getAddOp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PoSTPackage.ADD_EXPRESSION__ADD_OP:
        setAddOp((AddOperator)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PoSTPackage.ADD_EXPRESSION__ADD_OP:
        setAddOp(ADD_OP_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PoSTPackage.ADD_EXPRESSION__ADD_OP:
        return addOp != ADD_OP_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (addOp: ");
    result.append(addOp);
    result.append(')');
    return result.toString();
  }

} //AddExpressionImpl

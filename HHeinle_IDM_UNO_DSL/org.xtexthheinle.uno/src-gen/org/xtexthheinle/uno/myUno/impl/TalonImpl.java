/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtexthheinle.uno.myUno.MyUnoPackage;
import org.xtexthheinle.uno.myUno.Nb_Talons;
import org.xtexthheinle.uno.myUno.Talon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Talon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.TalonImpl#getNb_talons <em>Nb talons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TalonImpl extends MinimalEObjectImpl.Container implements Talon
{
  /**
   * The default value of the '{@link #getNb_talons() <em>Nb talons</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb_talons()
   * @generated
   * @ordered
   */
  protected static final Nb_Talons NB_TALONS_EDEFAULT = Nb_Talons.UN_TALON;

  /**
   * The cached value of the '{@link #getNb_talons() <em>Nb talons</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb_talons()
   * @generated
   * @ordered
   */
  protected Nb_Talons nb_talons = NB_TALONS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TalonImpl()
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
    return MyUnoPackage.Literals.TALON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nb_Talons getNb_talons()
  {
    return nb_talons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNb_talons(Nb_Talons newNb_talons)
  {
    Nb_Talons oldNb_talons = nb_talons;
    nb_talons = newNb_talons == null ? NB_TALONS_EDEFAULT : newNb_talons;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.TALON__NB_TALONS, oldNb_talons, nb_talons));
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
      case MyUnoPackage.TALON__NB_TALONS:
        return getNb_talons();
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
      case MyUnoPackage.TALON__NB_TALONS:
        setNb_talons((Nb_Talons)newValue);
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
      case MyUnoPackage.TALON__NB_TALONS:
        setNb_talons(NB_TALONS_EDEFAULT);
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
      case MyUnoPackage.TALON__NB_TALONS:
        return nb_talons != NB_TALONS_EDEFAULT;
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
    result.append(" (nb_talons: ");
    result.append(nb_talons);
    result.append(')');
    return result.toString();
  }

} //TalonImpl

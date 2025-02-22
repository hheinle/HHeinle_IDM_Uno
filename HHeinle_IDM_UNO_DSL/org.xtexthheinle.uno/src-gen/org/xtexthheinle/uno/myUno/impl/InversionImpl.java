/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtexthheinle.uno.myUno.Inversion;
import org.xtexthheinle.uno.myUno.MyUnoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.InversionImpl#getAvec_carte_inversion <em>Avec carte inversion</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.InversionImpl#getAvec_carte_sept <em>Avec carte sept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InversionImpl extends MinimalEObjectImpl.Container implements Inversion
{
  /**
   * The default value of the '{@link #getAvec_carte_inversion() <em>Avec carte inversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvec_carte_inversion()
   * @generated
   * @ordered
   */
  protected static final String AVEC_CARTE_INVERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAvec_carte_inversion() <em>Avec carte inversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvec_carte_inversion()
   * @generated
   * @ordered
   */
  protected String avec_carte_inversion = AVEC_CARTE_INVERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getAvec_carte_sept() <em>Avec carte sept</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvec_carte_sept()
   * @generated
   * @ordered
   */
  protected static final String AVEC_CARTE_SEPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAvec_carte_sept() <em>Avec carte sept</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvec_carte_sept()
   * @generated
   * @ordered
   */
  protected String avec_carte_sept = AVEC_CARTE_SEPT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InversionImpl()
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
    return MyUnoPackage.Literals.INVERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAvec_carte_inversion()
  {
    return avec_carte_inversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAvec_carte_inversion(String newAvec_carte_inversion)
  {
    String oldAvec_carte_inversion = avec_carte_inversion;
    avec_carte_inversion = newAvec_carte_inversion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.INVERSION__AVEC_CARTE_INVERSION, oldAvec_carte_inversion, avec_carte_inversion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAvec_carte_sept()
  {
    return avec_carte_sept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAvec_carte_sept(String newAvec_carte_sept)
  {
    String oldAvec_carte_sept = avec_carte_sept;
    avec_carte_sept = newAvec_carte_sept;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.INVERSION__AVEC_CARTE_SEPT, oldAvec_carte_sept, avec_carte_sept));
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
      case MyUnoPackage.INVERSION__AVEC_CARTE_INVERSION:
        return getAvec_carte_inversion();
      case MyUnoPackage.INVERSION__AVEC_CARTE_SEPT:
        return getAvec_carte_sept();
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
      case MyUnoPackage.INVERSION__AVEC_CARTE_INVERSION:
        setAvec_carte_inversion((String)newValue);
        return;
      case MyUnoPackage.INVERSION__AVEC_CARTE_SEPT:
        setAvec_carte_sept((String)newValue);
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
      case MyUnoPackage.INVERSION__AVEC_CARTE_INVERSION:
        setAvec_carte_inversion(AVEC_CARTE_INVERSION_EDEFAULT);
        return;
      case MyUnoPackage.INVERSION__AVEC_CARTE_SEPT:
        setAvec_carte_sept(AVEC_CARTE_SEPT_EDEFAULT);
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
      case MyUnoPackage.INVERSION__AVEC_CARTE_INVERSION:
        return AVEC_CARTE_INVERSION_EDEFAULT == null ? avec_carte_inversion != null : !AVEC_CARTE_INVERSION_EDEFAULT.equals(avec_carte_inversion);
      case MyUnoPackage.INVERSION__AVEC_CARTE_SEPT:
        return AVEC_CARTE_SEPT_EDEFAULT == null ? avec_carte_sept != null : !AVEC_CARTE_SEPT_EDEFAULT.equals(avec_carte_sept);
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
    result.append(" (avec_carte_inversion: ");
    result.append(avec_carte_inversion);
    result.append(", avec_carte_sept: ");
    result.append(avec_carte_sept);
    result.append(')');
    return result.toString();
  }

} //InversionImpl

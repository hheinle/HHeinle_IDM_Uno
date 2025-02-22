/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtexthheinle.uno.myUno.Etat_Main;
import org.xtexthheinle.uno.myUno.Main;
import org.xtexthheinle.uno.myUno.MyUnoPackage;
import org.xtexthheinle.uno.myUno.Nb_Cartes_Mains;
import org.xtexthheinle.uno.myUno.Nb_Mains;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MainImpl#getEtat_main <em>Etat main</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MainImpl#getNb_mains <em>Nb mains</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MainImpl#getNb_cartes_mains <em>Nb cartes mains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainImpl extends MinimalEObjectImpl.Container implements Main
{
  /**
   * The default value of the '{@link #getEtat_main() <em>Etat main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtat_main()
   * @generated
   * @ordered
   */
  protected static final Etat_Main ETAT_MAIN_EDEFAULT = Etat_Main.VISIBLE;

  /**
   * The cached value of the '{@link #getEtat_main() <em>Etat main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtat_main()
   * @generated
   * @ordered
   */
  protected Etat_Main etat_main = ETAT_MAIN_EDEFAULT;

  /**
   * The default value of the '{@link #getNb_mains() <em>Nb mains</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb_mains()
   * @generated
   * @ordered
   */
  protected static final Nb_Mains NB_MAINS_EDEFAULT = Nb_Mains.UNE_MAIN;

  /**
   * The cached value of the '{@link #getNb_mains() <em>Nb mains</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb_mains()
   * @generated
   * @ordered
   */
  protected Nb_Mains nb_mains = NB_MAINS_EDEFAULT;

  /**
   * The default value of the '{@link #getNb_cartes_mains() <em>Nb cartes mains</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb_cartes_mains()
   * @generated
   * @ordered
   */
  protected static final Nb_Cartes_Mains NB_CARTES_MAINS_EDEFAULT = Nb_Cartes_Mains.SEPT_CARTES;

  /**
   * The cached value of the '{@link #getNb_cartes_mains() <em>Nb cartes mains</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb_cartes_mains()
   * @generated
   * @ordered
   */
  protected Nb_Cartes_Mains nb_cartes_mains = NB_CARTES_MAINS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainImpl()
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
    return MyUnoPackage.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Etat_Main getEtat_main()
  {
    return etat_main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEtat_main(Etat_Main newEtat_main)
  {
    Etat_Main oldEtat_main = etat_main;
    etat_main = newEtat_main == null ? ETAT_MAIN_EDEFAULT : newEtat_main;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MAIN__ETAT_MAIN, oldEtat_main, etat_main));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nb_Mains getNb_mains()
  {
    return nb_mains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNb_mains(Nb_Mains newNb_mains)
  {
    Nb_Mains oldNb_mains = nb_mains;
    nb_mains = newNb_mains == null ? NB_MAINS_EDEFAULT : newNb_mains;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MAIN__NB_MAINS, oldNb_mains, nb_mains));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nb_Cartes_Mains getNb_cartes_mains()
  {
    return nb_cartes_mains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNb_cartes_mains(Nb_Cartes_Mains newNb_cartes_mains)
  {
    Nb_Cartes_Mains oldNb_cartes_mains = nb_cartes_mains;
    nb_cartes_mains = newNb_cartes_mains == null ? NB_CARTES_MAINS_EDEFAULT : newNb_cartes_mains;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MAIN__NB_CARTES_MAINS, oldNb_cartes_mains, nb_cartes_mains));
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
      case MyUnoPackage.MAIN__ETAT_MAIN:
        return getEtat_main();
      case MyUnoPackage.MAIN__NB_MAINS:
        return getNb_mains();
      case MyUnoPackage.MAIN__NB_CARTES_MAINS:
        return getNb_cartes_mains();
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
      case MyUnoPackage.MAIN__ETAT_MAIN:
        setEtat_main((Etat_Main)newValue);
        return;
      case MyUnoPackage.MAIN__NB_MAINS:
        setNb_mains((Nb_Mains)newValue);
        return;
      case MyUnoPackage.MAIN__NB_CARTES_MAINS:
        setNb_cartes_mains((Nb_Cartes_Mains)newValue);
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
      case MyUnoPackage.MAIN__ETAT_MAIN:
        setEtat_main(ETAT_MAIN_EDEFAULT);
        return;
      case MyUnoPackage.MAIN__NB_MAINS:
        setNb_mains(NB_MAINS_EDEFAULT);
        return;
      case MyUnoPackage.MAIN__NB_CARTES_MAINS:
        setNb_cartes_mains(NB_CARTES_MAINS_EDEFAULT);
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
      case MyUnoPackage.MAIN__ETAT_MAIN:
        return etat_main != ETAT_MAIN_EDEFAULT;
      case MyUnoPackage.MAIN__NB_MAINS:
        return nb_mains != NB_MAINS_EDEFAULT;
      case MyUnoPackage.MAIN__NB_CARTES_MAINS:
        return nb_cartes_mains != NB_CARTES_MAINS_EDEFAULT;
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
    result.append(" (etat_main: ");
    result.append(etat_main);
    result.append(", nb_mains: ");
    result.append(nb_mains);
    result.append(", nb_cartes_mains: ");
    result.append(nb_cartes_mains);
    result.append(')');
    return result.toString();
  }

} //MainImpl

/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtexthheinle.uno.myUno.Cartes_1_9;
import org.xtexthheinle.uno.myUno.Contestations;
import org.xtexthheinle.uno.myUno.Cumul;
import org.xtexthheinle.uno.myUno.Inversion;
import org.xtexthheinle.uno.myUno.Manche;
import org.xtexthheinle.uno.myUno.MyUnoPackage;
import org.xtexthheinle.uno.myUno.Nb_cartes_jouables;
import org.xtexthheinle.uno.myUno.Pioche;
import org.xtexthheinle.uno.myUno.Tourner_les_mains;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MancheImpl#getInversion <em>Inversion</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MancheImpl#getTourner_les_mains <em>Tourner les mains</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MancheImpl#getNb_cartes_jouables <em>Nb cartes jouables</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MancheImpl#getCartes_1_9 <em>Cartes 19</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MancheImpl#getPioche <em>Pioche</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MancheImpl#getCumul <em>Cumul</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.impl.MancheImpl#getContestations <em>Contestations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MancheImpl extends MinimalEObjectImpl.Container implements Manche
{
  /**
   * The cached value of the '{@link #getInversion() <em>Inversion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInversion()
   * @generated
   * @ordered
   */
  protected Inversion inversion;

  /**
   * The cached value of the '{@link #getTourner_les_mains() <em>Tourner les mains</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTourner_les_mains()
   * @generated
   * @ordered
   */
  protected Tourner_les_mains tourner_les_mains;

  /**
   * The default value of the '{@link #getNb_cartes_jouables() <em>Nb cartes jouables</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb_cartes_jouables()
   * @generated
   * @ordered
   */
  protected static final Nb_cartes_jouables NB_CARTES_JOUABLES_EDEFAULT = Nb_cartes_jouables.UNE_PAR_UNE;

  /**
   * The cached value of the '{@link #getNb_cartes_jouables() <em>Nb cartes jouables</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNb_cartes_jouables()
   * @generated
   * @ordered
   */
  protected Nb_cartes_jouables nb_cartes_jouables = NB_CARTES_JOUABLES_EDEFAULT;

  /**
   * The cached value of the '{@link #getCartes_1_9() <em>Cartes 19</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCartes_1_9()
   * @generated
   * @ordered
   */
  protected Cartes_1_9 cartes_1_9;

  /**
   * The cached value of the '{@link #getPioche() <em>Pioche</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPioche()
   * @generated
   * @ordered
   */
  protected Pioche pioche;

  /**
   * The cached value of the '{@link #getCumul() <em>Cumul</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCumul()
   * @generated
   * @ordered
   */
  protected Cumul cumul;

  /**
   * The cached value of the '{@link #getContestations() <em>Contestations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContestations()
   * @generated
   * @ordered
   */
  protected Contestations contestations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MancheImpl()
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
    return MyUnoPackage.Literals.MANCHE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inversion getInversion()
  {
    return inversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInversion(Inversion newInversion, NotificationChain msgs)
  {
    Inversion oldInversion = inversion;
    inversion = newInversion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__INVERSION, oldInversion, newInversion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInversion(Inversion newInversion)
  {
    if (newInversion != inversion)
    {
      NotificationChain msgs = null;
      if (inversion != null)
        msgs = ((InternalEObject)inversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__INVERSION, null, msgs);
      if (newInversion != null)
        msgs = ((InternalEObject)newInversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__INVERSION, null, msgs);
      msgs = basicSetInversion(newInversion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__INVERSION, newInversion, newInversion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tourner_les_mains getTourner_les_mains()
  {
    return tourner_les_mains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTourner_les_mains(Tourner_les_mains newTourner_les_mains, NotificationChain msgs)
  {
    Tourner_les_mains oldTourner_les_mains = tourner_les_mains;
    tourner_les_mains = newTourner_les_mains;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__TOURNER_LES_MAINS, oldTourner_les_mains, newTourner_les_mains);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTourner_les_mains(Tourner_les_mains newTourner_les_mains)
  {
    if (newTourner_les_mains != tourner_les_mains)
    {
      NotificationChain msgs = null;
      if (tourner_les_mains != null)
        msgs = ((InternalEObject)tourner_les_mains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__TOURNER_LES_MAINS, null, msgs);
      if (newTourner_les_mains != null)
        msgs = ((InternalEObject)newTourner_les_mains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__TOURNER_LES_MAINS, null, msgs);
      msgs = basicSetTourner_les_mains(newTourner_les_mains, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__TOURNER_LES_MAINS, newTourner_les_mains, newTourner_les_mains));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nb_cartes_jouables getNb_cartes_jouables()
  {
    return nb_cartes_jouables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNb_cartes_jouables(Nb_cartes_jouables newNb_cartes_jouables)
  {
    Nb_cartes_jouables oldNb_cartes_jouables = nb_cartes_jouables;
    nb_cartes_jouables = newNb_cartes_jouables == null ? NB_CARTES_JOUABLES_EDEFAULT : newNb_cartes_jouables;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__NB_CARTES_JOUABLES, oldNb_cartes_jouables, nb_cartes_jouables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cartes_1_9 getCartes_1_9()
  {
    return cartes_1_9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCartes_1_9(Cartes_1_9 newCartes_1_9, NotificationChain msgs)
  {
    Cartes_1_9 oldCartes_1_9 = cartes_1_9;
    cartes_1_9 = newCartes_1_9;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__CARTES_19, oldCartes_1_9, newCartes_1_9);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCartes_1_9(Cartes_1_9 newCartes_1_9)
  {
    if (newCartes_1_9 != cartes_1_9)
    {
      NotificationChain msgs = null;
      if (cartes_1_9 != null)
        msgs = ((InternalEObject)cartes_1_9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__CARTES_19, null, msgs);
      if (newCartes_1_9 != null)
        msgs = ((InternalEObject)newCartes_1_9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__CARTES_19, null, msgs);
      msgs = basicSetCartes_1_9(newCartes_1_9, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__CARTES_19, newCartes_1_9, newCartes_1_9));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pioche getPioche()
  {
    return pioche;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPioche(Pioche newPioche, NotificationChain msgs)
  {
    Pioche oldPioche = pioche;
    pioche = newPioche;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__PIOCHE, oldPioche, newPioche);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPioche(Pioche newPioche)
  {
    if (newPioche != pioche)
    {
      NotificationChain msgs = null;
      if (pioche != null)
        msgs = ((InternalEObject)pioche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__PIOCHE, null, msgs);
      if (newPioche != null)
        msgs = ((InternalEObject)newPioche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__PIOCHE, null, msgs);
      msgs = basicSetPioche(newPioche, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__PIOCHE, newPioche, newPioche));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cumul getCumul()
  {
    return cumul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCumul(Cumul newCumul, NotificationChain msgs)
  {
    Cumul oldCumul = cumul;
    cumul = newCumul;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__CUMUL, oldCumul, newCumul);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCumul(Cumul newCumul)
  {
    if (newCumul != cumul)
    {
      NotificationChain msgs = null;
      if (cumul != null)
        msgs = ((InternalEObject)cumul).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__CUMUL, null, msgs);
      if (newCumul != null)
        msgs = ((InternalEObject)newCumul).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__CUMUL, null, msgs);
      msgs = basicSetCumul(newCumul, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__CUMUL, newCumul, newCumul));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Contestations getContestations()
  {
    return contestations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContestations(Contestations newContestations, NotificationChain msgs)
  {
    Contestations oldContestations = contestations;
    contestations = newContestations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__CONTESTATIONS, oldContestations, newContestations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContestations(Contestations newContestations)
  {
    if (newContestations != contestations)
    {
      NotificationChain msgs = null;
      if (contestations != null)
        msgs = ((InternalEObject)contestations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__CONTESTATIONS, null, msgs);
      if (newContestations != null)
        msgs = ((InternalEObject)newContestations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUnoPackage.MANCHE__CONTESTATIONS, null, msgs);
      msgs = basicSetContestations(newContestations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoPackage.MANCHE__CONTESTATIONS, newContestations, newContestations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyUnoPackage.MANCHE__INVERSION:
        return basicSetInversion(null, msgs);
      case MyUnoPackage.MANCHE__TOURNER_LES_MAINS:
        return basicSetTourner_les_mains(null, msgs);
      case MyUnoPackage.MANCHE__CARTES_19:
        return basicSetCartes_1_9(null, msgs);
      case MyUnoPackage.MANCHE__PIOCHE:
        return basicSetPioche(null, msgs);
      case MyUnoPackage.MANCHE__CUMUL:
        return basicSetCumul(null, msgs);
      case MyUnoPackage.MANCHE__CONTESTATIONS:
        return basicSetContestations(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyUnoPackage.MANCHE__INVERSION:
        return getInversion();
      case MyUnoPackage.MANCHE__TOURNER_LES_MAINS:
        return getTourner_les_mains();
      case MyUnoPackage.MANCHE__NB_CARTES_JOUABLES:
        return getNb_cartes_jouables();
      case MyUnoPackage.MANCHE__CARTES_19:
        return getCartes_1_9();
      case MyUnoPackage.MANCHE__PIOCHE:
        return getPioche();
      case MyUnoPackage.MANCHE__CUMUL:
        return getCumul();
      case MyUnoPackage.MANCHE__CONTESTATIONS:
        return getContestations();
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
      case MyUnoPackage.MANCHE__INVERSION:
        setInversion((Inversion)newValue);
        return;
      case MyUnoPackage.MANCHE__TOURNER_LES_MAINS:
        setTourner_les_mains((Tourner_les_mains)newValue);
        return;
      case MyUnoPackage.MANCHE__NB_CARTES_JOUABLES:
        setNb_cartes_jouables((Nb_cartes_jouables)newValue);
        return;
      case MyUnoPackage.MANCHE__CARTES_19:
        setCartes_1_9((Cartes_1_9)newValue);
        return;
      case MyUnoPackage.MANCHE__PIOCHE:
        setPioche((Pioche)newValue);
        return;
      case MyUnoPackage.MANCHE__CUMUL:
        setCumul((Cumul)newValue);
        return;
      case MyUnoPackage.MANCHE__CONTESTATIONS:
        setContestations((Contestations)newValue);
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
      case MyUnoPackage.MANCHE__INVERSION:
        setInversion((Inversion)null);
        return;
      case MyUnoPackage.MANCHE__TOURNER_LES_MAINS:
        setTourner_les_mains((Tourner_les_mains)null);
        return;
      case MyUnoPackage.MANCHE__NB_CARTES_JOUABLES:
        setNb_cartes_jouables(NB_CARTES_JOUABLES_EDEFAULT);
        return;
      case MyUnoPackage.MANCHE__CARTES_19:
        setCartes_1_9((Cartes_1_9)null);
        return;
      case MyUnoPackage.MANCHE__PIOCHE:
        setPioche((Pioche)null);
        return;
      case MyUnoPackage.MANCHE__CUMUL:
        setCumul((Cumul)null);
        return;
      case MyUnoPackage.MANCHE__CONTESTATIONS:
        setContestations((Contestations)null);
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
      case MyUnoPackage.MANCHE__INVERSION:
        return inversion != null;
      case MyUnoPackage.MANCHE__TOURNER_LES_MAINS:
        return tourner_les_mains != null;
      case MyUnoPackage.MANCHE__NB_CARTES_JOUABLES:
        return nb_cartes_jouables != NB_CARTES_JOUABLES_EDEFAULT;
      case MyUnoPackage.MANCHE__CARTES_19:
        return cartes_1_9 != null;
      case MyUnoPackage.MANCHE__PIOCHE:
        return pioche != null;
      case MyUnoPackage.MANCHE__CUMUL:
        return cumul != null;
      case MyUnoPackage.MANCHE__CONTESTATIONS:
        return contestations != null;
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
    result.append(" (nb_cartes_jouables: ");
    result.append(nb_cartes_jouables);
    result.append(')');
    return result.toString();
  }

} //MancheImpl

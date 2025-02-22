/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtexthheinle.uno.myUno.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyUnoFactoryImpl extends EFactoryImpl implements MyUnoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyUnoFactory init()
  {
    try
    {
      MyUnoFactory theMyUnoFactory = (MyUnoFactory)EPackage.Registry.INSTANCE.getEFactory(MyUnoPackage.eNS_URI);
      if (theMyUnoFactory != null)
      {
        return theMyUnoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyUnoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyUnoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyUnoPackage.VARIANTE_UNO: return createVariante_UNO();
      case MyUnoPackage.CONFIGURATION_DEPART: return createConfiguration_Depart();
      case MyUnoPackage.MAIN: return createMain();
      case MyUnoPackage.TALON: return createTalon();
      case MyUnoPackage.MANCHE: return createManche();
      case MyUnoPackage.INVERSION: return createInversion();
      case MyUnoPackage.TOURNER_LES_MAINS: return createTourner_les_mains();
      case MyUnoPackage.CARTES_19: return createCartes_1_9();
      case MyUnoPackage.PIOCHE: return createPioche();
      case MyUnoPackage.CUMUL: return createCumul();
      case MyUnoPackage.CONTESTATIONS: return createContestations();
      case MyUnoPackage.FIN_MANCHE: return createFin_Manche();
      case MyUnoPackage.POINTS_MANCHE: return createPoints_manche();
      case MyUnoPackage.PERDANTS_MANCHE: return createPerdants_manche();
      case MyUnoPackage.FIN_PARTIE: return createFin_Partie();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyUnoPackage.ETAT_MAIN:
        return createEtat_MainFromString(eDataType, initialValue);
      case MyUnoPackage.NB_MAINS:
        return createNb_MainsFromString(eDataType, initialValue);
      case MyUnoPackage.NB_CARTES_MAINS:
        return createNb_Cartes_MainsFromString(eDataType, initialValue);
      case MyUnoPackage.NB_TALONS:
        return createNb_TalonsFromString(eDataType, initialValue);
      case MyUnoPackage.NB_CARTES_JOUABLES:
        return createNb_cartes_jouablesFromString(eDataType, initialValue);
      case MyUnoPackage.INTERCEPTION:
        return createInterceptionFromString(eDataType, initialValue);
      case MyUnoPackage.NB_CARTES_APIOCHER:
        return createNb_cartes_a_piocherFromString(eDataType, initialValue);
      case MyUnoPackage.JOUER_APRES_PIOCHE:
        return createJouer_apres_piocheFromString(eDataType, initialValue);
      case MyUnoPackage.VAINQUEUR_MANCHE:
        return createVainqueur_mancheFromString(eDataType, initialValue);
      case MyUnoPackage.VAINQUEUR_TOTAL:
        return createVainqueur_totalFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyUnoPackage.ETAT_MAIN:
        return convertEtat_MainToString(eDataType, instanceValue);
      case MyUnoPackage.NB_MAINS:
        return convertNb_MainsToString(eDataType, instanceValue);
      case MyUnoPackage.NB_CARTES_MAINS:
        return convertNb_Cartes_MainsToString(eDataType, instanceValue);
      case MyUnoPackage.NB_TALONS:
        return convertNb_TalonsToString(eDataType, instanceValue);
      case MyUnoPackage.NB_CARTES_JOUABLES:
        return convertNb_cartes_jouablesToString(eDataType, instanceValue);
      case MyUnoPackage.INTERCEPTION:
        return convertInterceptionToString(eDataType, instanceValue);
      case MyUnoPackage.NB_CARTES_APIOCHER:
        return convertNb_cartes_a_piocherToString(eDataType, instanceValue);
      case MyUnoPackage.JOUER_APRES_PIOCHE:
        return convertJouer_apres_piocheToString(eDataType, instanceValue);
      case MyUnoPackage.VAINQUEUR_MANCHE:
        return convertVainqueur_mancheToString(eDataType, instanceValue);
      case MyUnoPackage.VAINQUEUR_TOTAL:
        return convertVainqueur_totalToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variante_UNO createVariante_UNO()
  {
    Variante_UNOImpl variante_UNO = new Variante_UNOImpl();
    return variante_UNO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Configuration_Depart createConfiguration_Depart()
  {
    Configuration_DepartImpl configuration_Depart = new Configuration_DepartImpl();
    return configuration_Depart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Talon createTalon()
  {
    TalonImpl talon = new TalonImpl();
    return talon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Manche createManche()
  {
    MancheImpl manche = new MancheImpl();
    return manche;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Inversion createInversion()
  {
    InversionImpl inversion = new InversionImpl();
    return inversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tourner_les_mains createTourner_les_mains()
  {
    Tourner_les_mainsImpl tourner_les_mains = new Tourner_les_mainsImpl();
    return tourner_les_mains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cartes_1_9 createCartes_1_9()
  {
    Cartes_1_9Impl cartes_1_9 = new Cartes_1_9Impl();
    return cartes_1_9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pioche createPioche()
  {
    PiocheImpl pioche = new PiocheImpl();
    return pioche;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cumul createCumul()
  {
    CumulImpl cumul = new CumulImpl();
    return cumul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Contestations createContestations()
  {
    ContestationsImpl contestations = new ContestationsImpl();
    return contestations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fin_Manche createFin_Manche()
  {
    Fin_MancheImpl fin_Manche = new Fin_MancheImpl();
    return fin_Manche;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Points_manche createPoints_manche()
  {
    Points_mancheImpl points_manche = new Points_mancheImpl();
    return points_manche;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Perdants_manche createPerdants_manche()
  {
    Perdants_mancheImpl perdants_manche = new Perdants_mancheImpl();
    return perdants_manche;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fin_Partie createFin_Partie()
  {
    Fin_PartieImpl fin_Partie = new Fin_PartieImpl();
    return fin_Partie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Etat_Main createEtat_MainFromString(EDataType eDataType, String initialValue)
  {
    Etat_Main result = Etat_Main.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEtat_MainToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nb_Mains createNb_MainsFromString(EDataType eDataType, String initialValue)
  {
    Nb_Mains result = Nb_Mains.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNb_MainsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nb_Cartes_Mains createNb_Cartes_MainsFromString(EDataType eDataType, String initialValue)
  {
    Nb_Cartes_Mains result = Nb_Cartes_Mains.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNb_Cartes_MainsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nb_Talons createNb_TalonsFromString(EDataType eDataType, String initialValue)
  {
    Nb_Talons result = Nb_Talons.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNb_TalonsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nb_cartes_jouables createNb_cartes_jouablesFromString(EDataType eDataType, String initialValue)
  {
    Nb_cartes_jouables result = Nb_cartes_jouables.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNb_cartes_jouablesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interception createInterceptionFromString(EDataType eDataType, String initialValue)
  {
    Interception result = Interception.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInterceptionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nb_cartes_a_piocher createNb_cartes_a_piocherFromString(EDataType eDataType, String initialValue)
  {
    Nb_cartes_a_piocher result = Nb_cartes_a_piocher.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNb_cartes_a_piocherToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jouer_apres_pioche createJouer_apres_piocheFromString(EDataType eDataType, String initialValue)
  {
    Jouer_apres_pioche result = Jouer_apres_pioche.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJouer_apres_piocheToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vainqueur_manche createVainqueur_mancheFromString(EDataType eDataType, String initialValue)
  {
    Vainqueur_manche result = Vainqueur_manche.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVainqueur_mancheToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vainqueur_total createVainqueur_totalFromString(EDataType eDataType, String initialValue)
  {
    Vainqueur_total result = Vainqueur_total.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVainqueur_totalToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyUnoPackage getMyUnoPackage()
  {
    return (MyUnoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyUnoPackage getPackage()
  {
    return MyUnoPackage.eINSTANCE;
  }

} //MyUnoFactoryImpl

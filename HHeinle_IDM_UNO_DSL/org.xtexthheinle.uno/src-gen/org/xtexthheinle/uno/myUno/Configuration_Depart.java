/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Depart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getMain <em>Main</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getTalon <em>Talon</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getRiviere <em>Riviere</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getTemps_limite <em>Temps limite</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getSecondes <em>Secondes</em>}</li>
 * </ul>
 *
 * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getConfiguration_Depart()
 * @model
 * @generated
 */
public interface Configuration_Depart extends EObject
{
  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Main)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getConfiguration_Depart_Main()
   * @model containment="true"
   * @generated
   */
  Main getMain();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Main value);

  /**
   * Returns the value of the '<em><b>Talon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Talon</em>' containment reference.
   * @see #setTalon(Talon)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getConfiguration_Depart_Talon()
   * @model containment="true"
   * @generated
   */
  Talon getTalon();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getTalon <em>Talon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Talon</em>' containment reference.
   * @see #getTalon()
   * @generated
   */
  void setTalon(Talon value);

  /**
   * Returns the value of the '<em><b>Riviere</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Riviere</em>' attribute.
   * @see #setRiviere(String)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getConfiguration_Depart_Riviere()
   * @model
   * @generated
   */
  String getRiviere();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getRiviere <em>Riviere</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Riviere</em>' attribute.
   * @see #getRiviere()
   * @generated
   */
  void setRiviere(String value);

  /**
   * Returns the value of the '<em><b>Temps limite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temps limite</em>' attribute.
   * @see #setTemps_limite(String)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getConfiguration_Depart_Temps_limite()
   * @model
   * @generated
   */
  String getTemps_limite();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getTemps_limite <em>Temps limite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temps limite</em>' attribute.
   * @see #getTemps_limite()
   * @generated
   */
  void setTemps_limite(String value);

  /**
   * Returns the value of the '<em><b>Secondes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secondes</em>' attribute.
   * @see #setSecondes(int)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getConfiguration_Depart_Secondes()
   * @model
   * @generated
   */
  int getSecondes();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Configuration_Depart#getSecondes <em>Secondes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secondes</em>' attribute.
   * @see #getSecondes()
   * @generated
   */
  void setSecondes(int value);

} // Configuration_Depart

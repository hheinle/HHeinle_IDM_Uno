/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartes 19</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtexthheinle.uno.myUno.Cartes_1_9#getSuites <em>Suites</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.Cartes_1_9#getSuites_royales <em>Suites royales</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.Cartes_1_9#getInterception <em>Interception</em>}</li>
 * </ul>
 *
 * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getCartes_1_9()
 * @model
 * @generated
 */
public interface Cartes_1_9 extends EObject
{
  /**
   * Returns the value of the '<em><b>Suites</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suites</em>' attribute.
   * @see #setSuites(String)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getCartes_1_9_Suites()
   * @model
   * @generated
   */
  String getSuites();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Cartes_1_9#getSuites <em>Suites</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suites</em>' attribute.
   * @see #getSuites()
   * @generated
   */
  void setSuites(String value);

  /**
   * Returns the value of the '<em><b>Suites royales</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suites royales</em>' attribute.
   * @see #setSuites_royales(String)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getCartes_1_9_Suites_royales()
   * @model
   * @generated
   */
  String getSuites_royales();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Cartes_1_9#getSuites_royales <em>Suites royales</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suites royales</em>' attribute.
   * @see #getSuites_royales()
   * @generated
   */
  void setSuites_royales(String value);

  /**
   * Returns the value of the '<em><b>Interception</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtexthheinle.uno.myUno.Interception}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interception</em>' attribute.
   * @see org.xtexthheinle.uno.myUno.Interception
   * @see #setInterception(Interception)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getCartes_1_9_Interception()
   * @model
   * @generated
   */
  Interception getInterception();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Cartes_1_9#getInterception <em>Interception</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interception</em>' attribute.
   * @see org.xtexthheinle.uno.myUno.Interception
   * @see #getInterception()
   * @generated
   */
  void setInterception(Interception value);

} // Cartes_1_9

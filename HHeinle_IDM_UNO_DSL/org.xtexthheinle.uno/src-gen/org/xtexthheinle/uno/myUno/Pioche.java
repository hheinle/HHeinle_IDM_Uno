/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pioche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtexthheinle.uno.myUno.Pioche#getNb_cartes_a_piocher <em>Nb cartes apiocher</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.Pioche#getJouer_apres_pioche <em>Jouer apres pioche</em>}</li>
 * </ul>
 *
 * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getPioche()
 * @model
 * @generated
 */
public interface Pioche extends EObject
{
  /**
   * Returns the value of the '<em><b>Nb cartes apiocher</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtexthheinle.uno.myUno.Nb_cartes_a_piocher}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nb cartes apiocher</em>' attribute.
   * @see org.xtexthheinle.uno.myUno.Nb_cartes_a_piocher
   * @see #setNb_cartes_a_piocher(Nb_cartes_a_piocher)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getPioche_Nb_cartes_a_piocher()
   * @model
   * @generated
   */
  Nb_cartes_a_piocher getNb_cartes_a_piocher();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Pioche#getNb_cartes_a_piocher <em>Nb cartes apiocher</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nb cartes apiocher</em>' attribute.
   * @see org.xtexthheinle.uno.myUno.Nb_cartes_a_piocher
   * @see #getNb_cartes_a_piocher()
   * @generated
   */
  void setNb_cartes_a_piocher(Nb_cartes_a_piocher value);

  /**
   * Returns the value of the '<em><b>Jouer apres pioche</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtexthheinle.uno.myUno.Jouer_apres_pioche}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jouer apres pioche</em>' attribute.
   * @see org.xtexthheinle.uno.myUno.Jouer_apres_pioche
   * @see #setJouer_apres_pioche(Jouer_apres_pioche)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getPioche_Jouer_apres_pioche()
   * @model
   * @generated
   */
  Jouer_apres_pioche getJouer_apres_pioche();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Pioche#getJouer_apres_pioche <em>Jouer apres pioche</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jouer apres pioche</em>' attribute.
   * @see org.xtexthheinle.uno.myUno.Jouer_apres_pioche
   * @see #getJouer_apres_pioche()
   * @generated
   */
  void setJouer_apres_pioche(Jouer_apres_pioche value);

} // Pioche

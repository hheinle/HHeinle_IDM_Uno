/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Points manche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtexthheinle.uno.myUno.Points_manche#getVainqueur_manche <em>Vainqueur manche</em>}</li>
 *   <li>{@link org.xtexthheinle.uno.myUno.Points_manche#getPerdants_manche <em>Perdants manche</em>}</li>
 * </ul>
 *
 * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getPoints_manche()
 * @model
 * @generated
 */
public interface Points_manche extends EObject
{
  /**
   * Returns the value of the '<em><b>Vainqueur manche</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtexthheinle.uno.myUno.Vainqueur_manche}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vainqueur manche</em>' attribute.
   * @see org.xtexthheinle.uno.myUno.Vainqueur_manche
   * @see #setVainqueur_manche(Vainqueur_manche)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getPoints_manche_Vainqueur_manche()
   * @model
   * @generated
   */
  Vainqueur_manche getVainqueur_manche();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Points_manche#getVainqueur_manche <em>Vainqueur manche</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vainqueur manche</em>' attribute.
   * @see org.xtexthheinle.uno.myUno.Vainqueur_manche
   * @see #getVainqueur_manche()
   * @generated
   */
  void setVainqueur_manche(Vainqueur_manche value);

  /**
   * Returns the value of the '<em><b>Perdants manche</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perdants manche</em>' containment reference.
   * @see #setPerdants_manche(Perdants_manche)
   * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getPoints_manche_Perdants_manche()
   * @model containment="true"
   * @generated
   */
  Perdants_manche getPerdants_manche();

  /**
   * Sets the value of the '{@link org.xtexthheinle.uno.myUno.Points_manche#getPerdants_manche <em>Perdants manche</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Perdants manche</em>' containment reference.
   * @see #getPerdants_manche()
   * @generated
   */
  void setPerdants_manche(Perdants_manche value);

} // Points_manche

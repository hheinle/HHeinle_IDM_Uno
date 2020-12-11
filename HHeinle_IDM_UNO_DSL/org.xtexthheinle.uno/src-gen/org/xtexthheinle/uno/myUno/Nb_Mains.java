/**
 * generated by Xtext 2.23.0
 */
package org.xtexthheinle.uno.myUno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nb Mains</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtexthheinle.uno.myUno.MyUnoPackage#getNb_Mains()
 * @model
 * @generated
 */
public enum Nb_Mains implements Enumerator
{
  /**
   * The '<em><b>Une main</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNE_MAIN_VALUE
   * @generated
   * @ordered
   */
  UNE_MAIN(0, "une_main", "1"),

  /**
   * The '<em><b>Trois mains</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TROIS_MAINS_VALUE
   * @generated
   * @ordered
   */
  TROIS_MAINS(1, "trois_mains", "3");

  /**
   * The '<em><b>Une main</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNE_MAIN
   * @model name="une_main" literal="1"
   * @generated
   * @ordered
   */
  public static final int UNE_MAIN_VALUE = 0;

  /**
   * The '<em><b>Trois mains</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TROIS_MAINS
   * @model name="trois_mains" literal="3"
   * @generated
   * @ordered
   */
  public static final int TROIS_MAINS_VALUE = 1;

  /**
   * An array of all the '<em><b>Nb Mains</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Nb_Mains[] VALUES_ARRAY =
    new Nb_Mains[]
    {
      UNE_MAIN,
      TROIS_MAINS,
    };

  /**
   * A public read-only list of all the '<em><b>Nb Mains</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Nb_Mains> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Nb Mains</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Nb_Mains get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Nb_Mains result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Nb Mains</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Nb_Mains getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Nb_Mains result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Nb Mains</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Nb_Mains get(int value)
  {
    switch (value)
    {
      case UNE_MAIN_VALUE: return UNE_MAIN;
      case TROIS_MAINS_VALUE: return TROIS_MAINS;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Nb_Mains(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Nb_Mains

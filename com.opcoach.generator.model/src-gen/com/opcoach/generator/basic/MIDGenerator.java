/**
 */
package com.opcoach.generator.basic;

import com.opcoach.generator.ValueGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.generator.basic.MIDGenerator#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link com.opcoach.generator.basic.MIDGenerator#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see com.opcoach.generator.basic.MBasicPackage#getIDGenerator()
 * @model superTypes="com.opcoach.generator.ValueGenerator&lt;org.eclipse.emf.ecore.EString&gt;"
 * @generated
 */
public interface MIDGenerator extends ValueGenerator<String>
{
	/**
	 * Returns the value of the '<em><b>Key Length</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Length</em>' attribute.
	 * @see #setKeyLength(int)
	 * @see com.opcoach.generator.basic.MBasicPackage#getIDGenerator_KeyLength()
	 * @model default="10"
	 * @generated
	 */
	int getKeyLength();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.basic.MIDGenerator#getKeyLength <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Length</em>' attribute.
	 * @see #getKeyLength()
	 * @generated
	 */
	void setKeyLength(int value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see com.opcoach.generator.basic.MBasicPackage#getIDGenerator_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link com.opcoach.generator.basic.MIDGenerator#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // MIDGenerator

/**
 */
package com.opcoach.generator.impl;

import com.opcoach.generator.MGeneratorPackage;
import com.opcoach.generator.ValueGenerator;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.generator.impl.MValueGeneratorImpl#getBadValueProportion <em>Bad Value Proportion</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.MValueGeneratorImpl#getBadValueGenerator <em>Bad Value Generator</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.MValueGeneratorImpl#getLastGeneratedValue <em>Last Generated Value</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.MValueGeneratorImpl#getRandomSeed <em>Random Seed</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.MValueGeneratorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.MValueGeneratorImpl#getID <em>ID</em>}</li>
 *   <li>{@link com.opcoach.generator.impl.MValueGeneratorImpl#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @generated
 */
 public abstract class MValueGeneratorImpl<T> extends EObjectImpl implements ValueGenerator<T>
{
	/**
	 * The default value of the '{@link #getBadValueProportion() <em>Bad Value Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadValueProportion()
	 * @generated
	 * @ordered
	 */
	protected static final int BAD_VALUE_PROPORTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBadValueProportion() <em>Bad Value Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadValueProportion()
	 * @generated
	 * @ordered
	 */
	protected int badValueProportion = BAD_VALUE_PROPORTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBadValueGenerator() <em>Bad Value Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadValueGenerator()
	 * @generated
	 * @ordered
	 */
	protected ValueGenerator<T> badValueGenerator;

	/**
	 * The cached value of the '{@link #getLastGeneratedValue() <em>Last Generated Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastGeneratedValue()
	 * @generated
	 * @ordered
	 */
	protected T lastGeneratedValue;

	/**
	 * The default value of the '{@link #getRandomSeed() <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeed()
	 * @generated
	 * @ordered
	 */
	protected static final long RANDOM_SEED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRandomSeed() <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeed()
	 * @generated
	 * @ordered
	 */
	protected long randomSeed = RANDOM_SEED_EDEFAULT;

	/**
	 * This is true if the Random Seed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean randomSeedESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final Locale LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected Locale locale = LOCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MValueGeneratorImpl()
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
		return MGeneratorPackage.Literals.VALUE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBadValueProportion()
	{
		return badValueProportion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadValueProportion(int newBadValueProportion)
	{
		int oldBadValueProportion = badValueProportion;
		badValueProportion = newBadValueProportion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION, oldBadValueProportion, badValueProportion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public ValueGenerator<T> getBadValueGenerator()
	{
		if (badValueGenerator != null && badValueGenerator.eIsProxy()) {
			InternalEObject oldBadValueGenerator = (InternalEObject)badValueGenerator;
			badValueGenerator = (ValueGenerator<T>)eResolveProxy(oldBadValueGenerator);
			if (badValueGenerator != oldBadValueGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR, oldBadValueGenerator, badValueGenerator));
			}
		}
		return badValueGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueGenerator<T> basicGetBadValueGenerator()
	{
		return badValueGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadValueGenerator(ValueGenerator<T> newBadValueGenerator)
	{
		ValueGenerator<T> oldBadValueGenerator = badValueGenerator;
		badValueGenerator = newBadValueGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR, oldBadValueGenerator, badValueGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getLastGeneratedValue()
	{
		return lastGeneratedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastGeneratedValue(T newLastGeneratedValue)
	{
		T oldLastGeneratedValue = lastGeneratedValue;
		lastGeneratedValue = newLastGeneratedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE, oldLastGeneratedValue, lastGeneratedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRandomSeed()
	{
		return randomSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomSeed(long newRandomSeed)
	{
		long oldRandomSeed = randomSeed;
		randomSeed = newRandomSeed;
		boolean oldRandomSeedESet = randomSeedESet;
		randomSeedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED, oldRandomSeed, randomSeed, !oldRandomSeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRandomSeed()
	{
		long oldRandomSeed = randomSeed;
		boolean oldRandomSeedESet = randomSeedESet;
		randomSeed = RANDOM_SEED_EDEFAULT;
		randomSeedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED, oldRandomSeed, RANDOM_SEED_EDEFAULT, oldRandomSeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRandomSeed()
	{
		return randomSeedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID)
	{
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.VALUE_GENERATOR__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale getLocale()
	{
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocale(Locale newLocale)
	{
		Locale oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGeneratorPackage.VALUE_GENERATOR__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T generateValue()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION:
				return getBadValueProportion();
			case MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR:
				if (resolve) return getBadValueGenerator();
				return basicGetBadValueGenerator();
			case MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE:
				return getLastGeneratedValue();
			case MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED:
				return getRandomSeed();
			case MGeneratorPackage.VALUE_GENERATOR__DESCRIPTION:
				return getDescription();
			case MGeneratorPackage.VALUE_GENERATOR__ID:
				return getID();
			case MGeneratorPackage.VALUE_GENERATOR__LOCALE:
				return getLocale();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION:
				setBadValueProportion((Integer)newValue);
				return;
			case MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR:
				setBadValueGenerator((ValueGenerator<T>)newValue);
				return;
			case MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE:
				setLastGeneratedValue((T)newValue);
				return;
			case MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED:
				setRandomSeed((Long)newValue);
				return;
			case MGeneratorPackage.VALUE_GENERATOR__ID:
				setID((String)newValue);
				return;
			case MGeneratorPackage.VALUE_GENERATOR__LOCALE:
				setLocale((Locale)newValue);
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
		switch (featureID) {
			case MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION:
				setBadValueProportion(BAD_VALUE_PROPORTION_EDEFAULT);
				return;
			case MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR:
				setBadValueGenerator((ValueGenerator<T>)null);
				return;
			case MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE:
				setLastGeneratedValue((T)null);
				return;
			case MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED:
				unsetRandomSeed();
				return;
			case MGeneratorPackage.VALUE_GENERATOR__ID:
				setID(ID_EDEFAULT);
				return;
			case MGeneratorPackage.VALUE_GENERATOR__LOCALE:
				setLocale(LOCALE_EDEFAULT);
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
		switch (featureID) {
			case MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_PROPORTION:
				return badValueProportion != BAD_VALUE_PROPORTION_EDEFAULT;
			case MGeneratorPackage.VALUE_GENERATOR__BAD_VALUE_GENERATOR:
				return badValueGenerator != null;
			case MGeneratorPackage.VALUE_GENERATOR__LAST_GENERATED_VALUE:
				return lastGeneratedValue != null;
			case MGeneratorPackage.VALUE_GENERATOR__RANDOM_SEED:
				return isSetRandomSeed();
			case MGeneratorPackage.VALUE_GENERATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MGeneratorPackage.VALUE_GENERATOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MGeneratorPackage.VALUE_GENERATOR__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MGeneratorPackage.VALUE_GENERATOR___GENERATE_VALUE:
				return generateValue();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (badValueProportion: ");
		result.append(badValueProportion);
		result.append(", lastGeneratedValue: ");
		result.append(lastGeneratedValue);
		result.append(", randomSeed: ");
		if (randomSeedESet) result.append(randomSeed); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", ID: ");
		result.append(id);
		result.append(", locale: ");
		result.append(locale);
		result.append(')');
		return result.toString();
	}

} //MValueGeneratorImpl

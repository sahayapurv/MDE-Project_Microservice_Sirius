/**
 */
package micro.tests;

import junit.textui.TestRunner;

import micro.MicroFactory;
import micro.PrimitiveTypeAttribute;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Primitive Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveTypeAttributeTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrimitiveTypeAttributeTest.class);
	}

	/**
	 * Constructs a new Primitive Type Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Primitive Type Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrimitiveTypeAttribute getFixture() {
		return (PrimitiveTypeAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroFactory.eINSTANCE.createPrimitiveTypeAttribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PrimitiveTypeAttributeTest

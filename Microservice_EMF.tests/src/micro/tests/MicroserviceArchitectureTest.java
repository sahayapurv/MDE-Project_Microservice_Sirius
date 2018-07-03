/**
 */
package micro.tests;

import junit.textui.TestRunner;

import micro.MicroFactory;
import micro.MicroserviceArchitecture;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Microservice Architecture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroserviceArchitectureTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MicroserviceArchitectureTest.class);
	}

	/**
	 * Constructs a new Microservice Architecture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceArchitectureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Microservice Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MicroserviceArchitecture getFixture() {
		return (MicroserviceArchitecture)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroFactory.eINSTANCE.createMicroserviceArchitecture());
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

} //MicroserviceArchitectureTest

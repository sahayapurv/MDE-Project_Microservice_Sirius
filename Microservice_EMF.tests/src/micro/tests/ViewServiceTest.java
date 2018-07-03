/**
 */
package micro.tests;

import junit.textui.TestRunner;

import micro.MicroFactory;
import micro.ViewService;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewServiceTest extends ServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ViewServiceTest.class);
	}

	/**
	 * Constructs a new View Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this View Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ViewService getFixture() {
		return (ViewService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroFactory.eINSTANCE.createViewService());
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

} //ViewServiceTest

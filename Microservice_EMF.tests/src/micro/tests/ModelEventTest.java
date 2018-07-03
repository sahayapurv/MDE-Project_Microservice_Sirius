/**
 */
package micro.tests;

import junit.textui.TestRunner;

import micro.MicroFactory;
import micro.ModelEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelEventTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelEventTest.class);
	}

	/**
	 * Constructs a new Model Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Model Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModelEvent getFixture() {
		return (ModelEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroFactory.eINSTANCE.createModelEvent());
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

} //ModelEventTest

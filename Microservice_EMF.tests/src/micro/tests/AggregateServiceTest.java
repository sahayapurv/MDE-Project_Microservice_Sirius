/**
 */
package micro.tests;

import junit.textui.TestRunner;

import micro.AggregateService;
import micro.MicroFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aggregate Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link micro.AggregateService#ReferenceModelsIncluded() <em>Reference Models Included</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AggregateServiceTest extends ServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AggregateServiceTest.class);
	}

	/**
	 * Constructs a new Aggregate Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Aggregate Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AggregateService getFixture() {
		return (AggregateService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroFactory.eINSTANCE.createAggregateService());
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

	/**
	 * Tests the '{@link micro.AggregateService#ReferenceModelsIncluded() <em>Reference Models Included</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see micro.AggregateService#ReferenceModelsIncluded()
	 * @generated
	 */
	public void testReferenceModelsIncluded() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AggregateServiceTest

/**
 */
package micro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.AggregateService#getOperation <em>Operation</em>}</li>
 *   <li>{@link micro.AggregateService#getApi <em>Api</em>}</li>
 *   <li>{@link micro.AggregateService#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getAggregateService()
 * @model
 * @generated
 */
public interface AggregateService extends Service {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link micro.Operation}.
	 * It is bidirectional and its opposite is '{@link micro.Operation#getAggregateService <em>Aggregate Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see micro.MicroPackage#getAggregateService_Operation()
	 * @see micro.Operation#getAggregateService
	 * @model opposite="aggregateService" containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' containment reference.
	 * @see #setApi(API)
	 * @see micro.MicroPackage#getAggregateService_Api()
	 * @model containment="true" required="true"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link micro.AggregateService#getApi <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' containment reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link micro.Model}.
	 * It is bidirectional and its opposite is '{@link micro.Model#getAggregateService <em>Aggregate Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see micro.MicroPackage#getAggregateService_Models()
	 * @see micro.Model#getAggregateService
	 * @model opposite="aggregateService" containment="true" required="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.models-&gt;includesAll(self.models.attributes-&gt;select(a : Attribute | a.oclIsTypeOf(ReferenceAttribute)).oclAsType(ReferenceAttribute).type)'"
	 * @generated
	 */
	boolean ReferenceModelsIncluded();

} // AggregateService

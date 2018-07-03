/**
 */
package micro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link micro.Model#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link micro.Model#getAggregateService <em>Aggregate Service</em>}</li>
 * </ul>
 *
 * @see micro.MicroPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link micro.Attribute}.
	 * It is bidirectional and its opposite is '{@link micro.Attribute#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see micro.MicroPackage#getModel_Attributes()
	 * @see micro.Attribute#getModel
	 * @model opposite="model" containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Aggregate Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link micro.AggregateService#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Service</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Service</em>' container reference.
	 * @see #setAggregateService(AggregateService)
	 * @see micro.MicroPackage#getModel_AggregateService()
	 * @see micro.AggregateService#getModels
	 * @model opposite="models" transient="false" ordered="false"
	 * @generated
	 */
	AggregateService getAggregateService();

	/**
	 * Sets the value of the '{@link micro.Model#getAggregateService <em>Aggregate Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Service</em>' container reference.
	 * @see #getAggregateService()
	 * @generated
	 */
	void setAggregateService(AggregateService value);

} // Model

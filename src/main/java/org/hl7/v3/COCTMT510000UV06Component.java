
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de COCT_MT510000UV06.Component complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT510000UV06.Component">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="priorityNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="policyOrProgram" type="{urn:hl7-org:v3}COCT_MT510000UV06.PolicyOrProgram"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ActRelationshipHasComponent" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT510000UV06.Component", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "priorityNumber",
    "policyOrProgram"
})
public class COCTMT510000UV06Component {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected INT priorityNumber;
    @XmlElement(required = true, nillable = true)
    protected COCTMT510000UV06PolicyOrProgram policyOrProgram;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected ActRelationshipHasComponent typeCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Obtém o valor da propriedade typeId.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Define o valor da propriedade typeId.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Obtém o valor da propriedade priorityNumber.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getPriorityNumber() {
        return priorityNumber;
    }

    /**
     * Define o valor da propriedade priorityNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setPriorityNumber(INT value) {
        this.priorityNumber = value;
    }

    /**
     * Obtém o valor da propriedade policyOrProgram.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT510000UV06PolicyOrProgram }
     *     
     */
    public COCTMT510000UV06PolicyOrProgram getPolicyOrProgram() {
        return policyOrProgram;
    }

    /**
     * Define o valor da propriedade policyOrProgram.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT510000UV06PolicyOrProgram }
     *     
     */
    public void setPolicyOrProgram(COCTMT510000UV06PolicyOrProgram value) {
        this.policyOrProgram = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link ActRelationshipHasComponent }
     *     
     */
    public ActRelationshipHasComponent getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ActRelationshipHasComponent }
     *     
     */
    public void setTypeCode(ActRelationshipHasComponent value) {
        this.typeCode = value;
    }

}

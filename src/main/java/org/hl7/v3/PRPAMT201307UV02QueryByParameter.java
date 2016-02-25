
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PRPA_MT201307UV02.QueryByParameter complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201307UV02.QueryByParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="queryId" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="modifyCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="responseElementGroupId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responsePriorityCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="executionAndDeliveryTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="parameterList" type="{urn:hl7-org:v3}PRPA_MT201307UV02.ParameterList"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201307UV02.QueryByParameter", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "queryId",
    "statusCode",
    "modifyCode",
    "responseElementGroupId",
    "responsePriorityCode",
    "executionAndDeliveryTime",
    "parameterList"
})
public class PRPAMT201307UV02QueryByParameter {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected II queryId;
    @XmlElement(required = true)
    protected CS statusCode;
    protected CS modifyCode;
    protected List<II> responseElementGroupId;
    protected CS responsePriorityCode;
    protected TS executionAndDeliveryTime;
    @XmlElement(required = true)
    protected PRPAMT201307UV02ParameterList parameterList;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;

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
     * Obtém o valor da propriedade queryId.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getQueryId() {
        return queryId;
    }

    /**
     * Define o valor da propriedade queryId.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setQueryId(II value) {
        this.queryId = value;
    }

    /**
     * Obtém o valor da propriedade statusCode.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getStatusCode() {
        return statusCode;
    }

    /**
     * Define o valor da propriedade statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setStatusCode(CS value) {
        this.statusCode = value;
    }

    /**
     * Obtém o valor da propriedade modifyCode.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getModifyCode() {
        return modifyCode;
    }

    /**
     * Define o valor da propriedade modifyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setModifyCode(CS value) {
        this.modifyCode = value;
    }

    /**
     * Gets the value of the responseElementGroupId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseElementGroupId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseElementGroupId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getResponseElementGroupId() {
        if (responseElementGroupId == null) {
            responseElementGroupId = new ArrayList<II>();
        }
        return this.responseElementGroupId;
    }

    /**
     * Obtém o valor da propriedade responsePriorityCode.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getResponsePriorityCode() {
        return responsePriorityCode;
    }

    /**
     * Define o valor da propriedade responsePriorityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setResponsePriorityCode(CS value) {
        this.responsePriorityCode = value;
    }

    /**
     * Obtém o valor da propriedade executionAndDeliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getExecutionAndDeliveryTime() {
        return executionAndDeliveryTime;
    }

    /**
     * Define o valor da propriedade executionAndDeliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setExecutionAndDeliveryTime(TS value) {
        this.executionAndDeliveryTime = value;
    }

    /**
     * Obtém o valor da propriedade parameterList.
     * 
     * @return
     *     possible object is
     *     {@link PRPAMT201307UV02ParameterList }
     *     
     */
    public PRPAMT201307UV02ParameterList getParameterList() {
        return parameterList;
    }

    /**
     * Define o valor da propriedade parameterList.
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAMT201307UV02ParameterList }
     *     
     */
    public void setParameterList(PRPAMT201307UV02ParameterList value) {
        this.parameterList = value;
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

}

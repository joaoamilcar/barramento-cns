
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MFMI_MT700711UV01.QueryAck complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MFMI_MT700711UV01.QueryAck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="queryId" type="{urn:hl7-org:v3}II" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="queryResponseCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="resultTotalQuantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="resultCurrentQuantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="resultRemainingQuantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
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
@XmlType(name = "MFMI_MT700711UV01.QueryAck", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "queryId",
    "statusCode",
    "queryResponseCode",
    "resultTotalQuantity",
    "resultCurrentQuantity",
    "resultRemainingQuantity"
})
public class MFMIMT700711UV01QueryAck {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II queryId;
    protected CS statusCode;
    @XmlElement(required = true)
    protected CS queryResponseCode;
    protected INT resultTotalQuantity;
    protected INT resultCurrentQuantity;
    protected INT resultRemainingQuantity;
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
     * Obtém o valor da propriedade queryResponseCode.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getQueryResponseCode() {
        return queryResponseCode;
    }

    /**
     * Define o valor da propriedade queryResponseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setQueryResponseCode(CS value) {
        this.queryResponseCode = value;
    }

    /**
     * Obtém o valor da propriedade resultTotalQuantity.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getResultTotalQuantity() {
        return resultTotalQuantity;
    }

    /**
     * Define o valor da propriedade resultTotalQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setResultTotalQuantity(INT value) {
        this.resultTotalQuantity = value;
    }

    /**
     * Obtém o valor da propriedade resultCurrentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getResultCurrentQuantity() {
        return resultCurrentQuantity;
    }

    /**
     * Define o valor da propriedade resultCurrentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setResultCurrentQuantity(INT value) {
        this.resultCurrentQuantity = value;
    }

    /**
     * Obtém o valor da propriedade resultRemainingQuantity.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getResultRemainingQuantity() {
        return resultRemainingQuantity;
    }

    /**
     * Define o valor da propriedade resultRemainingQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setResultRemainingQuantity(INT value) {
        this.resultRemainingQuantity = value;
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

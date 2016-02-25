
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de COCT_MT080000UV.Container complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV.Container">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="riskCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="handlingCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="capacityQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;element name="heightQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;element name="diameterQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;element name="capTypeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="separatorTypeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="barrierDeltaQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;element name="bottomDeltaQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;element name="asIdentifiedContainer" type="{urn:hl7-org:v3}COCT_MT080000UV.IdentifiedContainer" minOccurs="0"/>
 *         &lt;element name="asContent" type="{urn:hl7-org:v3}COCT_MT080000UV.Content3" minOccurs="0"/>
 *         &lt;element name="asLocatedEntity" type="{urn:hl7-org:v3}COCT_MT070000UV01.LocatedEntity" minOccurs="0"/>
 *         &lt;element name="additive" type="{urn:hl7-org:v3}COCT_MT080000UV.Additive2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClassContainer" />
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}EntityDeterminer" fixed="INSTANCE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV.Container", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "desc",
    "riskCode",
    "handlingCode",
    "capacityQuantity",
    "heightQuantity",
    "diameterQuantity",
    "capTypeCode",
    "separatorTypeCode",
    "barrierDeltaQuantity",
    "bottomDeltaQuantity",
    "asIdentifiedContainer",
    "asContent",
    "asLocatedEntity",
    "additive"
})
public class COCTMT080000UVContainer {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II id;
    protected CE code;
    protected ED desc;
    protected CE riskCode;
    protected CE handlingCode;
    protected PQ capacityQuantity;
    protected PQ heightQuantity;
    protected PQ diameterQuantity;
    protected CE capTypeCode;
    protected CE separatorTypeCode;
    protected PQ barrierDeltaQuantity;
    protected PQ bottomDeltaQuantity;
    @XmlElementRef(name = "asIdentifiedContainer", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVIdentifiedContainer> asIdentifiedContainer;
    @XmlElementRef(name = "asContent", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVContent3> asContent;
    @XmlElementRef(name = "asLocatedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT070000UV01LocatedEntity> asLocatedEntity;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVAdditive2> additive;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected EntityClassContainer classCode;
    @XmlAttribute(name = "determinerCode", required = true)
    protected String determinerCode;

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
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade code.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Define o valor da propriedade code.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Obtém o valor da propriedade desc.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getDesc() {
        return desc;
    }

    /**
     * Define o valor da propriedade desc.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setDesc(ED value) {
        this.desc = value;
    }

    /**
     * Obtém o valor da propriedade riskCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getRiskCode() {
        return riskCode;
    }

    /**
     * Define o valor da propriedade riskCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setRiskCode(CE value) {
        this.riskCode = value;
    }

    /**
     * Obtém o valor da propriedade handlingCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getHandlingCode() {
        return handlingCode;
    }

    /**
     * Define o valor da propriedade handlingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setHandlingCode(CE value) {
        this.handlingCode = value;
    }

    /**
     * Obtém o valor da propriedade capacityQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getCapacityQuantity() {
        return capacityQuantity;
    }

    /**
     * Define o valor da propriedade capacityQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setCapacityQuantity(PQ value) {
        this.capacityQuantity = value;
    }

    /**
     * Obtém o valor da propriedade heightQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getHeightQuantity() {
        return heightQuantity;
    }

    /**
     * Define o valor da propriedade heightQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setHeightQuantity(PQ value) {
        this.heightQuantity = value;
    }

    /**
     * Obtém o valor da propriedade diameterQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getDiameterQuantity() {
        return diameterQuantity;
    }

    /**
     * Define o valor da propriedade diameterQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setDiameterQuantity(PQ value) {
        this.diameterQuantity = value;
    }

    /**
     * Obtém o valor da propriedade capTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCapTypeCode() {
        return capTypeCode;
    }

    /**
     * Define o valor da propriedade capTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCapTypeCode(CE value) {
        this.capTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade separatorTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getSeparatorTypeCode() {
        return separatorTypeCode;
    }

    /**
     * Define o valor da propriedade separatorTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setSeparatorTypeCode(CE value) {
        this.separatorTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade barrierDeltaQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getBarrierDeltaQuantity() {
        return barrierDeltaQuantity;
    }

    /**
     * Define o valor da propriedade barrierDeltaQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setBarrierDeltaQuantity(PQ value) {
        this.barrierDeltaQuantity = value;
    }

    /**
     * Obtém o valor da propriedade bottomDeltaQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getBottomDeltaQuantity() {
        return bottomDeltaQuantity;
    }

    /**
     * Define o valor da propriedade bottomDeltaQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setBottomDeltaQuantity(PQ value) {
        this.bottomDeltaQuantity = value;
    }

    /**
     * Obtém o valor da propriedade asIdentifiedContainer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVIdentifiedContainer }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVIdentifiedContainer> getAsIdentifiedContainer() {
        return asIdentifiedContainer;
    }

    /**
     * Define o valor da propriedade asIdentifiedContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVIdentifiedContainer }{@code >}
     *     
     */
    public void setAsIdentifiedContainer(JAXBElement<COCTMT080000UVIdentifiedContainer> value) {
        this.asIdentifiedContainer = value;
    }

    /**
     * Obtém o valor da propriedade asContent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVContent3 }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVContent3> getAsContent() {
        return asContent;
    }

    /**
     * Define o valor da propriedade asContent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVContent3 }{@code >}
     *     
     */
    public void setAsContent(JAXBElement<COCTMT080000UVContent3> value) {
        this.asContent = value;
    }

    /**
     * Obtém o valor da propriedade asLocatedEntity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}
     *     
     */
    public JAXBElement<COCTMT070000UV01LocatedEntity> getAsLocatedEntity() {
        return asLocatedEntity;
    }

    /**
     * Define o valor da propriedade asLocatedEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}
     *     
     */
    public void setAsLocatedEntity(JAXBElement<COCTMT070000UV01LocatedEntity> value) {
        this.asLocatedEntity = value;
    }

    /**
     * Gets the value of the additive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVAdditive2 }
     * 
     * 
     */
    public List<COCTMT080000UVAdditive2> getAdditive() {
        if (additive == null) {
            additive = new ArrayList<COCTMT080000UVAdditive2>();
        }
        return this.additive;
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
     * Obtém o valor da propriedade classCode.
     * 
     * @return
     *     possible object is
     *     {@link EntityClassContainer }
     *     
     */
    public EntityClassContainer getClassCode() {
        return classCode;
    }

    /**
     * Define o valor da propriedade classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityClassContainer }
     *     
     */
    public void setClassCode(EntityClassContainer value) {
        this.classCode = value;
    }

    /**
     * Obtém o valor da propriedade determinerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminerCode() {
        if (determinerCode == null) {
            return "INSTANCE";
        } else {
            return determinerCode;
        }
    }

    /**
     * Define o valor da propriedade determinerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminerCode(String value) {
        this.determinerCode = value;
    }

}

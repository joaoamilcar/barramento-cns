
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
 * <p>Classe Java de COCT_MT080000UV.Manufactured complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT080000UV.Manufactured">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE"/>
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}PQ" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ST" minOccurs="0"/>
 *         &lt;element name="riskCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="handlingCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="lotNumberText" type="{urn:hl7-org:v3}ST" minOccurs="0"/>
 *         &lt;element name="expirationTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="asSpecimenAlternateIdentifier" type="{urn:hl7-org:v3}COCT_MT080000UV.SpecimenAlternateIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="asManufacturedProduct" type="{urn:hl7-org:v3}COCT_MT080000UV.ManufacturedProduct"/>
 *         &lt;element name="asSpecimenStub" type="{urn:hl7-org:v3}COCT_MT080000UV.SpecimenStub" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="asContent" type="{urn:hl7-org:v3}COCT_MT080000UV.Content1" minOccurs="0"/>
 *         &lt;element name="additive" type="{urn:hl7-org:v3}COCT_MT080000UV.Additive" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClassManufacturedMaterial" />
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}EntityDeterminer" fixed="INSTANCE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT080000UV.Manufactured", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "quantity",
    "desc",
    "riskCode",
    "handlingCode",
    "lotNumberText",
    "expirationTime",
    "asSpecimenAlternateIdentifier",
    "asManufacturedProduct",
    "asSpecimenStub",
    "asContent",
    "additive"
})
public class COCTMT080000UVManufactured {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected CE code;
    protected List<PQ> quantity;
    protected ST desc;
    protected CE riskCode;
    protected CE handlingCode;
    protected ST lotNumberText;
    protected IVLTS expirationTime;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVSpecimenAlternateIdentifier> asSpecimenAlternateIdentifier;
    @XmlElement(required = true, nillable = true)
    protected COCTMT080000UVManufacturedProduct asManufacturedProduct;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVSpecimenStub> asSpecimenStub;
    @XmlElementRef(name = "asContent", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT080000UVContent1> asContent;
    @XmlElement(nillable = true)
    protected List<COCTMT080000UVAdditive> additive;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected String classCode;
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
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PQ }
     * 
     * 
     */
    public List<PQ> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<PQ>();
        }
        return this.quantity;
    }

    /**
     * Obtém o valor da propriedade desc.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getDesc() {
        return desc;
    }

    /**
     * Define o valor da propriedade desc.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setDesc(ST value) {
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
     * Obtém o valor da propriedade lotNumberText.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLotNumberText() {
        return lotNumberText;
    }

    /**
     * Define o valor da propriedade lotNumberText.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLotNumberText(ST value) {
        this.lotNumberText = value;
    }

    /**
     * Obtém o valor da propriedade expirationTime.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getExpirationTime() {
        return expirationTime;
    }

    /**
     * Define o valor da propriedade expirationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setExpirationTime(IVLTS value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the asSpecimenAlternateIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asSpecimenAlternateIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsSpecimenAlternateIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVSpecimenAlternateIdentifier }
     * 
     * 
     */
    public List<COCTMT080000UVSpecimenAlternateIdentifier> getAsSpecimenAlternateIdentifier() {
        if (asSpecimenAlternateIdentifier == null) {
            asSpecimenAlternateIdentifier = new ArrayList<COCTMT080000UVSpecimenAlternateIdentifier>();
        }
        return this.asSpecimenAlternateIdentifier;
    }

    /**
     * Obtém o valor da propriedade asManufacturedProduct.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT080000UVManufacturedProduct }
     *     
     */
    public COCTMT080000UVManufacturedProduct getAsManufacturedProduct() {
        return asManufacturedProduct;
    }

    /**
     * Define o valor da propriedade asManufacturedProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT080000UVManufacturedProduct }
     *     
     */
    public void setAsManufacturedProduct(COCTMT080000UVManufacturedProduct value) {
        this.asManufacturedProduct = value;
    }

    /**
     * Gets the value of the asSpecimenStub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asSpecimenStub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsSpecimenStub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT080000UVSpecimenStub }
     * 
     * 
     */
    public List<COCTMT080000UVSpecimenStub> getAsSpecimenStub() {
        if (asSpecimenStub == null) {
            asSpecimenStub = new ArrayList<COCTMT080000UVSpecimenStub>();
        }
        return this.asSpecimenStub;
    }

    /**
     * Obtém o valor da propriedade asContent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVContent1 }{@code >}
     *     
     */
    public JAXBElement<COCTMT080000UVContent1> getAsContent() {
        return asContent;
    }

    /**
     * Define o valor da propriedade asContent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT080000UVContent1 }{@code >}
     *     
     */
    public void setAsContent(JAXBElement<COCTMT080000UVContent1> value) {
        this.asContent = value;
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
     * {@link COCTMT080000UVAdditive }
     * 
     * 
     */
    public List<COCTMT080000UVAdditive> getAdditive() {
        if (additive == null) {
            additive = new ArrayList<COCTMT080000UVAdditive>();
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
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Define o valor da propriedade classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
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


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
 * <p>Classe Java de COCT_MT030007UV.NonPersonLivingSubject complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT030007UV.NonPersonLivingSubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="existenceTime" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="riskCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="handlingCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="administrativeGenderCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="birthTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="deceasedInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/>
 *         &lt;element name="multipleBirthInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/>
 *         &lt;element name="multipleBirthOrderNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="organDonorInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/>
 *         &lt;element name="strainText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="genderStatusCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="asMember" type="{urn:hl7-org:v3}COCT_MT030007UV.Member" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="asOtherIDs" type="{urn:hl7-org:v3}COCT_MT030007UV.OtherIDs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactParty" type="{urn:hl7-org:v3}COCT_MT030007UV.ContactParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="guardian" type="{urn:hl7-org:v3}COCT_MT030007UV.Guardian" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="guarantor" type="{urn:hl7-org:v3}COCT_MT030007UV.Guarantor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{urn:hl7-org:v3}COCT_MT030007UV.BirthPlace" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClassNonPersonLivingSubject" />
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}x_DeterminerInstanceKind" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT030007UV.NonPersonLivingSubject", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "quantity",
    "name",
    "desc",
    "statusCode",
    "existenceTime",
    "riskCode",
    "handlingCode",
    "administrativeGenderCode",
    "birthTime",
    "deceasedInd",
    "multipleBirthInd",
    "multipleBirthOrderNumber",
    "organDonorInd",
    "strainText",
    "genderStatusCode",
    "asMember",
    "asOtherIDs",
    "contactParty",
    "guardian",
    "guarantor",
    "birthPlace"
})
public class COCTMT030007UVNonPersonLivingSubject {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<II> id;
    protected INT quantity;
    protected List<EN> name;
    protected ED desc;
    protected CS statusCode;
    protected IVLTS existenceTime;
    protected CE riskCode;
    protected CE handlingCode;
    protected CE administrativeGenderCode;
    protected TS birthTime;
    protected BL deceasedInd;
    protected BL multipleBirthInd;
    protected INT multipleBirthOrderNumber;
    protected BL organDonorInd;
    protected ED strainText;
    protected CE genderStatusCode;
    @XmlElement(nillable = true)
    protected List<COCTMT030007UVMember> asMember;
    @XmlElement(nillable = true)
    protected List<COCTMT030007UVOtherIDs> asOtherIDs;
    @XmlElement(nillable = true)
    protected List<COCTMT030007UVContactParty> contactParty;
    @XmlElement(nillable = true)
    protected List<COCTMT030007UVGuardian> guardian;
    @XmlElement(nillable = true)
    protected List<COCTMT030007UVGuarantor> guarantor;
    @XmlElementRef(name = "birthPlace", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT030007UVBirthPlace> birthPlace;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected EntityClassNonPersonLivingSubject classCode;
    @XmlAttribute(name = "determinerCode", required = true)
    protected XDeterminerInstanceKind determinerCode;

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
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getId() {
        if (id == null) {
            id = new ArrayList<II>();
        }
        return this.id;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setQuantity(INT value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EN }
     * 
     * 
     */
    public List<EN> getName() {
        if (name == null) {
            name = new ArrayList<EN>();
        }
        return this.name;
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
     * Obtém o valor da propriedade existenceTime.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getExistenceTime() {
        return existenceTime;
    }

    /**
     * Define o valor da propriedade existenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setExistenceTime(IVLTS value) {
        this.existenceTime = value;
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
     * Obtém o valor da propriedade administrativeGenderCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getAdministrativeGenderCode() {
        return administrativeGenderCode;
    }

    /**
     * Define o valor da propriedade administrativeGenderCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setAdministrativeGenderCode(CE value) {
        this.administrativeGenderCode = value;
    }

    /**
     * Obtém o valor da propriedade birthTime.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getBirthTime() {
        return birthTime;
    }

    /**
     * Define o valor da propriedade birthTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setBirthTime(TS value) {
        this.birthTime = value;
    }

    /**
     * Obtém o valor da propriedade deceasedInd.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getDeceasedInd() {
        return deceasedInd;
    }

    /**
     * Define o valor da propriedade deceasedInd.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setDeceasedInd(BL value) {
        this.deceasedInd = value;
    }

    /**
     * Obtém o valor da propriedade multipleBirthInd.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getMultipleBirthInd() {
        return multipleBirthInd;
    }

    /**
     * Define o valor da propriedade multipleBirthInd.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setMultipleBirthInd(BL value) {
        this.multipleBirthInd = value;
    }

    /**
     * Obtém o valor da propriedade multipleBirthOrderNumber.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getMultipleBirthOrderNumber() {
        return multipleBirthOrderNumber;
    }

    /**
     * Define o valor da propriedade multipleBirthOrderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setMultipleBirthOrderNumber(INT value) {
        this.multipleBirthOrderNumber = value;
    }

    /**
     * Obtém o valor da propriedade organDonorInd.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getOrganDonorInd() {
        return organDonorInd;
    }

    /**
     * Define o valor da propriedade organDonorInd.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setOrganDonorInd(BL value) {
        this.organDonorInd = value;
    }

    /**
     * Obtém o valor da propriedade strainText.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getStrainText() {
        return strainText;
    }

    /**
     * Define o valor da propriedade strainText.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setStrainText(ED value) {
        this.strainText = value;
    }

    /**
     * Obtém o valor da propriedade genderStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getGenderStatusCode() {
        return genderStatusCode;
    }

    /**
     * Define o valor da propriedade genderStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setGenderStatusCode(CE value) {
        this.genderStatusCode = value;
    }

    /**
     * Gets the value of the asMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030007UVMember }
     * 
     * 
     */
    public List<COCTMT030007UVMember> getAsMember() {
        if (asMember == null) {
            asMember = new ArrayList<COCTMT030007UVMember>();
        }
        return this.asMember;
    }

    /**
     * Gets the value of the asOtherIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asOtherIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsOtherIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030007UVOtherIDs }
     * 
     * 
     */
    public List<COCTMT030007UVOtherIDs> getAsOtherIDs() {
        if (asOtherIDs == null) {
            asOtherIDs = new ArrayList<COCTMT030007UVOtherIDs>();
        }
        return this.asOtherIDs;
    }

    /**
     * Gets the value of the contactParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030007UVContactParty }
     * 
     * 
     */
    public List<COCTMT030007UVContactParty> getContactParty() {
        if (contactParty == null) {
            contactParty = new ArrayList<COCTMT030007UVContactParty>();
        }
        return this.contactParty;
    }

    /**
     * Gets the value of the guardian property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guardian property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuardian().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030007UVGuardian }
     * 
     * 
     */
    public List<COCTMT030007UVGuardian> getGuardian() {
        if (guardian == null) {
            guardian = new ArrayList<COCTMT030007UVGuardian>();
        }
        return this.guardian;
    }

    /**
     * Gets the value of the guarantor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT030007UVGuarantor }
     * 
     * 
     */
    public List<COCTMT030007UVGuarantor> getGuarantor() {
        if (guarantor == null) {
            guarantor = new ArrayList<COCTMT030007UVGuarantor>();
        }
        return this.guarantor;
    }

    /**
     * Obtém o valor da propriedade birthPlace.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030007UVBirthPlace }{@code >}
     *     
     */
    public JAXBElement<COCTMT030007UVBirthPlace> getBirthPlace() {
        return birthPlace;
    }

    /**
     * Define o valor da propriedade birthPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT030007UVBirthPlace }{@code >}
     *     
     */
    public void setBirthPlace(JAXBElement<COCTMT030007UVBirthPlace> value) {
        this.birthPlace = value;
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
     *     {@link EntityClassNonPersonLivingSubject }
     *     
     */
    public EntityClassNonPersonLivingSubject getClassCode() {
        return classCode;
    }

    /**
     * Define o valor da propriedade classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityClassNonPersonLivingSubject }
     *     
     */
    public void setClassCode(EntityClassNonPersonLivingSubject value) {
        this.classCode = value;
    }

    /**
     * Obtém o valor da propriedade determinerCode.
     * 
     * @return
     *     possible object is
     *     {@link XDeterminerInstanceKind }
     *     
     */
    public XDeterminerInstanceKind getDeterminerCode() {
        return determinerCode;
    }

    /**
     * Define o valor da propriedade determinerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link XDeterminerInstanceKind }
     *     
     */
    public void setDeterminerCode(XDeterminerInstanceKind value) {
        this.determinerCode = value;
    }

}

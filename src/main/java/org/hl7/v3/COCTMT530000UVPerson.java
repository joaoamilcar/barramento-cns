
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
 * <p>Classe Java de COCT_MT530000UV.Person complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT530000UV.Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}PN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telecom" type="{urn:hl7-org:v3}TEL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="administrativeGenderCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="birthTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="multipleBirthInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/>
 *         &lt;element name="multipleBirthOrderNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="maritalStatusCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="religiousAffiliationCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="raceCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="ethnicGroupCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="asRole" type="{urn:hl7-org:v3}COCT_MT530000UV.Role" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="birthplace" type="{urn:hl7-org:v3}COCT_MT530000UV.Birthplace" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClass" fixed="PSN" />
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}EntityDeterminer" fixed="INSTANCE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT530000UV.Person", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "name",
    "telecom",
    "administrativeGenderCode",
    "birthTime",
    "multipleBirthInd",
    "multipleBirthOrderNumber",
    "maritalStatusCode",
    "religiousAffiliationCode",
    "raceCode",
    "ethnicGroupCode",
    "asRole",
    "birthplace"
})
public class COCTMT530000UVPerson {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected List<PN> name;
    protected List<TEL> telecom;
    protected CE administrativeGenderCode;
    protected TS birthTime;
    protected BL multipleBirthInd;
    protected INT multipleBirthOrderNumber;
    protected CE maritalStatusCode;
    protected CE religiousAffiliationCode;
    protected CE raceCode;
    protected CE ethnicGroupCode;
    @XmlElement(nillable = true)
    protected List<COCTMT530000UVRole> asRole;
    @XmlElementRef(name = "birthplace", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVBirthplace> birthplace;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected List<String> classCode;
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
     * {@link PN }
     * 
     * 
     */
    public List<PN> getName() {
        if (name == null) {
            name = new ArrayList<PN>();
        }
        return this.name;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEL }
     * 
     * 
     */
    public List<TEL> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<TEL>();
        }
        return this.telecom;
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
     * Obtém o valor da propriedade maritalStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * Define o valor da propriedade maritalStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setMaritalStatusCode(CE value) {
        this.maritalStatusCode = value;
    }

    /**
     * Obtém o valor da propriedade religiousAffiliationCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getReligiousAffiliationCode() {
        return religiousAffiliationCode;
    }

    /**
     * Define o valor da propriedade religiousAffiliationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setReligiousAffiliationCode(CE value) {
        this.religiousAffiliationCode = value;
    }

    /**
     * Obtém o valor da propriedade raceCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getRaceCode() {
        return raceCode;
    }

    /**
     * Define o valor da propriedade raceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setRaceCode(CE value) {
        this.raceCode = value;
    }

    /**
     * Obtém o valor da propriedade ethnicGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getEthnicGroupCode() {
        return ethnicGroupCode;
    }

    /**
     * Define o valor da propriedade ethnicGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setEthnicGroupCode(CE value) {
        this.ethnicGroupCode = value;
    }

    /**
     * Gets the value of the asRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT530000UVRole }
     * 
     * 
     */
    public List<COCTMT530000UVRole> getAsRole() {
        if (asRole == null) {
            asRole = new ArrayList<COCTMT530000UVRole>();
        }
        return this.asRole;
    }

    /**
     * Obtém o valor da propriedade birthplace.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVBirthplace }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVBirthplace> getBirthplace() {
        return birthplace;
    }

    /**
     * Define o valor da propriedade birthplace.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVBirthplace }{@code >}
     *     
     */
    public void setBirthplace(JAXBElement<COCTMT530000UVBirthplace> value) {
        this.birthplace = value;
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
     * Gets the value of the classCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassCode() {
        if (classCode == null) {
            classCode = new ArrayList<String>();
        }
        return this.classCode;
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

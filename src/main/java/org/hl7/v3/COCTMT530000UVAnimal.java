
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
 * <p>Classe Java de COCT_MT530000UV.Animal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT530000UV.Animal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE"/>
 *         &lt;element name="quantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="desc" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="administrativeGenderCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="birthTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="strainText" type="{urn:hl7-org:v3}ST" minOccurs="0"/>
 *         &lt;element name="genderStatusCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="asRole" type="{urn:hl7-org:v3}COCT_MT530000UV.Role" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="birthplace" type="{urn:hl7-org:v3}COCT_MT530000UV.Birthplace" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClass" fixed="ANM" />
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}EntityDeterminer" fixed="INSTANCE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT530000UV.Animal", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "quantity",
    "name",
    "desc",
    "administrativeGenderCode",
    "birthTime",
    "strainText",
    "genderStatusCode",
    "asRole",
    "birthplace"
})
public class COCTMT530000UVAnimal {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected CE code;
    protected PQ quantity;
    protected List<EN> name;
    protected ED desc;
    protected CE administrativeGenderCode;
    protected TS birthTime;
    protected ST strainText;
    protected CE genderStatusCode;
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
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setQuantity(PQ value) {
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
     * Obtém o valor da propriedade strainText.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getStrainText() {
        return strainText;
    }

    /**
     * Define o valor da propriedade strainText.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setStrainText(ST value) {
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

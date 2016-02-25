
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de COCT_MT510000UV06.Definition complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT510000UV06.Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element name="billableClinicalService1" type="{urn:hl7-org:v3}COCT_MT290000UV06.BillableClinicalService"/>
 *             &lt;element name="billableClinicalProduct1" type="{urn:hl7-org:v3}COCT_MT490000UV04.BillableClinicalProduct"/>
 *             &lt;element name="supplyEvent1" type="{urn:hl7-org:v3}COCT_MT300000UV04.SupplyEvent"/>
 *             &lt;element name="accomodationSupplied1" type="{urn:hl7-org:v3}COCT_MT310000UV04.AccomodationSupplied"/>
 *             &lt;element name="supplyEvent2" type="{urn:hl7-org:v3}COCT_MT600000UV06.SupplyEvent"/>
 *             &lt;element name="oralHealthService1" type="{urn:hl7-org:v3}COCT_MT740000UV04.OralHealthService"/>
 *             &lt;element name="crossReference1" type="{urn:hl7-org:v3}COCT_MT280000UV04.CrossReference"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;choice>
 *               &lt;element name="observation" type="{urn:hl7-org:v3}COCT_MT530000UV.Observation"/>
 *               &lt;element name="substanceAdministration" type="{urn:hl7-org:v3}COCT_MT530000UV.SubstanceAdministration"/>
 *               &lt;element name="supply" type="{urn:hl7-org:v3}COCT_MT530000UV.Supply"/>
 *               &lt;element name="procedure" type="{urn:hl7-org:v3}COCT_MT530000UV.Procedure"/>
 *               &lt;element name="encounter" type="{urn:hl7-org:v3}COCT_MT530000UV.Encounter"/>
 *               &lt;element name="act" type="{urn:hl7-org:v3}COCT_MT530000UV.Act"/>
 *               &lt;element name="organizer" type="{urn:hl7-org:v3}COCT_MT530000UV.Organizer"/>
 *             &lt;/choice>
 *             &lt;element name="actReference" type="{urn:hl7-org:v3}COCT_MT530000UV.ActReference"/>
 *           &lt;/choice>
 *           &lt;element name="transportation" type="{urn:hl7-org:v3}COCT_MT060000UV01.Transportation"/>
 *           &lt;element name="serviceDefinition" type="{urn:hl7-org:v3}COCT_MT510000UV06.ServiceDefinition"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ActRelationshipType" fixed="INST" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT510000UV06.Definition", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "billableClinicalService1",
    "billableClinicalProduct1",
    "supplyEvent1",
    "accomodationSupplied1",
    "supplyEvent2",
    "oralHealthService1",
    "crossReference1",
    "observation",
    "substanceAdministration",
    "supply",
    "procedure",
    "encounter",
    "act",
    "organizer",
    "actReference",
    "transportation",
    "serviceDefinition"
})
public class COCTMT510000UV06Definition {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElementRef(name = "billableClinicalService1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT290000UV06BillableClinicalService> billableClinicalService1;
    @XmlElementRef(name = "billableClinicalProduct1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT490000UV04BillableClinicalProduct> billableClinicalProduct1;
    @XmlElementRef(name = "supplyEvent1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT300000UV04SupplyEvent> supplyEvent1;
    @XmlElementRef(name = "accomodationSupplied1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT310000UV04AccomodationSupplied> accomodationSupplied1;
    @XmlElementRef(name = "supplyEvent2", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT600000UV06SupplyEvent> supplyEvent2;
    @XmlElementRef(name = "oralHealthService1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT740000UV04OralHealthService> oralHealthService1;
    @XmlElementRef(name = "crossReference1", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT280000UV04CrossReference> crossReference1;
    @XmlElementRef(name = "observation", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVObservation> observation;
    @XmlElementRef(name = "substanceAdministration", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVSubstanceAdministration> substanceAdministration;
    @XmlElementRef(name = "supply", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVSupply> supply;
    @XmlElementRef(name = "procedure", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVProcedure> procedure;
    @XmlElementRef(name = "encounter", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVEncounter> encounter;
    @XmlElementRef(name = "act", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVAct> act;
    @XmlElementRef(name = "organizer", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVOrganizer> organizer;
    @XmlElementRef(name = "actReference", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVActReference> actReference;
    @XmlElementRef(name = "transportation", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT060000UV01Transportation> transportation;
    @XmlElementRef(name = "serviceDefinition", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT510000UV06ServiceDefinition> serviceDefinition;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected List<String> typeCode;

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
     * Obtém o valor da propriedade billableClinicalService1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06BillableClinicalService }{@code >}
     *     
     */
    public JAXBElement<COCTMT290000UV06BillableClinicalService> getBillableClinicalService1() {
        return billableClinicalService1;
    }

    /**
     * Define o valor da propriedade billableClinicalService1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT290000UV06BillableClinicalService }{@code >}
     *     
     */
    public void setBillableClinicalService1(JAXBElement<COCTMT290000UV06BillableClinicalService> value) {
        this.billableClinicalService1 = value;
    }

    /**
     * Obtém o valor da propriedade billableClinicalProduct1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04BillableClinicalProduct }{@code >}
     *     
     */
    public JAXBElement<COCTMT490000UV04BillableClinicalProduct> getBillableClinicalProduct1() {
        return billableClinicalProduct1;
    }

    /**
     * Define o valor da propriedade billableClinicalProduct1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT490000UV04BillableClinicalProduct }{@code >}
     *     
     */
    public void setBillableClinicalProduct1(JAXBElement<COCTMT490000UV04BillableClinicalProduct> value) {
        this.billableClinicalProduct1 = value;
    }

    /**
     * Obtém o valor da propriedade supplyEvent1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04SupplyEvent }{@code >}
     *     
     */
    public JAXBElement<COCTMT300000UV04SupplyEvent> getSupplyEvent1() {
        return supplyEvent1;
    }

    /**
     * Define o valor da propriedade supplyEvent1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT300000UV04SupplyEvent }{@code >}
     *     
     */
    public void setSupplyEvent1(JAXBElement<COCTMT300000UV04SupplyEvent> value) {
        this.supplyEvent1 = value;
    }

    /**
     * Obtém o valor da propriedade accomodationSupplied1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT310000UV04AccomodationSupplied }{@code >}
     *     
     */
    public JAXBElement<COCTMT310000UV04AccomodationSupplied> getAccomodationSupplied1() {
        return accomodationSupplied1;
    }

    /**
     * Define o valor da propriedade accomodationSupplied1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT310000UV04AccomodationSupplied }{@code >}
     *     
     */
    public void setAccomodationSupplied1(JAXBElement<COCTMT310000UV04AccomodationSupplied> value) {
        this.accomodationSupplied1 = value;
    }

    /**
     * Obtém o valor da propriedade supplyEvent2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT600000UV06SupplyEvent }{@code >}
     *     
     */
    public JAXBElement<COCTMT600000UV06SupplyEvent> getSupplyEvent2() {
        return supplyEvent2;
    }

    /**
     * Define o valor da propriedade supplyEvent2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT600000UV06SupplyEvent }{@code >}
     *     
     */
    public void setSupplyEvent2(JAXBElement<COCTMT600000UV06SupplyEvent> value) {
        this.supplyEvent2 = value;
    }

    /**
     * Obtém o valor da propriedade oralHealthService1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT740000UV04OralHealthService }{@code >}
     *     
     */
    public JAXBElement<COCTMT740000UV04OralHealthService> getOralHealthService1() {
        return oralHealthService1;
    }

    /**
     * Define o valor da propriedade oralHealthService1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT740000UV04OralHealthService }{@code >}
     *     
     */
    public void setOralHealthService1(JAXBElement<COCTMT740000UV04OralHealthService> value) {
        this.oralHealthService1 = value;
    }

    /**
     * Obtém o valor da propriedade crossReference1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT280000UV04CrossReference }{@code >}
     *     
     */
    public JAXBElement<COCTMT280000UV04CrossReference> getCrossReference1() {
        return crossReference1;
    }

    /**
     * Define o valor da propriedade crossReference1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT280000UV04CrossReference }{@code >}
     *     
     */
    public void setCrossReference1(JAXBElement<COCTMT280000UV04CrossReference> value) {
        this.crossReference1 = value;
    }

    /**
     * Obtém o valor da propriedade observation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVObservation> getObservation() {
        return observation;
    }

    /**
     * Define o valor da propriedade observation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}
     *     
     */
    public void setObservation(JAXBElement<COCTMT530000UVObservation> value) {
        this.observation = value;
    }

    /**
     * Obtém o valor da propriedade substanceAdministration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVSubstanceAdministration> getSubstanceAdministration() {
        return substanceAdministration;
    }

    /**
     * Define o valor da propriedade substanceAdministration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}
     *     
     */
    public void setSubstanceAdministration(JAXBElement<COCTMT530000UVSubstanceAdministration> value) {
        this.substanceAdministration = value;
    }

    /**
     * Obtém o valor da propriedade supply.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVSupply> getSupply() {
        return supply;
    }

    /**
     * Define o valor da propriedade supply.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}
     *     
     */
    public void setSupply(JAXBElement<COCTMT530000UVSupply> value) {
        this.supply = value;
    }

    /**
     * Obtém o valor da propriedade procedure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVProcedure> getProcedure() {
        return procedure;
    }

    /**
     * Define o valor da propriedade procedure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}
     *     
     */
    public void setProcedure(JAXBElement<COCTMT530000UVProcedure> value) {
        this.procedure = value;
    }

    /**
     * Obtém o valor da propriedade encounter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVEncounter> getEncounter() {
        return encounter;
    }

    /**
     * Define o valor da propriedade encounter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}
     *     
     */
    public void setEncounter(JAXBElement<COCTMT530000UVEncounter> value) {
        this.encounter = value;
    }

    /**
     * Obtém o valor da propriedade act.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVAct> getAct() {
        return act;
    }

    /**
     * Define o valor da propriedade act.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}
     *     
     */
    public void setAct(JAXBElement<COCTMT530000UVAct> value) {
        this.act = value;
    }

    /**
     * Obtém o valor da propriedade organizer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVOrganizer> getOrganizer() {
        return organizer;
    }

    /**
     * Define o valor da propriedade organizer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}
     *     
     */
    public void setOrganizer(JAXBElement<COCTMT530000UVOrganizer> value) {
        this.organizer = value;
    }

    /**
     * Obtém o valor da propriedade actReference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVActReference> getActReference() {
        return actReference;
    }

    /**
     * Define o valor da propriedade actReference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}
     *     
     */
    public void setActReference(JAXBElement<COCTMT530000UVActReference> value) {
        this.actReference = value;
    }

    /**
     * Obtém o valor da propriedade transportation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT060000UV01Transportation }{@code >}
     *     
     */
    public JAXBElement<COCTMT060000UV01Transportation> getTransportation() {
        return transportation;
    }

    /**
     * Define o valor da propriedade transportation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT060000UV01Transportation }{@code >}
     *     
     */
    public void setTransportation(JAXBElement<COCTMT060000UV01Transportation> value) {
        this.transportation = value;
    }

    /**
     * Obtém o valor da propriedade serviceDefinition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06ServiceDefinition }{@code >}
     *     
     */
    public JAXBElement<COCTMT510000UV06ServiceDefinition> getServiceDefinition() {
        return serviceDefinition;
    }

    /**
     * Define o valor da propriedade serviceDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT510000UV06ServiceDefinition }{@code >}
     *     
     */
    public void setServiceDefinition(JAXBElement<COCTMT510000UV06ServiceDefinition> value) {
        this.serviceDefinition = value;
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
     * Gets the value of the typeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<String>();
        }
        return this.typeCode;
    }

}

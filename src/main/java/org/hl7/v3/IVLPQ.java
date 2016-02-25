
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IVL_PQ complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IVL_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_PQ">
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element name="low" type="{urn:hl7-org:v3}IVXB_PQ"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *             &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PQ" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PQ"/>
 *         &lt;sequence>
 *           &lt;element name="width" type="{urn:hl7-org:v3}PQ"/>
 *           &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PQ" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="center" type="{urn:hl7-org:v3}PQ"/>
 *           &lt;element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_PQ", propOrder = {
    "rest"
})
@XmlSeeAlso({
    BXITIVLPQ.class
})
public class IVLPQ
    extends SXCMPQ
{

    @XmlElementRefs({
        @XmlElementRef(name = "center", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "high", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "low", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "width", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends PQ>> rest;

    /**
     * Obtém o restante do modelo do conteúdo. 
     * 
     * <p>
     * Você está obtendo esta propriedade "catch-all" pelo seguinte motivo: 
     * O nome do campo "High" é usado por duas partes diferentes de um esquema. Consulte: 
     * linha 180 de file:/home/insystem/workspace/cns/src/main/java/META-INF/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * linha 171 de file:/home/insystem/workspace/cns/src/main/java/META-INF/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * <p>
     * Para eliminar esta propriedade, aplique uma personalização de propriedade a uma 
     * das seguintes declarações, a fim de alterar seus nomes: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IVXBPQ }{@code >}
     * {@link JAXBElement }{@code <}{@link PQ }{@code >}
     * {@link JAXBElement }{@code <}{@link IVXBPQ }{@code >}
     * {@link JAXBElement }{@code <}{@link PQ }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PQ>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends PQ>>();
        }
        return this.rest;
    }

}

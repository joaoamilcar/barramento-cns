
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RTO_PQ_PQ complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RTO_PQ_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QTY">
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{urn:hl7-org:v3}PQ"/>
 *         &lt;element name="denominator" type="{urn:hl7-org:v3}PQ"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTO_PQ_PQ", propOrder = {
    "numerator",
    "denominator"
})
public class RTOPQPQ
    extends QTY
{

    @XmlElement(required = true)
    protected PQ numerator;
    @XmlElement(required = true)
    protected PQ denominator;

    /**
     * Obtém o valor da propriedade numerator.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getNumerator() {
        return numerator;
    }

    /**
     * Define o valor da propriedade numerator.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setNumerator(PQ value) {
        this.numerator = value;
    }

    /**
     * Obtém o valor da propriedade denominator.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getDenominator() {
        return denominator;
    }

    /**
     * Define o valor da propriedade denominator.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setDenominator(PQ value) {
        this.denominator = value;
    }

}

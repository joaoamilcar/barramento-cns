
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RTO_QTY_QTY complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RTO_QTY_QTY">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QTY">
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{urn:hl7-org:v3}QTY"/>
 *         &lt;element name="denominator" type="{urn:hl7-org:v3}QTY"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTO_QTY_QTY", propOrder = {
    "numerator",
    "denominator"
})
@XmlSeeAlso({
    RTO.class
})
public class RTOQTYQTY
    extends QTY
{

    @XmlElement(required = true)
    protected QTY numerator;
    @XmlElement(required = true)
    protected QTY denominator;

    /**
     * Obtém o valor da propriedade numerator.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getNumerator() {
        return numerator;
    }

    /**
     * Define o valor da propriedade numerator.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setNumerator(QTY value) {
        this.numerator = value;
    }

    /**
     * Obtém o valor da propriedade denominator.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getDenominator() {
        return denominator;
    }

    /**
     * Define o valor da propriedade denominator.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setDenominator(QTY value) {
        this.denominator = value;
    }

}

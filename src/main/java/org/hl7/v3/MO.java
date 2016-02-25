
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *             A monetary amount is a quantity expressing the amount of
 *             money in some currency. Currencies are the units in which
 *             monetary amounts are denominated in different economic
 *             regions. While the monetary amount is a single kind of
 *             quantity (money) the exchange rates between the different
 *             units are variable.  This is the principle difference
 *             between physical quantity and monetary amounts, and the
 *             reason why currency units are not physical units.
 *          
 * 
 * <p>Classe Java de MO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MO">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QTY">
 *       &lt;attribute name="value" type="{urn:hl7-org:v3}real" />
 *       &lt;attribute name="currency" type="{urn:hl7-org:v3}cs" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MO")
@XmlSeeAlso({
    IVXBMO.class,
    SXCMMO.class
})
public class MO
    extends QTY
{

    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String currency;

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtém o valor da propriedade currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define o valor da propriedade currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Fractional numbers. Typically used whenever quantities
 *             are measured, estimated, or computed from other real
 *             numbers.  The typical representation is decimal, where
 *             the number of significant decimal digits is known as the
 *             precision. Real numbers are needed beyond integers
 *             whenever quantities of the real world are measured,
 *             estimated, or computed from other real numbers. The term
 *             "Real number" in this specification is used to mean
 *             that fractional values are covered without necessarily
 *             implying the full set of the mathematical real numbers.
 *          
 * 
 * <p>Classe Java de REAL complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="REAL">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QTY">
 *       &lt;attribute name="value" type="{urn:hl7-org:v3}real" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REAL")
@XmlSeeAlso({
    SXCMREAL.class,
    IVXBREAL.class
})
public class REAL
    extends QTY
{

    @XmlAttribute(name = "value")
    protected String value;

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

}

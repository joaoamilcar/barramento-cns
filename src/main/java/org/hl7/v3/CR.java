
package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A concept qualifier code with optionally named role.
 *             Both qualifier role and value codes must be defined by
 *             the coding system.  For example, if SNOMED RT defines a
 *             concept "leg", a role relation "has-laterality", and
 *             another concept "left", the concept role relation allows
 *             to add the qualifier "has-laterality: left" to a primary
 *             code "leg" to construct the meaning "left leg".
 *          
 * 
 * <p>Classe Java de CR complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CR">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ANY">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:hl7-org:v3}CV" minOccurs="0"/>
 *         &lt;element name="value" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inverted" type="{urn:hl7-org:v3}bn" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CR", propOrder = {
    "name",
    "value"
})
public class CR
    extends ANY
{

    protected CV name;
    protected CD value;
    @XmlAttribute(name = "inverted")
    protected Boolean inverted;

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setName(CV value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setValue(CD value) {
        this.value = value;
    }

    /**
     * Obtém o valor da propriedade inverted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInverted() {
        if (inverted == null) {
            return false;
        } else {
            return inverted;
        }
    }

    /**
     * Define o valor da propriedade inverted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInverted(Boolean value) {
        this.inverted = value;
    }

}

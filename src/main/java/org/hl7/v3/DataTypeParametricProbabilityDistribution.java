
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeParametricProbabilityDistribution.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeParametricProbabilityDistribution">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PPD&lt;QTY>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeParametricProbabilityDistribution")
@XmlEnum
public enum DataTypeParametricProbabilityDistribution {

    @XmlEnumValue("PPD<QTY>")
    PPD_QTY("PPD<QTY>");
    private final String value;

    DataTypeParametricProbabilityDistribution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeParametricProbabilityDistribution fromValue(String v) {
        for (DataTypeParametricProbabilityDistribution c: DataTypeParametricProbabilityDistribution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

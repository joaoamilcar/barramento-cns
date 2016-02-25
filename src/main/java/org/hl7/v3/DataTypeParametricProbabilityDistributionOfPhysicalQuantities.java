
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeParametricProbabilityDistributionOfPhysicalQuantities.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeParametricProbabilityDistributionOfPhysicalQuantities">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PPD&lt;PQ>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeParametricProbabilityDistributionOfPhysicalQuantities")
@XmlEnum
public enum DataTypeParametricProbabilityDistributionOfPhysicalQuantities {

    @XmlEnumValue("PPD<PQ>")
    PPD_PQ("PPD<PQ>");
    private final String value;

    DataTypeParametricProbabilityDistributionOfPhysicalQuantities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeParametricProbabilityDistributionOfPhysicalQuantities fromValue(String v) {
        for (DataTypeParametricProbabilityDistributionOfPhysicalQuantities c: DataTypeParametricProbabilityDistributionOfPhysicalQuantities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

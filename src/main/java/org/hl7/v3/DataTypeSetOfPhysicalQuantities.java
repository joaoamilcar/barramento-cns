
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeSetOfPhysicalQuantities.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeSetOfPhysicalQuantities">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SET&lt;PQ>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeSetOfPhysicalQuantities")
@XmlEnum
public enum DataTypeSetOfPhysicalQuantities {

    @XmlEnumValue("SET<PQ>")
    SET_PQ("SET<PQ>");
    private final String value;

    DataTypeSetOfPhysicalQuantities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeSetOfPhysicalQuantities fromValue(String v) {
        for (DataTypeSetOfPhysicalQuantities c: DataTypeSetOfPhysicalQuantities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

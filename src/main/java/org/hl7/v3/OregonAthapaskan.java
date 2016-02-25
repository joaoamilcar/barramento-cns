
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OregonAthapaskan.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OregonAthapaskan">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-TOL"/>
 *     &lt;enumeration value="x-TUU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OregonAthapaskan")
@XmlEnum
public enum OregonAthapaskan {

    @XmlEnumValue("x-TOL")
    X_TOL("x-TOL"),
    @XmlEnumValue("x-TUU")
    X_TUU("x-TUU");
    private final String value;

    OregonAthapaskan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OregonAthapaskan fromValue(String v) {
        for (OregonAthapaskan c: OregonAthapaskan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

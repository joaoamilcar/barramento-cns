
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CodingRationale.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CodingRationale">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SH"/>
 *     &lt;enumeration value="HL7"/>
 *     &lt;enumeration value="SRC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodingRationale")
@XmlEnum
public enum CodingRationale {

    SH("SH"),
    @XmlEnumValue("HL7")
    HL_7("HL7"),
    SRC("SRC");
    private final String value;

    CodingRationale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodingRationale fromValue(String v) {
        for (CodingRationale c: CodingRationale.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

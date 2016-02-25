
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HL7ITSVersionCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HL7ITSVersionCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="XMLV1PR1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HL7ITSVersionCode")
@XmlEnum
public enum HL7ITSVersionCode {

    @XmlEnumValue("XMLV1PR1")
    XMLV_1_PR_1("XMLV1PR1");
    private final String value;

    HL7ITSVersionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HL7ITSVersionCode fromValue(String v) {
        for (HL7ITSVersionCode c: HL7ITSVersionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

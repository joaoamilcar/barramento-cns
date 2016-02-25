
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ChiwereWinnebago.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ChiwereWinnebago">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-IOW"/>
 *     &lt;enumeration value="x-WIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChiwereWinnebago")
@XmlEnum
public enum ChiwereWinnebago {

    @XmlEnumValue("x-IOW")
    X_IOW("x-IOW"),
    @XmlEnumValue("x-WIN")
    X_WIN("x-WIN");
    private final String value;

    ChiwereWinnebago(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChiwereWinnebago fromValue(String v) {
        for (ChiwereWinnebago c: ChiwereWinnebago.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

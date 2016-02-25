
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_ActStatusActiveSuspended.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActStatusActiveSuspended">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActStatusActiveSuspended")
@XmlEnum
public enum XActStatusActiveSuspended {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended");
    private final String value;

    XActStatusActiveSuspended(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XActStatusActiveSuspended fromValue(String v) {
        for (XActStatusActiveSuspended c: XActStatusActiveSuspended.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

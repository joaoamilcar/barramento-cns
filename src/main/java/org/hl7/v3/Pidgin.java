
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Pidgin.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Pidgin">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-CHH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Pidgin")
@XmlEnum
public enum Pidgin {

    @XmlEnumValue("x-CHH")
    X_CHH("x-CHH");
    private final String value;

    Pidgin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Pidgin fromValue(String v) {
        for (Pidgin c: Pidgin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

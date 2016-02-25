
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Palaihnihan.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Palaihnihan">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-ACH"/>
 *     &lt;enumeration value="x-ATW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Palaihnihan")
@XmlEnum
public enum Palaihnihan {

    @XmlEnumValue("x-ACH")
    X_ACH("x-ACH"),
    @XmlEnumValue("x-ATW")
    X_ATW("x-ATW");
    private final String value;

    Palaihnihan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Palaihnihan fromValue(String v) {
        for (Palaihnihan c: Palaihnihan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

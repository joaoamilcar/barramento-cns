
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EasternMiwok.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EasternMiwok">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-CSM"/>
 *     &lt;enumeration value="x-NSQ"/>
 *     &lt;enumeration value="x-PMW"/>
 *     &lt;enumeration value="x-SKD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EasternMiwok")
@XmlEnum
public enum EasternMiwok {

    @XmlEnumValue("x-CSM")
    X_CSM("x-CSM"),
    @XmlEnumValue("x-NSQ")
    X_NSQ("x-NSQ"),
    @XmlEnumValue("x-PMW")
    X_PMW("x-PMW"),
    @XmlEnumValue("x-SKD")
    X_SKD("x-SKD");
    private final String value;

    EasternMiwok(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EasternMiwok fromValue(String v) {
        for (EasternMiwok c: EasternMiwok.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

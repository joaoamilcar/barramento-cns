
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WesternMuskogean.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WesternMuskogean">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-CIC"/>
 *     &lt;enumeration value="x-CCT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WesternMuskogean")
@XmlEnum
public enum WesternMuskogean {

    @XmlEnumValue("x-CIC")
    X_CIC("x-CIC"),
    @XmlEnumValue("x-CCT")
    X_CCT("x-CCT");
    private final String value;

    WesternMuskogean(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WesternMuskogean fromValue(String v) {
        for (WesternMuskogean c: WesternMuskogean.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

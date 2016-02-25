
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EasternApachean.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EasternApachean">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-APJ"/>
 *     &lt;enumeration value="x-APL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EasternApachean")
@XmlEnum
public enum EasternApachean {

    @XmlEnumValue("x-APJ")
    X_APJ("x-APJ"),
    @XmlEnumValue("x-APL")
    X_APL("x-APL");
    private final String value;

    EasternApachean(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EasternApachean fromValue(String v) {
        for (EasternApachean c: EasternApachean.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

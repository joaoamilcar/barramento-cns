
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Dakotan.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Dakotan">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-ASB"/>
 *     &lt;enumeration value="x-DHG"/>
 *     &lt;enumeration value="x-LKT"/>
 *     &lt;enumeration value="x-NKT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dakotan")
@XmlEnum
public enum Dakotan {

    @XmlEnumValue("x-ASB")
    X_ASB("x-ASB"),
    @XmlEnumValue("x-DHG")
    X_DHG("x-DHG"),
    @XmlEnumValue("x-LKT")
    X_LKT("x-LKT"),
    @XmlEnumValue("x-NKT")
    X_NKT("x-NKT");
    private final String value;

    Dakotan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dakotan fromValue(String v) {
        for (Dakotan c: Dakotan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

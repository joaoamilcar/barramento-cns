
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CaliforniaAthapaskan.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CaliforniaAthapaskan">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-KTW"/>
 *     &lt;enumeration value="x-HUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaliforniaAthapaskan")
@XmlEnum
public enum CaliforniaAthapaskan {

    @XmlEnumValue("x-KTW")
    X_KTW("x-KTW"),
    @XmlEnumValue("x-HUP")
    X_HUP("x-HUP");
    private final String value;

    CaliforniaAthapaskan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaliforniaAthapaskan fromValue(String v) {
        for (CaliforniaAthapaskan c: CaliforniaAthapaskan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

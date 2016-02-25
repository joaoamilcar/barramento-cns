
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Diegueno.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Diegueno">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-DIH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Diegueno")
@XmlEnum
public enum Diegueno {

    @XmlEnumValue("x-DIH")
    X_DIH("x-DIH");
    private final String value;

    Diegueno(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Diegueno fromValue(String v) {
        for (Diegueno c: Diegueno.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FontStyle.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FontStyle">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="bold"/>
 *     &lt;enumeration value="emphasis"/>
 *     &lt;enumeration value="italics"/>
 *     &lt;enumeration value="underline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FontStyle")
@XmlEnum
public enum FontStyle {

    @XmlEnumValue("bold")
    BOLD("bold"),
    @XmlEnumValue("emphasis")
    EMPHASIS("emphasis"),
    @XmlEnumValue("italics")
    ITALICS("italics"),
    @XmlEnumValue("underline")
    UNDERLINE("underline");
    private final String value;

    FontStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontStyle fromValue(String v) {
        for (FontStyle c: FontStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

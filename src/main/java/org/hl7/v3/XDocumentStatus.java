
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_DocumentStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_DocumentStatus">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="obsolete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_DocumentStatus")
@XmlEnum
public enum XDocumentStatus {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("obsolete")
    OBSOLETE("obsolete");
    private final String value;

    XDocumentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XDocumentStatus fromValue(String v) {
        for (XDocumentStatus c: XDocumentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

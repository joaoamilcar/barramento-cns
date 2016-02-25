
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MdfRmimRowType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MdfRmimRowType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="assoc"/>
 *     &lt;enumeration value="attr"/>
 *     &lt;enumeration value="class"/>
 *     &lt;enumeration value="rmim"/>
 *     &lt;enumeration value="stc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MdfRmimRowType")
@XmlEnum
public enum MdfRmimRowType {

    @XmlEnumValue("assoc")
    ASSOC("assoc"),
    @XmlEnumValue("attr")
    ATTR("attr"),
    @XmlEnumValue("class")
    CLASS("class"),
    @XmlEnumValue("rmim")
    RMIM("rmim"),
    @XmlEnumValue("stc")
    STC("stc");
    private final String value;

    MdfRmimRowType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MdfRmimRowType fromValue(String v) {
        for (MdfRmimRowType c: MdfRmimRowType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

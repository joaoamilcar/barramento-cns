
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_LabProcessClassCodes.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_LabProcessClassCodes">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ACSN"/>
 *     &lt;enumeration value="CONTREG"/>
 *     &lt;enumeration value="PROC"/>
 *     &lt;enumeration value="SPCTRT"/>
 *     &lt;enumeration value="TRNS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_LabProcessClassCodes")
@XmlEnum
public enum XLabProcessClassCodes {

    ACSN,
    CONTREG,
    PROC,
    SPCTRT,
    TRNS;

    public String value() {
        return name();
    }

    public static XLabProcessClassCodes fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MedicationCap.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationCap">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CHILD"/>
 *     &lt;enumeration value="EASY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicationCap")
@XmlEnum
public enum MedicationCap {

    CHILD,
    EASY;

    public String value() {
        return name();
    }

    public static MedicationCap fromValue(String v) {
        return valueOf(v);
    }

}

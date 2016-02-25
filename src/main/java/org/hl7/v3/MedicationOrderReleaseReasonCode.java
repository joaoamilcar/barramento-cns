
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MedicationOrderReleaseReasonCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationOrderReleaseReasonCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HOLDINAP"/>
 *     &lt;enumeration value="HOLDDONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicationOrderReleaseReasonCode")
@XmlEnum
public enum MedicationOrderReleaseReasonCode {

    HOLDINAP,
    HOLDDONE;

    public String value() {
        return name();
    }

    public static MedicationOrderReleaseReasonCode fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActMedicationTherapyDurationWorkingListCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMedicationTherapyDurationWorkingListCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRN"/>
 *     &lt;enumeration value="CHRON"/>
 *     &lt;enumeration value="ONET"/>
 *     &lt;enumeration value="ACU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActMedicationTherapyDurationWorkingListCode")
@XmlEnum
public enum ActMedicationTherapyDurationWorkingListCode {

    PRN,
    CHRON,
    ONET,
    ACU;

    public String value() {
        return name();
    }

    public static ActMedicationTherapyDurationWorkingListCode fromValue(String v) {
        return valueOf(v);
    }

}

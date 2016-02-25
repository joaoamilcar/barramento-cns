
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActTaskMedicationListReviewCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskMedicationListReviewCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MLREV"/>
 *     &lt;enumeration value="MARWLREV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActTaskMedicationListReviewCode")
@XmlEnum
public enum ActTaskMedicationListReviewCode {

    MLREV,
    MARWLREV;

    public String value() {
        return name();
    }

    public static ActTaskMedicationListReviewCode fromValue(String v) {
        return valueOf(v);
    }

}

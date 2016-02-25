
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActTaskMicrobiologyResultsReviewCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskMicrobiologyResultsReviewCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MICRORREV"/>
 *     &lt;enumeration value="MICROORGRREV"/>
 *     &lt;enumeration value="MICROSENSRREV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActTaskMicrobiologyResultsReviewCode")
@XmlEnum
public enum ActTaskMicrobiologyResultsReviewCode {

    MICRORREV,
    MICROORGRREV,
    MICROSENSRREV;

    public String value() {
        return name();
    }

    public static ActTaskMicrobiologyResultsReviewCode fromValue(String v) {
        return valueOf(v);
    }

}

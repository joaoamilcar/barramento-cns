
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActTaskRiskAssessmentInstrumentCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskRiskAssessmentInstrumentCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RISKASSESS"/>
 *     &lt;enumeration value="FALLRISK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActTaskRiskAssessmentInstrumentCode")
@XmlEnum
public enum ActTaskRiskAssessmentInstrumentCode {

    RISKASSESS,
    FALLRISK;

    public String value() {
        return name();
    }

    public static ActTaskRiskAssessmentInstrumentCode fromValue(String v) {
        return valueOf(v);
    }

}

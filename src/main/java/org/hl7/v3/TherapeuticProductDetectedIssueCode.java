
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TherapeuticProductDetectedIssueCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TherapeuticProductDetectedIssueCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TPROD"/>
 *     &lt;enumeration value="DRG"/>
 *     &lt;enumeration value="NHP"/>
 *     &lt;enumeration value="NONRX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TherapeuticProductDetectedIssueCode")
@XmlEnum
public enum TherapeuticProductDetectedIssueCode {

    TPROD,
    DRG,
    NHP,
    NONRX;

    public String value() {
        return name();
    }

    public static TherapeuticProductDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}

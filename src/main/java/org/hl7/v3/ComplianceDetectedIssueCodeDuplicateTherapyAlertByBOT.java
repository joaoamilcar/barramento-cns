
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DUPTHPY"/>
 *     &lt;enumeration value="DUPTHPGEN"/>
 *     &lt;enumeration value="DUPTHPCLS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT")
@XmlEnum
public enum ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT {

    DUPTHPY,
    DUPTHPGEN,
    DUPTHPCLS;

    public String value() {
        return name();
    }

    public static ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT fromValue(String v) {
        return valueOf(v);
    }

}

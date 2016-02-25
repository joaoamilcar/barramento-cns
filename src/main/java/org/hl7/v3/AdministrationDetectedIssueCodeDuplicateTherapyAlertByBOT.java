
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AdministrationDetectedIssueCodeDuplicateTherapyAlertByBOT.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrationDetectedIssueCodeDuplicateTherapyAlertByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DUPTHPY"/>
 *     &lt;enumeration value="DUPTHPGEN"/>
 *     &lt;enumeration value="DUPTHPCLS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdministrationDetectedIssueCodeDuplicateTherapyAlertByBOT")
@XmlEnum
public enum AdministrationDetectedIssueCodeDuplicateTherapyAlertByBOT {

    DUPTHPY,
    DUPTHPGEN,
    DUPTHPCLS;

    public String value() {
        return name();
    }

    public static AdministrationDetectedIssueCodeDuplicateTherapyAlertByBOT fromValue(String v) {
        return valueOf(v);
    }

}

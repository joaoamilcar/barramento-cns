
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DoseDurationLowDetectedIssueCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DoseDurationLowDetectedIssueCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DOSEDURL"/>
 *     &lt;enumeration value="DOSEDURLIND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DoseDurationLowDetectedIssueCode")
@XmlEnum
public enum DoseDurationLowDetectedIssueCode {

    DOSEDURL,
    DOSEDURLIND;

    public String value() {
        return name();
    }

    public static DoseDurationLowDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}

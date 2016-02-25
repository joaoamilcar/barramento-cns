
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SubstanceAdminSubstitutionNotAllowedReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SubstanceAdminSubstitutionNotAllowedReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PAT"/>
 *     &lt;enumeration value="ALGINT"/>
 *     &lt;enumeration value="TRIAL"/>
 *     &lt;enumeration value="COMPCON"/>
 *     &lt;enumeration value="THERCHAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubstanceAdminSubstitutionNotAllowedReason")
@XmlEnum
public enum SubstanceAdminSubstitutionNotAllowedReason {

    PAT,
    ALGINT,
    TRIAL,
    COMPCON,
    THERCHAR;

    public String value() {
        return name();
    }

    public static SubstanceAdminSubstitutionNotAllowedReason fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActSubstanceAdministrationImmunizationCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSubstanceAdministrationImmunizationCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IMMUNIZ"/>
 *     &lt;enumeration value="BOOSTER"/>
 *     &lt;enumeration value="INITIMMUNIZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActSubstanceAdministrationImmunizationCode")
@XmlEnum
public enum ActSubstanceAdministrationImmunizationCode {

    IMMUNIZ,
    BOOSTER,
    INITIMMUNIZ;

    public String value() {
        return name();
    }

    public static ActSubstanceAdministrationImmunizationCode fromValue(String v) {
        return valueOf(v);
    }

}

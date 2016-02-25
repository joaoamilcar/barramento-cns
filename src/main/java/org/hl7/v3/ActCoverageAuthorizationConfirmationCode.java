
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActCoverageAuthorizationConfirmationCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActCoverageAuthorizationConfirmationCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AUTH"/>
 *     &lt;enumeration value="NAUTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActCoverageAuthorizationConfirmationCode")
@XmlEnum
public enum ActCoverageAuthorizationConfirmationCode {

    AUTH,
    NAUTH;

    public String value() {
        return name();
    }

    public static ActCoverageAuthorizationConfirmationCode fromValue(String v) {
        return valueOf(v);
    }

}

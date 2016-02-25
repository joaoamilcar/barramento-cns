
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoleClassExposureAgentCarrier.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassExposureAgentCarrier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXPAGTCAR"/>
 *     &lt;enumeration value="EXPVECTOR"/>
 *     &lt;enumeration value="FOMITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassExposureAgentCarrier")
@XmlEnum
public enum RoleClassExposureAgentCarrier {

    EXPAGTCAR,
    EXPVECTOR,
    FOMITE;

    public String value() {
        return name();
    }

    public static RoleClassExposureAgentCarrier fromValue(String v) {
        return valueOf(v);
    }

}

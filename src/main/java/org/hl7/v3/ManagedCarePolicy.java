
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ManagedCarePolicy.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagedCarePolicy">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MCPOL"/>
 *     &lt;enumeration value="HMO"/>
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="PPO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManagedCarePolicy")
@XmlEnum
public enum ManagedCarePolicy {

    MCPOL,
    HMO,
    POS,
    PPO;

    public String value() {
        return name();
    }

    public static ManagedCarePolicy fromValue(String v) {
        return valueOf(v);
    }

}

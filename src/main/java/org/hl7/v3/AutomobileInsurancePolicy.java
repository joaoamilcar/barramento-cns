
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AutomobileInsurancePolicy.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AutomobileInsurancePolicy">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AUTOPOL"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="UNINSMOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutomobileInsurancePolicy")
@XmlEnum
public enum AutomobileInsurancePolicy {

    AUTOPOL,
    COL,
    UNINSMOT;

    public String value() {
        return name();
    }

    public static AutomobileInsurancePolicy fromValue(String v) {
        return valueOf(v);
    }

}

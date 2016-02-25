
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StepChild.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StepChild">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="STPCHLD"/>
 *     &lt;enumeration value="STPDAU"/>
 *     &lt;enumeration value="STPSON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StepChild")
@XmlEnum
public enum StepChild {

    STPCHLD,
    STPDAU,
    STPSON;

    public String value() {
        return name();
    }

    public static StepChild fromValue(String v) {
        return valueOf(v);
    }

}

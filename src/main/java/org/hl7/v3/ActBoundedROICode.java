
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActBoundedROICode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActBoundedROICode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ROIFS"/>
 *     &lt;enumeration value="ROIPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActBoundedROICode")
@XmlEnum
public enum ActBoundedROICode {

    ROIFS,
    ROIPS;

    public String value() {
        return name();
    }

    public static ActBoundedROICode fromValue(String v) {
        return valueOf(v);
    }

}

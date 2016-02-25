
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VaginalRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VaginalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DOUCHE"/>
 *     &lt;enumeration value="VAGINSI"/>
 *     &lt;enumeration value="VAGINS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VaginalRoute")
@XmlEnum
public enum VaginalRoute {

    DOUCHE,
    VAGINSI,
    VAGINS;

    public String value() {
        return name();
    }

    public static VaginalRoute fromValue(String v) {
        return valueOf(v);
    }

}

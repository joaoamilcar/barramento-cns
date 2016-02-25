
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HairRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HairRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SHAMPOO"/>
 *     &lt;enumeration value="HAIR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HairRoute")
@XmlEnum
public enum HairRoute {

    SHAMPOO,
    HAIR;

    public String value() {
        return name();
    }

    public static HairRoute fromValue(String v) {
        return valueOf(v);
    }

}

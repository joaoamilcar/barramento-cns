
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LaryngealRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LaryngealRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LARYNGINSTIL"/>
 *     &lt;enumeration value="LARYNGTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LaryngealRoute")
@XmlEnum
public enum LaryngealRoute {

    LARYNGINSTIL,
    LARYNGTA;

    public String value() {
        return name();
    }

    public static LaryngealRoute fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de JejunumRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="JejunumRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GJT"/>
 *     &lt;enumeration value="JJTINSTL"/>
 *     &lt;enumeration value="OJJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JejunumRoute")
@XmlEnum
public enum JejunumRoute {

    GJT,
    JJTINSTL,
    OJJ;

    public String value() {
        return name();
    }

    public static JejunumRoute fromValue(String v) {
        return valueOf(v);
    }

}

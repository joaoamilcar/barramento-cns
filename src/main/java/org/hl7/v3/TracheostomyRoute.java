
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TracheostomyRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TracheostomyRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TRACH"/>
 *     &lt;enumeration value="TRACHINSTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TracheostomyRoute")
@XmlEnum
public enum TracheostomyRoute {

    TRACH,
    TRACHINSTL;

    public String value() {
        return name();
    }

    public static TracheostomyRoute fromValue(String v) {
        return valueOf(v);
    }

}

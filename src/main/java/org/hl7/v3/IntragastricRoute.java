
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntragastricRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntragastricRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IGASTINSTIL"/>
 *     &lt;enumeration value="IGASTIRR"/>
 *     &lt;enumeration value="IGASTLAV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntragastricRoute")
@XmlEnum
public enum IntragastricRoute {

    IGASTINSTIL,
    IGASTIRR,
    IGASTLAV;

    public String value() {
        return name();
    }

    public static IntragastricRoute fromValue(String v) {
        return valueOf(v);
    }

}

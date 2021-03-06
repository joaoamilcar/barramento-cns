
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TopicalAbsorptionRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TopicalAbsorptionRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TTYMPTABSORP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TopicalAbsorptionRoute")
@XmlEnum
public enum TopicalAbsorptionRoute {

    TTYMPTABSORP;

    public String value() {
        return name();
    }

    public static TopicalAbsorptionRoute fromValue(String v) {
        return valueOf(v);
    }

}

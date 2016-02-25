
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AmnioticFluidSacRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AmnioticFluidSacRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AMNINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmnioticFluidSacRoute")
@XmlEnum
public enum AmnioticFluidSacRoute {

    AMNINJ;

    public String value() {
        return name();
    }

    public static AmnioticFluidSacRoute fromValue(String v) {
        return valueOf(v);
    }

}

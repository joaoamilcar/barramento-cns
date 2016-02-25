
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExtraAmnioticRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtraAmnioticRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXTRAMNINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtraAmnioticRoute")
@XmlEnum
public enum ExtraAmnioticRoute {

    EXTRAMNINJ;

    public String value() {
        return name();
    }

    public static ExtraAmnioticRoute fromValue(String v) {
        return valueOf(v);
    }

}

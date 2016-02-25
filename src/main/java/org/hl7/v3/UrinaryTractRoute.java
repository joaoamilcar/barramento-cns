
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UrinaryTractRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UrinaryTractRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BLADINSTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrinaryTractRoute")
@XmlEnum
public enum UrinaryTractRoute {

    BLADINSTL;

    public String value() {
        return name();
    }

    public static UrinaryTractRoute fromValue(String v) {
        return valueOf(v);
    }

}

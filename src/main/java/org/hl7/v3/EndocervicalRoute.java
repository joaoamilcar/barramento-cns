
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EndocervicalRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EndocervicalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AMNINJ"/>
 *     &lt;enumeration value="BILINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndocervicalRoute")
@XmlEnum
public enum EndocervicalRoute {

    AMNINJ,
    BILINJ;

    public String value() {
        return name();
    }

    public static EndocervicalRoute fromValue(String v) {
        return valueOf(v);
    }

}

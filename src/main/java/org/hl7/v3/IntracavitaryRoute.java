
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntracavitaryRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntracavitaryRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ICAVITINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntracavitaryRoute")
@XmlEnum
public enum IntracavitaryRoute {

    ICAVITINJ;

    public String value() {
        return name();
    }

    public static IntracavitaryRoute fromValue(String v) {
        return valueOf(v);
    }

}

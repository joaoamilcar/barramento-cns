
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntrapulmonaryRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrapulmonaryRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXTCORPINJ"/>
 *     &lt;enumeration value="IPINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntrapulmonaryRoute")
@XmlEnum
public enum IntrapulmonaryRoute {

    EXTCORPINJ,
    IPINJ;

    public String value() {
        return name();
    }

    public static IntrapulmonaryRoute fromValue(String v) {
        return valueOf(v);
    }

}

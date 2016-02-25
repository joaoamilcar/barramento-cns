
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntrathecalRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrathecalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="ITINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntrathecalRoute")
@XmlEnum
public enum IntrathecalRoute {

    IT,
    ITINJ;

    public String value() {
        return name();
    }

    public static IntrathecalRoute fromValue(String v) {
        return valueOf(v);
    }

}

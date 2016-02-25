
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntrabronchialRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrabronchialRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IBRONCHINSTIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntrabronchialRoute")
@XmlEnum
public enum IntrabronchialRoute {

    IBRONCHINSTIL;

    public String value() {
        return name();
    }

    public static IntrabronchialRoute fromValue(String v) {
        return valueOf(v);
    }

}

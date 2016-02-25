
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntrapericardialRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrapericardialRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IPCARDINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntrapericardialRoute")
@XmlEnum
public enum IntrapericardialRoute {

    IPCARDINJ;

    public String value() {
        return name();
    }

    public static IntrapericardialRoute fromValue(String v) {
        return valueOf(v);
    }

}

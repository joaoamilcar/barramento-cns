
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntramedullaryRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntramedullaryRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IMEDULINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntramedullaryRoute")
@XmlEnum
public enum IntramedullaryRoute {

    IMEDULINJ;

    public String value() {
        return name();
    }

    public static IntramedullaryRoute fromValue(String v) {
        return valueOf(v);
    }

}

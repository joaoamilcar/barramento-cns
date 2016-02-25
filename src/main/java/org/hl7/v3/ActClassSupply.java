
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActClassSupply.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassSupply">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SPLY"/>
 *     &lt;enumeration value="DIET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassSupply")
@XmlEnum
public enum ActClassSupply {

    SPLY,
    DIET;

    public String value() {
        return name();
    }

    public static ActClassSupply fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActClassPublicHealthCase.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassPublicHealthCase">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CASE"/>
 *     &lt;enumeration value="OUTB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassPublicHealthCase")
@XmlEnum
public enum ActClassPublicHealthCase {

    CASE,
    OUTB;

    public String value() {
        return name();
    }

    public static ActClassPublicHealthCase fromValue(String v) {
        return valueOf(v);
    }

}

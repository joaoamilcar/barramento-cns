
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActClassPosition.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassPosition">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="POSACC"/>
 *     &lt;enumeration value="POSCOORD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassPosition")
@XmlEnum
public enum ActClassPosition {

    POS,
    POSACC,
    POSCOORD;

    public String value() {
        return name();
    }

    public static ActClassPosition fromValue(String v) {
        return valueOf(v);
    }

}

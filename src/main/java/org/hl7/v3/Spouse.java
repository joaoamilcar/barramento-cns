
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Spouse.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Spouse">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SPS"/>
 *     &lt;enumeration value="HUSB"/>
 *     &lt;enumeration value="WIFE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Spouse")
@XmlEnum
public enum Spouse {

    SPS,
    HUSB,
    WIFE;

    public String value() {
        return name();
    }

    public static Spouse fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UrinaryBladderIrrigation.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UrinaryBladderIrrigation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BLADIRR"/>
 *     &lt;enumeration value="BLADIRRC"/>
 *     &lt;enumeration value="BLADIRRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrinaryBladderIrrigation")
@XmlEnum
public enum UrinaryBladderIrrigation {

    BLADIRR,
    BLADIRRC,
    BLADIRRT;

    public String value() {
        return name();
    }

    public static UrinaryBladderIrrigation fromValue(String v) {
        return valueOf(v);
    }

}

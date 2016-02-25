
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_ActMoodPermPermrq.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActMoodPermPermrq">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PERM"/>
 *     &lt;enumeration value="PERMRQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActMoodPermPermrq")
@XmlEnum
public enum XActMoodPermPermrq {

    PERM,
    PERMRQ;

    public String value() {
        return name();
    }

    public static XActMoodPermPermrq fromValue(String v) {
        return valueOf(v);
    }

}

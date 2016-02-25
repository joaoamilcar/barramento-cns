
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_ActMoodDefEvnRqo.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActMoodDefEvnRqo">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DEF"/>
 *     &lt;enumeration value="EVN"/>
 *     &lt;enumeration value="RQO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActMoodDefEvnRqo")
@XmlEnum
public enum XActMoodDefEvnRqo {

    DEF,
    EVN,
    RQO;

    public String value() {
        return name();
    }

    public static XActMoodDefEvnRqo fromValue(String v) {
        return valueOf(v);
    }

}

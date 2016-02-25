
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LengthOutOfRange.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LengthOutOfRange">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LEN_RANGE"/>
 *     &lt;enumeration value="LEN_LONG"/>
 *     &lt;enumeration value="LEN_SHORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LengthOutOfRange")
@XmlEnum
public enum LengthOutOfRange {

    LEN_RANGE,
    LEN_LONG,
    LEN_SHORT;

    public String value() {
        return name();
    }

    public static LengthOutOfRange fromValue(String v) {
        return valueOf(v);
    }

}

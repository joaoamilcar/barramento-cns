
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ParameterizedDataTypeBag.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeBag">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BAG&lt;T>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeBag")
@XmlEnum
public enum ParameterizedDataTypeBag {

    @XmlEnumValue("BAG<T>")
    BAG_T("BAG<T>");
    private final String value;

    ParameterizedDataTypeBag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeBag fromValue(String v) {
        for (ParameterizedDataTypeBag c: ParameterizedDataTypeBag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

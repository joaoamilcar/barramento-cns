
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResponseModality.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseModality">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseModality")
@XmlEnum
public enum ResponseModality {

    B,
    T,
    R;

    public String value() {
        return name();
    }

    public static ResponseModality fromValue(String v) {
        return valueOf(v);
    }

}

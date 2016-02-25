
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActUncertainty.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActUncertainty">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActUncertainty")
@XmlEnum
public enum ActUncertainty {

    N,
    U;

    public String value() {
        return name();
    }

    public static ActUncertainty fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StepSibling.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StepSibling">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="STPSIB"/>
 *     &lt;enumeration value="STPBRO"/>
 *     &lt;enumeration value="STPSIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StepSibling")
@XmlEnum
public enum StepSibling {

    STPSIB,
    STPBRO,
    STPSIS;

    public String value() {
        return name();
    }

    public static StepSibling fromValue(String v) {
        return valueOf(v);
    }

}

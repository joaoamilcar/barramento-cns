
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActSpecObsInterferenceCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecObsInterferenceCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INTFR"/>
 *     &lt;enumeration value="FIBRIN"/>
 *     &lt;enumeration value="HEMOLYSIS"/>
 *     &lt;enumeration value="ICTERUS"/>
 *     &lt;enumeration value="LIPEMIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActSpecObsInterferenceCode")
@XmlEnum
public enum ActSpecObsInterferenceCode {

    INTFR,
    FIBRIN,
    HEMOLYSIS,
    ICTERUS,
    LIPEMIA;

    public String value() {
        return name();
    }

    public static ActSpecObsInterferenceCode fromValue(String v) {
        return valueOf(v);
    }

}

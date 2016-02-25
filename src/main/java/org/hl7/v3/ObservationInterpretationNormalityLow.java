
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObservationInterpretationNormalityLow.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationNormalityLow">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="LL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationNormalityLow")
@XmlEnum
public enum ObservationInterpretationNormalityLow {

    L,
    LL;

    public String value() {
        return name();
    }

    public static ObservationInterpretationNormalityLow fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObservationInterpretationSusceptibility.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationSusceptibility">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="VS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationSusceptibility")
@XmlEnum
public enum ObservationInterpretationSusceptibility {

    I,
    MS,
    R,
    S,
    VS;

    public String value() {
        return name();
    }

    public static ObservationInterpretationSusceptibility fromValue(String v) {
        return valueOf(v);
    }

}

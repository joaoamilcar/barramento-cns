
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObservationInterpretationChange.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationChange">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="W"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationChange")
@XmlEnum
public enum ObservationInterpretationChange {

    B,
    D,
    U,
    W;

    public String value() {
        return name();
    }

    public static ObservationInterpretationChange fromValue(String v) {
        return valueOf(v);
    }

}

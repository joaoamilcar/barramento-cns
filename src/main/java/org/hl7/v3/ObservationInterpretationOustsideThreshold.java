
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObservationInterpretationOustsideThreshold.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationOustsideThreshold">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EX"/>
 *     &lt;enumeration value="HX"/>
 *     &lt;enumeration value="LX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationOustsideThreshold")
@XmlEnum
public enum ObservationInterpretationOustsideThreshold {

    EX,
    HX,
    LX;

    public String value() {
        return name();
    }

    public static ObservationInterpretationOustsideThreshold fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SchedulingActReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SchedulingActReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MTG"/>
 *     &lt;enumeration value="MED"/>
 *     &lt;enumeration value="FIN"/>
 *     &lt;enumeration value="DEC"/>
 *     &lt;enumeration value="PAT"/>
 *     &lt;enumeration value="PHY"/>
 *     &lt;enumeration value="BLK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SchedulingActReason")
@XmlEnum
public enum SchedulingActReason {

    MTG,
    MED,
    FIN,
    DEC,
    PAT,
    PHY,
    BLK;

    public String value() {
        return name();
    }

    public static SchedulingActReason fromValue(String v) {
        return valueOf(v);
    }

}

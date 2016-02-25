
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActSpecObsVolumeCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecObsVolumeCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="VOLUME"/>
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="CONSUMPTION"/>
 *     &lt;enumeration value="CURRENT"/>
 *     &lt;enumeration value="INITIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActSpecObsVolumeCode")
@XmlEnum
public enum ActSpecObsVolumeCode {

    VOLUME,
    AVAILABLE,
    CONSUMPTION,
    CURRENT,
    INITIAL;

    public String value() {
        return name();
    }

    public static ActSpecObsVolumeCode fromValue(String v) {
        return valueOf(v);
    }

}

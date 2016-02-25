
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ParticipationModeElectronicData.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationModeElectronicData">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ELECTRONIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationModeElectronicData")
@XmlEnum
public enum ParticipationModeElectronicData {

    ELECTRONIC;

    public String value() {
        return name();
    }

    public static ParticipationModeElectronicData fromValue(String v) {
        return valueOf(v);
    }

}

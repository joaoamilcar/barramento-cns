
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActInpatientEncounterCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInpatientEncounterCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IMP"/>
 *     &lt;enumeration value="ACUTE"/>
 *     &lt;enumeration value="NONAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInpatientEncounterCode")
@XmlEnum
public enum ActInpatientEncounterCode {

    IMP,
    ACUTE,
    NONAC;

    public String value() {
        return name();
    }

    public static ActInpatientEncounterCode fromValue(String v) {
        return valueOf(v);
    }

}

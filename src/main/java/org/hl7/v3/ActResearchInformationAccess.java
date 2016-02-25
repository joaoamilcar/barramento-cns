
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActResearchInformationAccess.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActResearchInformationAccess">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RESEARCH"/>
 *     &lt;enumeration value="RSDID"/>
 *     &lt;enumeration value="RSREID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActResearchInformationAccess")
@XmlEnum
public enum ActResearchInformationAccess {

    RESEARCH,
    RSDID,
    RSREID;

    public String value() {
        return name();
    }

    public static ActResearchInformationAccess fromValue(String v) {
        return valueOf(v);
    }

}

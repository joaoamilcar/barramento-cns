
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FamilyMemberUncle.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberUncle">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="UNCLE"/>
 *     &lt;enumeration value="MUNCLE"/>
 *     &lt;enumeration value="PUNCLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberUncle")
@XmlEnum
public enum FamilyMemberUncle {

    UNCLE,
    MUNCLE,
    PUNCLE;

    public String value() {
        return name();
    }

    public static FamilyMemberUncle fromValue(String v) {
        return valueOf(v);
    }

}

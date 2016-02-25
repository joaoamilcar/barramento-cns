
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FamilyMemberCousin.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberCousin">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COUSN"/>
 *     &lt;enumeration value="MCOUSN"/>
 *     &lt;enumeration value="PCOUSN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberCousin")
@XmlEnum
public enum FamilyMemberCousin {

    COUSN,
    MCOUSN,
    PCOUSN;

    public String value() {
        return name();
    }

    public static FamilyMemberCousin fromValue(String v) {
        return valueOf(v);
    }

}

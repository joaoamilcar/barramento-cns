
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MedicationGeneralizationRoleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationGeneralizationRoleType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="GDF"/>
 *     &lt;enumeration value="GDS"/>
 *     &lt;enumeration value="GDSF"/>
 *     &lt;enumeration value="MGDSF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicationGeneralizationRoleType")
@XmlEnum
public enum MedicationGeneralizationRoleType {

    GD,
    GDF,
    GDS,
    GDSF,
    MGDSF;

    public String value() {
        return name();
    }

    public static MedicationGeneralizationRoleType fromValue(String v) {
        return valueOf(v);
    }

}

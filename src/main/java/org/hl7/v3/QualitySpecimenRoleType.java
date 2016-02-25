
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QualitySpecimenRoleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="QualitySpecimenRoleType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="V"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QualitySpecimenRoleType")
@XmlEnum
public enum QualitySpecimenRoleType {

    Q,
    B,
    E,
    F,
    O,
    V;

    public String value() {
        return name();
    }

    public static QualitySpecimenRoleType fromValue(String v) {
        return valueOf(v);
    }

}

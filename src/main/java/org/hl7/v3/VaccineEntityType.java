
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VaccineEntityType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VaccineEntityType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="VCCNE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VaccineEntityType")
@XmlEnum
public enum VaccineEntityType {

    VCCNE;

    public String value() {
        return name();
    }

    public static VaccineEntityType fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AdministrativeGender.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeGender">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="UN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeGender")
@XmlEnum
public enum AdministrativeGender {

    F,
    M,
    UN;

    public String value() {
        return name();
    }

    public static AdministrativeGender fromValue(String v) {
        return valueOf(v);
    }

}

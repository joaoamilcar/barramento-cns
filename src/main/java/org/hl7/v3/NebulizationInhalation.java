
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NebulizationInhalation.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NebulizationInhalation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NEB"/>
 *     &lt;enumeration value="NASNEB"/>
 *     &lt;enumeration value="ORNEB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NebulizationInhalation")
@XmlEnum
public enum NebulizationInhalation {

    NEB,
    NASNEB,
    ORNEB;

    public String value() {
        return name();
    }

    public static NebulizationInhalation fromValue(String v) {
        return valueOf(v);
    }

}

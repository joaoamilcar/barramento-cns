
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConfidentialityModifiers.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfidentialityModifiers">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConfidentialityModifiers")
@XmlEnum
public enum ConfidentialityModifiers {

    C,
    S,
    T;

    public String value() {
        return name();
    }

    public static ConfidentialityModifiers fromValue(String v) {
        return valueOf(v);
    }

}

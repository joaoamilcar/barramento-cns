
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LanguageAbilityProficiency.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageAbilityProficiency">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageAbilityProficiency")
@XmlEnum
public enum LanguageAbilityProficiency {

    E,
    F,
    G,
    P;

    public String value() {
        return name();
    }

    public static LanguageAbilityProficiency fromValue(String v) {
        return valueOf(v);
    }

}

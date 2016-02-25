
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SiblingInLaw.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SiblingInLaw">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SIBINLAW"/>
 *     &lt;enumeration value="BROINLAW"/>
 *     &lt;enumeration value="SISINLAW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiblingInLaw")
@XmlEnum
public enum SiblingInLaw {

    SIBINLAW,
    BROINLAW,
    SISINLAW;

    public String value() {
        return name();
    }

    public static SiblingInLaw fromValue(String v) {
        return valueOf(v);
    }

}

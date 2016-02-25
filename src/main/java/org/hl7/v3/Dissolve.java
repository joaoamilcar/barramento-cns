
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Dissolve.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Dissolve">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DISSOLVE"/>
 *     &lt;enumeration value="SL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Dissolve")
@XmlEnum
public enum Dissolve {

    DISSOLVE,
    SL;

    public String value() {
        return name();
    }

    public static Dissolve fromValue(String v) {
        return valueOf(v);
    }

}

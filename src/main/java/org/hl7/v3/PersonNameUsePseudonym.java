
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PersonNameUsePseudonym.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNameUsePseudonym">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonNameUsePseudonym")
@XmlEnum
public enum PersonNameUsePseudonym {

    P,
    A;

    public String value() {
        return name();
    }

    public static PersonNameUsePseudonym fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NaturalFather.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NaturalFather">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NFTH"/>
 *     &lt;enumeration value="NFTHF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaturalFather")
@XmlEnum
public enum NaturalFather {

    NFTH,
    NFTHF;

    public String value() {
        return name();
    }

    public static NaturalFather fromValue(String v) {
        return valueOf(v);
    }

}

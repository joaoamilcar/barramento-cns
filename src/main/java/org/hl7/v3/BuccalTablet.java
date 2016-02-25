
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BuccalTablet.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BuccalTablet">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BUCTAB"/>
 *     &lt;enumeration value="SRBUCTAB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuccalTablet")
@XmlEnum
public enum BuccalTablet {

    BUCTAB,
    SRBUCTAB;

    public String value() {
        return name();
    }

    public static BuccalTablet fromValue(String v) {
        return valueOf(v);
    }

}

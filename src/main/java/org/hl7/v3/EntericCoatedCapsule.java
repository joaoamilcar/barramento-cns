
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EntericCoatedCapsule.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EntericCoatedCapsule">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENTCAP"/>
 *     &lt;enumeration value="ERENTCAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntericCoatedCapsule")
@XmlEnum
public enum EntericCoatedCapsule {

    ENTCAP,
    ERENTCAP;

    public String value() {
        return name();
    }

    public static EntericCoatedCapsule fromValue(String v) {
        return valueOf(v);
    }

}

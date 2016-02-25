
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AskedButUnknown.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AskedButUnknown">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ASKU"/>
 *     &lt;enumeration value="NAV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AskedButUnknown")
@XmlEnum
public enum AskedButUnknown {

    ASKU,
    NAV;

    public String value() {
        return name();
    }

    public static AskedButUnknown fromValue(String v) {
        return valueOf(v);
    }

}

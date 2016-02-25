
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObsoleteEditStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObsoleteEditStatus">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObsoleteEditStatus")
@XmlEnum
public enum ObsoleteEditStatus {

    O;

    public String value() {
        return name();
    }

    public static ObsoleteEditStatus fromValue(String v) {
        return valueOf(v);
    }

}

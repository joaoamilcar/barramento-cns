
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de KitEntityType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="KitEntityType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="KIT"/>
 *     &lt;enumeration value="SYSTM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KitEntityType")
@XmlEnum
public enum KitEntityType {

    KIT,
    SYSTM;

    public String value() {
        return name();
    }

    public static KitEntityType fromValue(String v) {
        return valueOf(v);
    }

}

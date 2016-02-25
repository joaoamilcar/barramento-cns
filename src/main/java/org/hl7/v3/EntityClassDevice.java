
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EntityClassDevice.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassDevice">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="CER"/>
 *     &lt;enumeration value="MODDV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityClassDevice")
@XmlEnum
public enum EntityClassDevice {

    DEV,
    CER,
    MODDV;

    public String value() {
        return name();
    }

    public static EntityClassDevice fromValue(String v) {
        return valueOf(v);
    }

}

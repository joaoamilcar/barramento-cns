
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InhalerMedicalDevice.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InhalerMedicalDevice">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INH"/>
 *     &lt;enumeration value="DSKUNH"/>
 *     &lt;enumeration value="DSKS"/>
 *     &lt;enumeration value="TRBINH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InhalerMedicalDevice")
@XmlEnum
public enum InhalerMedicalDevice {

    INH,
    DSKUNH,
    DSKS,
    TRBINH;

    public String value() {
        return name();
    }

    public static InhalerMedicalDevice fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MdfHmdMetSourceType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MdfHmdMetSourceType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MdfHmdMetSourceType")
@XmlEnum
public enum MdfHmdMetSourceType {

    C,
    D,
    N,
    U,
    R,
    I;

    public String value() {
        return name();
    }

    public static MdfHmdMetSourceType fromValue(String v) {
        return valueOf(v);
    }

}

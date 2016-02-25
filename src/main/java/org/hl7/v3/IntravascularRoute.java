
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntravascularRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntravascularRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HEMODIFF"/>
 *     &lt;enumeration value="IVASCINFUS"/>
 *     &lt;enumeration value="HEMOPORT"/>
 *     &lt;enumeration value="IVASCINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntravascularRoute")
@XmlEnum
public enum IntravascularRoute {

    HEMODIFF,
    IVASCINFUS,
    HEMOPORT,
    IVASCINJ;

    public String value() {
        return name();
    }

    public static IntravascularRoute fromValue(String v) {
        return valueOf(v);
    }

}

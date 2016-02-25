
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PeriodontalRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodontalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PDONTINJ"/>
 *     &lt;enumeration value="PDONTTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodontalRoute")
@XmlEnum
public enum PeriodontalRoute {

    PDONTINJ,
    PDONTTA;

    public String value() {
        return name();
    }

    public static PeriodontalRoute fromValue(String v) {
        return valueOf(v);
    }

}

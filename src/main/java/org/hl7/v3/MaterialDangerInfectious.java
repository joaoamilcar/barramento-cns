
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MaterialDangerInfectious.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MaterialDangerInfectious">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INF"/>
 *     &lt;enumeration value="BHZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaterialDangerInfectious")
@XmlEnum
public enum MaterialDangerInfectious {

    INF,
    BHZ;

    public String value() {
        return name();
    }

    public static MaterialDangerInfectious fromValue(String v) {
        return valueOf(v);
    }

}

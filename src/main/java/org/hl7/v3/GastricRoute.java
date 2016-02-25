
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GastricRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GastricRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GBINJ"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="NGT"/>
 *     &lt;enumeration value="OGT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GastricRoute")
@XmlEnum
public enum GastricRoute {

    GBINJ,
    GT,
    NGT,
    OGT;

    public String value() {
        return name();
    }

    public static GastricRoute fromValue(String v) {
        return valueOf(v);
    }

}

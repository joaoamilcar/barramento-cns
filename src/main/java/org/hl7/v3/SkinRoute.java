
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SkinRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SkinRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="OCDRESTA"/>
 *     &lt;enumeration value="SKIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SkinRoute")
@XmlEnum
public enum SkinRoute {

    OCDRESTA,
    SKIN;

    public String value() {
        return name();
    }

    public static SkinRoute fromValue(String v) {
        return valueOf(v);
    }

}

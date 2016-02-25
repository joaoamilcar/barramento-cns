
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Diffusion.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Diffusion">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXTCORPDIF"/>
 *     &lt;enumeration value="HEMODIFF"/>
 *     &lt;enumeration value="TRNSDERMD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Diffusion")
@XmlEnum
public enum Diffusion {

    EXTCORPDIF,
    HEMODIFF,
    TRNSDERMD;

    public String value() {
        return name();
    }

    public static Diffusion fromValue(String v) {
        return valueOf(v);
    }

}

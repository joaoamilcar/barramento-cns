
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VaginalGel.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VaginalGel">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="VAGGEL"/>
 *     &lt;enumeration value="VGELAPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VaginalGel")
@XmlEnum
public enum VaginalGel {

    VAGGEL,
    VGELAPL;

    public String value() {
        return name();
    }

    public static VaginalGel fromValue(String v) {
        return valueOf(v);
    }

}

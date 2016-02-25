
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GreatGrandparent.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GreatGrandparent">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GGRPRN"/>
 *     &lt;enumeration value="MGGRFTH"/>
 *     &lt;enumeration value="MGGRMTH"/>
 *     &lt;enumeration value="MGGRPRN"/>
 *     &lt;enumeration value="PGGRFTH"/>
 *     &lt;enumeration value="PGGRMTH"/>
 *     &lt;enumeration value="PGGRPRN"/>
 *     &lt;enumeration value="GGRFTH"/>
 *     &lt;enumeration value="GGRMTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GreatGrandparent")
@XmlEnum
public enum GreatGrandparent {

    GGRPRN,
    MGGRFTH,
    MGGRMTH,
    MGGRPRN,
    PGGRFTH,
    PGGRMTH,
    PGGRPRN,
    GGRFTH,
    GGRMTH;

    public String value() {
        return name();
    }

    public static GreatGrandparent fromValue(String v) {
        return valueOf(v);
    }

}

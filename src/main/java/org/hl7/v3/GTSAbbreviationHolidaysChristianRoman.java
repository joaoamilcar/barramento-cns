
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de GTSAbbreviationHolidaysChristianRoman.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GTSAbbreviationHolidaysChristianRoman">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="JHCHREAS"/>
 *     &lt;enumeration value="JHCHRGFR"/>
 *     &lt;enumeration value="JHCHRNEW"/>
 *     &lt;enumeration value="JHCHRPEN"/>
 *     &lt;enumeration value="JHCHRXME"/>
 *     &lt;enumeration value="JHCHRXMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GTSAbbreviationHolidaysChristianRoman")
@XmlEnum
public enum GTSAbbreviationHolidaysChristianRoman {

    JHCHREAS,
    JHCHRGFR,
    JHCHRNEW,
    JHCHRPEN,
    JHCHRXME,
    JHCHRXMS;

    public String value() {
        return name();
    }

    public static GTSAbbreviationHolidaysChristianRoman fromValue(String v) {
        return valueOf(v);
    }

}

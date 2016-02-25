
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActDietCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActDietCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="FAST"/>
 *     &lt;enumeration value="GF"/>
 *     &lt;enumeration value="LQ"/>
 *     &lt;enumeration value="LF"/>
 *     &lt;enumeration value="LP"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="VLI"/>
 *     &lt;enumeration value="NF"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="PAR"/>
 *     &lt;enumeration value="PAF"/>
 *     &lt;enumeration value="RD"/>
 *     &lt;enumeration value="SCH"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActDietCode")
@XmlEnum
public enum ActDietCode {

    BR,
    DM,
    FAST,
    GF,
    LQ,
    LF,
    LP,
    LS,
    VLI,
    NF,
    N,
    PAR,
    PAF,
    RD,
    SCH,
    T;

    public String value() {
        return name();
    }

    public static ActDietCode fromValue(String v) {
        return valueOf(v);
    }

}

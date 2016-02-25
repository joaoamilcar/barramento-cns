
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TranstympanicRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TranstympanicRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TRTYMPINSTIL"/>
 *     &lt;enumeration value="TTYMPTABSORP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TranstympanicRoute")
@XmlEnum
public enum TranstympanicRoute {

    TRTYMPINSTIL,
    TTYMPTABSORP;

    public String value() {
        return name();
    }

    public static TranstympanicRoute fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QueryRequestLimit.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryRequestLimit">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryRequestLimit")
@XmlEnum
public enum QueryRequestLimit {

    RD;

    public String value() {
        return name();
    }

    public static QueryRequestLimit fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LiquidCleanser.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LiquidCleanser">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LIQCLN"/>
 *     &lt;enumeration value="LIQSOAP"/>
 *     &lt;enumeration value="SHMP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiquidCleanser")
@XmlEnum
public enum LiquidCleanser {

    LIQCLN,
    LIQSOAP,
    SHMP;

    public String value() {
        return name();
    }

    public static LiquidCleanser fromValue(String v) {
        return valueOf(v);
    }

}

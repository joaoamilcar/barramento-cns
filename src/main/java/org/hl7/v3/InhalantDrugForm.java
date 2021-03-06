
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InhalantDrugForm.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InhalantDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INHL"/>
 *     &lt;enumeration value="BAINHLPWD"/>
 *     &lt;enumeration value="INHLPWD"/>
 *     &lt;enumeration value="MDINHLPWD"/>
 *     &lt;enumeration value="NASINHL"/>
 *     &lt;enumeration value="ORINHL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InhalantDrugForm")
@XmlEnum
public enum InhalantDrugForm {

    INHL,
    BAINHLPWD,
    INHLPWD,
    MDINHLPWD,
    NASINHL,
    ORINHL;

    public String value() {
        return name();
    }

    public static InhalantDrugForm fromValue(String v) {
        return valueOf(v);
    }

}

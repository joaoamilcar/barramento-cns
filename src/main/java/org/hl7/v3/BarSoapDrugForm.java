
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BarSoapDrugForm.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BarSoapDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BARSOAP"/>
 *     &lt;enumeration value="MEDBAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BarSoapDrugForm")
@XmlEnum
public enum BarSoapDrugForm {

    BARSOAP,
    MEDBAR;

    public String value() {
        return name();
    }

    public static BarSoapDrugForm fromValue(String v) {
        return valueOf(v);
    }

}

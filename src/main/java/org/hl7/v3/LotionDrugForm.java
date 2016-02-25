
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LotionDrugForm.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LotionDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LTN"/>
 *     &lt;enumeration value="TOPLTN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LotionDrugForm")
@XmlEnum
public enum LotionDrugForm {

    LTN,
    TOPLTN;

    public String value() {
        return name();
    }

    public static LotionDrugForm fromValue(String v) {
        return valueOf(v);
    }

}

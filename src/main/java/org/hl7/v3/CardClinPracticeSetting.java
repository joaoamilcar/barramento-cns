
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CardClinPracticeSetting.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CardClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CARD"/>
 *     &lt;enumeration value="PEDCARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardClinPracticeSetting")
@XmlEnum
public enum CardClinPracticeSetting {

    CARD,
    PEDCARD;

    public String value() {
        return name();
    }

    public static CardClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}

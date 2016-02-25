
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RefillTrialBalancePharmacySupplyType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillTrialBalancePharmacySupplyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TB"/>
 *     &lt;enumeration value="TBS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefillTrialBalancePharmacySupplyType")
@XmlEnum
public enum RefillTrialBalancePharmacySupplyType {

    TB,
    TBS;

    public String value() {
        return name();
    }

    public static RefillTrialBalancePharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}

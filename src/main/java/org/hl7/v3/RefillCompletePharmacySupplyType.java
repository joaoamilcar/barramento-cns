
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RefillCompletePharmacySupplyType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillCompletePharmacySupplyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RFC"/>
 *     &lt;enumeration value="RFCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefillCompletePharmacySupplyType")
@XmlEnum
public enum RefillCompletePharmacySupplyType {

    RFC,
    RFCS;

    public String value() {
        return name();
    }

    public static RefillCompletePharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}

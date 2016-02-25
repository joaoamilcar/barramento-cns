
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RefillFirstHerePharmacySupplyType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillFirstHerePharmacySupplyType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RFF"/>
 *     &lt;enumeration value="RFFS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefillFirstHerePharmacySupplyType")
@XmlEnum
public enum RefillFirstHerePharmacySupplyType {

    RFF,
    RFFS;

    public String value() {
        return name();
    }

    public static RefillFirstHerePharmacySupplyType fromValue(String v) {
        return valueOf(v);
    }

}

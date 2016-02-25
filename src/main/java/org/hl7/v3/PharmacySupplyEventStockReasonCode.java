
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PharmacySupplyEventStockReasonCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PharmacySupplyEventStockReasonCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FLRSTCK"/>
 *     &lt;enumeration value="LTC"/>
 *     &lt;enumeration value="OFFICE"/>
 *     &lt;enumeration value="PHARM"/>
 *     &lt;enumeration value="PROG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PharmacySupplyEventStockReasonCode")
@XmlEnum
public enum PharmacySupplyEventStockReasonCode {

    FLRSTCK,
    LTC,
    OFFICE,
    PHARM,
    PROG;

    public String value() {
        return name();
    }

    public static PharmacySupplyEventStockReasonCode fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActInvoiceAdjudicationPaymentSummaryCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceAdjudicationPaymentSummaryCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CONT"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="INVTYPE"/>
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="PAYEE"/>
 *     &lt;enumeration value="PAYOR"/>
 *     &lt;enumeration value="PERIOD"/>
 *     &lt;enumeration value="PROV"/>
 *     &lt;enumeration value="SENDAPP"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceAdjudicationPaymentSummaryCode")
@XmlEnum
public enum ActInvoiceAdjudicationPaymentSummaryCode {

    CONT,
    DAY,
    INVTYPE,
    LOC,
    MONTH,
    PAYEE,
    PAYOR,
    PERIOD,
    PROV,
    SENDAPP,
    WEEK,
    YEAR;

    public String value() {
        return name();
    }

    public static ActInvoiceAdjudicationPaymentSummaryCode fromValue(String v) {
        return valueOf(v);
    }

}

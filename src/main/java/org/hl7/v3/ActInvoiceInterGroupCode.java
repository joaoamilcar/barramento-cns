
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActInvoiceInterGroupCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceInterGroupCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CPNDDRGING"/>
 *     &lt;enumeration value="CPNDINDING"/>
 *     &lt;enumeration value="CPNDSUPING"/>
 *     &lt;enumeration value="DRUGING"/>
 *     &lt;enumeration value="FRAMEING"/>
 *     &lt;enumeration value="LENSING"/>
 *     &lt;enumeration value="PRDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceInterGroupCode")
@XmlEnum
public enum ActInvoiceInterGroupCode {

    CPNDDRGING,
    CPNDINDING,
    CPNDSUPING,
    DRUGING,
    FRAMEING,
    LENSING,
    PRDING;

    public String value() {
        return name();
    }

    public static ActInvoiceInterGroupCode fromValue(String v) {
        return valueOf(v);
    }

}

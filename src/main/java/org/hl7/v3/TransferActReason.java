
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransferActReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferActReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="RQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferActReason")
@XmlEnum
public enum TransferActReason {

    ER,
    RQ;

    public String value() {
        return name();
    }

    public static TransferActReason fromValue(String v) {
        return valueOf(v);
    }

}

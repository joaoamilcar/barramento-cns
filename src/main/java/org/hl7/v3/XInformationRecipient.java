
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_InformationRecipient.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_InformationRecipient">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRCP"/>
 *     &lt;enumeration value="TRC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_InformationRecipient")
@XmlEnum
public enum XInformationRecipient {

    PRCP,
    TRC;

    public String value() {
        return name();
    }

    public static XInformationRecipient fromValue(String v) {
        return valueOf(v);
    }

}

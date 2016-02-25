
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AcknowledgementCondition.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementCondition">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="NE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementCondition")
@XmlEnum
public enum AcknowledgementCondition {

    AL,
    ER,
    NE;

    public String value() {
        return name();
    }

    public static AcknowledgementCondition fromValue(String v) {
        return valueOf(v);
    }

}

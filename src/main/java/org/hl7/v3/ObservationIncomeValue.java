
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObservationIncomeValue.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationIncomeValue">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INCOME"/>
 *     &lt;enumeration value="CHILD"/>
 *     &lt;enumeration value="DISABL"/>
 *     &lt;enumeration value="SUPPLE"/>
 *     &lt;enumeration value="INVEST"/>
 *     &lt;enumeration value="PAY"/>
 *     &lt;enumeration value="RETIRE"/>
 *     &lt;enumeration value="SPOUSAL"/>
 *     &lt;enumeration value="TAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationIncomeValue")
@XmlEnum
public enum ObservationIncomeValue {

    INCOME,
    CHILD,
    DISABL,
    SUPPLE,
    INVEST,
    PAY,
    RETIRE,
    SPOUSAL,
    TAX;

    public String value() {
        return name();
    }

    public static ObservationIncomeValue fromValue(String v) {
        return valueOf(v);
    }

}

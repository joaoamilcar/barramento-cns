
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeMonetaryAmount.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeMonetaryAmount">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeMonetaryAmount")
@XmlEnum
public enum DataTypeMonetaryAmount {

    MO;

    public String value() {
        return name();
    }

    public static DataTypeMonetaryAmount fromValue(String v) {
        return valueOf(v);
    }

}

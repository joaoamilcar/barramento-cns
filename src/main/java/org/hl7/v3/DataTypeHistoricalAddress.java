
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeHistoricalAddress.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeHistoricalAddress">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HXIT&lt;AD>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeHistoricalAddress")
@XmlEnum
public enum DataTypeHistoricalAddress {

    @XmlEnumValue("HXIT<AD>")
    HXIT_AD("HXIT<AD>");
    private final String value;

    DataTypeHistoricalAddress(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeHistoricalAddress fromValue(String v) {
        for (DataTypeHistoricalAddress c: DataTypeHistoricalAddress.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeSetOfRealNumbers.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeSetOfRealNumbers">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SET&lt;REAL>"/>
 *     &lt;enumeration value="IVL&lt;REAL>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeSetOfRealNumbers")
@XmlEnum
public enum DataTypeSetOfRealNumbers {

    @XmlEnumValue("SET<REAL>")
    SET_REAL("SET<REAL>"),
    @XmlEnumValue("IVL<REAL>")
    IVL_REAL("IVL<REAL>");
    private final String value;

    DataTypeSetOfRealNumbers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeSetOfRealNumbers fromValue(String v) {
        for (DataTypeSetOfRealNumbers c: DataTypeSetOfRealNumbers.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

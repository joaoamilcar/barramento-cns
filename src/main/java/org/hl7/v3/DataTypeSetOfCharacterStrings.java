
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeSetOfCharacterStrings.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeSetOfCharacterStrings">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SET&lt;ST>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeSetOfCharacterStrings")
@XmlEnum
public enum DataTypeSetOfCharacterStrings {

    @XmlEnumValue("SET<ST>")
    SET_ST("SET<ST>");
    private final String value;

    DataTypeSetOfCharacterStrings(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeSetOfCharacterStrings fromValue(String v) {
        for (DataTypeSetOfCharacterStrings c: DataTypeSetOfCharacterStrings.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

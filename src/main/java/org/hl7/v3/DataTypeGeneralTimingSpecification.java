
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataTypeGeneralTimingSpecification.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeGeneralTimingSpecification">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeGeneralTimingSpecification")
@XmlEnum
public enum DataTypeGeneralTimingSpecification {

    GTS;

    public String value() {
        return name();
    }

    public static DataTypeGeneralTimingSpecification fromValue(String v) {
        return valueOf(v);
    }

}

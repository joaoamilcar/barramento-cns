
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CVDiagTherPracticeSetting.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CVDiagTherPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CVDX"/>
 *     &lt;enumeration value="CATH"/>
 *     &lt;enumeration value="ECHO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CVDiagTherPracticeSetting")
@XmlEnum
public enum CVDiagTherPracticeSetting {

    CVDX,
    CATH,
    ECHO;

    public String value() {
        return name();
    }

    public static CVDiagTherPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}

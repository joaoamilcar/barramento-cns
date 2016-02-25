
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DocumentCompletion.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentCompletion">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="DI"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="PA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentCompletion")
@XmlEnum
public enum DocumentCompletion {

    AU,
    DI,
    DO,
    IP,
    IN,
    LA,
    PA;

    public String value() {
        return name();
    }

    public static DocumentCompletion fromValue(String v) {
        return valueOf(v);
    }

}

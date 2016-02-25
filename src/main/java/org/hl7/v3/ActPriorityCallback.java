
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActPriorityCallback.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActPriorityCallback">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CSP"/>
 *     &lt;enumeration value="CSR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActPriorityCallback")
@XmlEnum
public enum ActPriorityCallback {

    CS,
    CSP,
    CSR;

    public String value() {
        return name();
    }

    public static ActPriorityCallback fromValue(String v) {
        return valueOf(v);
    }

}

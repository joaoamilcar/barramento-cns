
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContextControlPropagating.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextControlPropagating">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="OP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContextControlPropagating")
@XmlEnum
public enum ContextControlPropagating {

    AP,
    OP;

    public String value() {
        return name();
    }

    public static ContextControlPropagating fromValue(String v) {
        return valueOf(v);
    }

}

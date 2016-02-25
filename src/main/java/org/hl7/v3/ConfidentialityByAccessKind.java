
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConfidentialityByAccessKind.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfidentialityByAccessKind">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="V"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConfidentialityByAccessKind")
@XmlEnum
public enum ConfidentialityByAccessKind {

    B,
    D,
    I,
    L,
    N,
    R,
    V;

    public String value() {
        return name();
    }

    public static ConfidentialityByAccessKind fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_ActRelationshipPatientTransport.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipPatientTransport">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ARR"/>
 *     &lt;enumeration value="DEP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipPatientTransport")
@XmlEnum
public enum XActRelationshipPatientTransport {

    ARR,
    DEP;

    public String value() {
        return name();
    }

    public static XActRelationshipPatientTransport fromValue(String v) {
        return valueOf(v);
    }

}

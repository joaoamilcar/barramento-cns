
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TranstrachealRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TranstrachealRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TRTRACHINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TranstrachealRoute")
@XmlEnum
public enum TranstrachealRoute {

    TRTRACHINJ;

    public String value() {
        return name();
    }

    public static TranstrachealRoute fromValue(String v) {
        return valueOf(v);
    }

}

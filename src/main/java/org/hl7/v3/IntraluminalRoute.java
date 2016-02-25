
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntraluminalRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntraluminalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ILUMINJ"/>
 *     &lt;enumeration value="ILUMTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntraluminalRoute")
@XmlEnum
public enum IntraluminalRoute {

    ILUMINJ,
    ILUMTA;

    public String value() {
        return name();
    }

    public static IntraluminalRoute fromValue(String v) {
        return valueOf(v);
    }

}

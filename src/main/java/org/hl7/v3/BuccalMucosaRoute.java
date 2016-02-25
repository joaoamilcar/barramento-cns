
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BuccalMucosaRoute.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BuccalMucosaRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BUC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuccalMucosaRoute")
@XmlEnum
public enum BuccalMucosaRoute {

    BUC;

    public String value() {
        return name();
    }

    public static BuccalMucosaRoute fromValue(String v) {
        return valueOf(v);
    }

}

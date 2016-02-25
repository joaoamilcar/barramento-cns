
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntravenousInfusion.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntravenousInfusion">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IV"/>
 *     &lt;enumeration value="IVC"/>
 *     &lt;enumeration value="IVCC"/>
 *     &lt;enumeration value="IVCI"/>
 *     &lt;enumeration value="PCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntravenousInfusion")
@XmlEnum
public enum IntravenousInfusion {

    IV,
    IVC,
    IVCC,
    IVCI,
    PCA;

    public String value() {
        return name();
    }

    public static IntravenousInfusion fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CompressionAlgorithm.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CompressionAlgorithm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="DF"/>
 *     &lt;enumeration value="GZ"/>
 *     &lt;enumeration value="ZL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompressionAlgorithm")
@XmlEnum
public enum CompressionAlgorithm {

    Z,
    DF,
    GZ,
    ZL;

    public String value() {
        return name();
    }

    public static CompressionAlgorithm fromValue(String v) {
        return valueOf(v);
    }

}

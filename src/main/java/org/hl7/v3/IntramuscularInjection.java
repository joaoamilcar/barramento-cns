
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntramuscularInjection.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IntramuscularInjection">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="IMD"/>
 *     &lt;enumeration value="IMZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntramuscularInjection")
@XmlEnum
public enum IntramuscularInjection {

    IM,
    IMD,
    IMZ;

    public String value() {
        return name();
    }

    public static IntramuscularInjection fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActInformationAccessContextCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInformationAccessContextCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INFCON"/>
 *     &lt;enumeration value="INFDNG"/>
 *     &lt;enumeration value="INFPWR"/>
 *     &lt;enumeration value="INFEMER"/>
 *     &lt;enumeration value="INFCRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInformationAccessContextCode")
@XmlEnum
public enum ActInformationAccessContextCode {

    INFCON,
    INFDNG,
    INFPWR,
    INFEMER,
    INFCRT;

    public String value() {
        return name();
    }

    public static ActInformationAccessContextCode fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_ActClassCareProvisionEncounter.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassCareProvisionEncounter">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PCPR"/>
 *     &lt;enumeration value="ENC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassCareProvisionEncounter")
@XmlEnum
public enum XActClassCareProvisionEncounter {

    PCPR,
    ENC;

    public String value() {
        return name();
    }

    public static XActClassCareProvisionEncounter fromValue(String v) {
        return valueOf(v);
    }

}

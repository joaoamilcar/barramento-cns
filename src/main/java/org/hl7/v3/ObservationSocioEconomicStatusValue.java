
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObservationSocioEconomicStatusValue.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationSocioEconomicStatusValue">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SOECSTAT"/>
 *     &lt;enumeration value="ABUSE"/>
 *     &lt;enumeration value="HMLESS"/>
 *     &lt;enumeration value="ILGIM"/>
 *     &lt;enumeration value="INCAR"/>
 *     &lt;enumeration value="PROB"/>
 *     &lt;enumeration value="REFUG"/>
 *     &lt;enumeration value="UNEMPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationSocioEconomicStatusValue")
@XmlEnum
public enum ObservationSocioEconomicStatusValue {

    SOECSTAT,
    ABUSE,
    HMLESS,
    ILGIM,
    INCAR,
    PROB,
    REFUG,
    UNEMPL;

    public String value() {
        return name();
    }

    public static ObservationSocioEconomicStatusValue fromValue(String v) {
        return valueOf(v);
    }

}

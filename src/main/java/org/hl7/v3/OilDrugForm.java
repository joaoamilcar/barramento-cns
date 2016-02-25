
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OilDrugForm.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OilDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="OIL"/>
 *     &lt;enumeration value="TOPOIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OilDrugForm")
@XmlEnum
public enum OilDrugForm {

    OIL,
    TOPOIL;

    public String value() {
        return name();
    }

    public static OilDrugForm fromValue(String v) {
        return valueOf(v);
    }

}

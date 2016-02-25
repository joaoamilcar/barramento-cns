
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObservationDrugIntoleranceType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationDrugIntoleranceType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DINT"/>
 *     &lt;enumeration value="DALG"/>
 *     &lt;enumeration value="DNAINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationDrugIntoleranceType")
@XmlEnum
public enum ObservationDrugIntoleranceType {

    DINT,
    DALG,
    DNAINT;

    public String value() {
        return name();
    }

    public static ObservationDrugIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObservationFoodIntoleranceType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationFoodIntoleranceType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FINT"/>
 *     &lt;enumeration value="FALG"/>
 *     &lt;enumeration value="FNAINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationFoodIntoleranceType")
@XmlEnum
public enum ObservationFoodIntoleranceType {

    FINT,
    FALG,
    FNAINT;

    public String value() {
        return name();
    }

    public static ObservationFoodIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}

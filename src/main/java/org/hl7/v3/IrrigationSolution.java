
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IrrigationSolution.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IrrigationSolution">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IRSOL"/>
 *     &lt;enumeration value="DOUCHE"/>
 *     &lt;enumeration value="ENEMA"/>
 *     &lt;enumeration value="OPIRSOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IrrigationSolution")
@XmlEnum
public enum IrrigationSolution {

    IRSOL,
    DOUCHE,
    ENEMA,
    OPIRSOL;

    public String value() {
        return name();
    }

    public static IrrigationSolution fromValue(String v) {
        return valueOf(v);
    }

}

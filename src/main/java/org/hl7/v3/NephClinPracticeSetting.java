
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NephClinPracticeSetting.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NephClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NEPH"/>
 *     &lt;enumeration value="PEDNEPH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NephClinPracticeSetting")
@XmlEnum
public enum NephClinPracticeSetting {

    NEPH,
    PEDNEPH;

    public String value() {
        return name();
    }

    public static NephClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PersonNamePartMiscQualifier.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNamePartMiscQualifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonNamePartMiscQualifier")
@XmlEnum
public enum PersonNamePartMiscQualifier {

    CL;

    public String value() {
        return name();
    }

    public static PersonNamePartMiscQualifier fromValue(String v) {
        return valueOf(v);
    }

}

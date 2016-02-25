
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BiotherapeuticNon-personLivingSubjectRoleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BiotherapeuticNon-personLivingSubjectRoleType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BIOTH"/>
 *     &lt;enumeration value="ANTIBIOT"/>
 *     &lt;enumeration value="DEBR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiotherapeuticNon-personLivingSubjectRoleType")
@XmlEnum
public enum BiotherapeuticNonPersonLivingSubjectRoleType {

    BIOTH,
    ANTIBIOT,
    DEBR;

    public String value() {
        return name();
    }

    public static BiotherapeuticNonPersonLivingSubjectRoleType fromValue(String v) {
        return valueOf(v);
    }

}

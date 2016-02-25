
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NonRigidContainerEntityType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NonRigidContainerEntityType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BAG"/>
 *     &lt;enumeration value="PACKT"/>
 *     &lt;enumeration value="PCH"/>
 *     &lt;enumeration value="SACH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonRigidContainerEntityType")
@XmlEnum
public enum NonRigidContainerEntityType {

    BAG,
    PACKT,
    PCH,
    SACH;

    public String value() {
        return name();
    }

    public static NonRigidContainerEntityType fromValue(String v) {
        return valueOf(v);
    }

}

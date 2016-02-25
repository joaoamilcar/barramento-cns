
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_RoleClassCoverageInvoice.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassCoverageInvoice">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PAYOR"/>
 *     &lt;enumeration value="PAYEE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassCoverageInvoice")
@XmlEnum
public enum XRoleClassCoverageInvoice {

    PAYOR,
    PAYEE;

    public String value() {
        return name();
    }

    public static XRoleClassCoverageInvoice fromValue(String v) {
        return valueOf(v);
    }

}

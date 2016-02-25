
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_ActClassDocumentEntryOrganizer.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassDocumentEntryOrganizer">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CLUSTER"/>
 *     &lt;enumeration value="BATTERY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassDocumentEntryOrganizer")
@XmlEnum
public enum XActClassDocumentEntryOrganizer {

    CLUSTER,
    BATTERY;

    public String value() {
        return name();
    }

    public static XActClassDocumentEntryOrganizer fromValue(String v) {
        return valueOf(v);
    }

}

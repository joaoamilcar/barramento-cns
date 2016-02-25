
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de x_ActMoodDocumentObservation.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActMoodDocumentObservation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GOL"/>
 *     &lt;enumeration value="DEF"/>
 *     &lt;enumeration value="EVN"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="PRMS"/>
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RQO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActMoodDocumentObservation")
@XmlEnum
public enum XActMoodDocumentObservation {

    GOL,
    DEF,
    EVN,
    INT,
    PRMS,
    PRP,
    RQO;

    public String value() {
        return name();
    }

    public static XActMoodDocumentObservation fromValue(String v) {
        return valueOf(v);
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EntityDeterminerDetermined.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityDeterminerDetermined">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="KIND"/>
 *     &lt;enumeration value="QUANTIFIED_KIND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityDeterminerDetermined")
@XmlEnum
public enum EntityDeterminerDetermined {

    KIND,
    QUANTIFIED_KIND;

    public String value() {
        return name();
    }

    public static EntityDeterminerDetermined fromValue(String v) {
        return valueOf(v);
    }

}

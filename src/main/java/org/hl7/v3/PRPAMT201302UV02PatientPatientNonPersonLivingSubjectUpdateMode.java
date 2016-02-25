
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PRPA_MT201302UV02.Patient.patientNonPersonLivingSubject.updateMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PRPA_MT201302UV02.Patient.patientNonPersonLivingSubject.updateMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PRPA_MT201302UV02.Patient.patientNonPersonLivingSubject.updateMode")
@XmlEnum
public enum PRPAMT201302UV02PatientPatientNonPersonLivingSubjectUpdateMode {

    N;

    public String value() {
        return name();
    }

    public static PRPAMT201302UV02PatientPatientNonPersonLivingSubjectUpdateMode fromValue(String v) {
        return valueOf(v);
    }

}

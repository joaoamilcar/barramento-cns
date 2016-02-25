
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A character string that may have a type-tag signifying its
 *             role in the address. Typical parts that exist in about
 *             every address are street, house number, or post box,
 *             postal code, city, country but other roles may be defined
 *             regionally, nationally, or on an enterprise level (e.g. in
 *             military addresses). Addresses are usually broken up into
 *             lines, which are indicated by special line-breaking
 *             delimiter elements (e.g., DEL).
 *          
 * 
 * <p>Classe Java de ADXP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ADXP">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ST">
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}AddressPartType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADXP")
@XmlSeeAlso({
    AdxpPostalCode.class,
    AdxpDeliveryInstallationArea.class,
    AdxpBuildingNumberSuffix.class,
    AdxpStreetAddressLine.class,
    AdxpDeliveryInstallationType.class,
    AdxpDeliveryAddressLine.class,
    AdxpPrecinct.class,
    AdxpStreetNameBase.class,
    AdxpDeliveryInstallationQualifier.class,
    AdxpUnitID.class,
    AdxpCareOf.class,
    AdxpHouseNumber.class,
    AdxpCounty.class,
    AdxpDelimiter.class,
    AdxpDirection.class,
    AdxpDeliveryMode.class,
    AdxpUnitType.class,
    AdxpCity.class,
    AdxpState.class,
    AdxpStreetNameType.class,
    AdxpPostBox.class,
    AdxpDeliveryModeIdentifier.class,
    AdxpAdditionalLocator.class,
    AdxpStreetName.class,
    AdxpCountry.class,
    AdxpCensusTract.class,
    AdxpHouseNumberNumeric.class
})
public class ADXP
    extends ST
{

    @XmlAttribute(name = "partType")
    protected List<String> partType;

    /**
     * Gets the value of the partType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartType() {
        if (partType == null) {
            partType = new ArrayList<String>();
        }
        return this.partType;
    }

}


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *  is an abstract generalization
 *             for all data types (1) whose value set has an order
 *             relation (less-or-equal) and (2) where difference is
 *             defined in all of the data type's totally ordered value
 *             subsets.  The quantity type abstraction is needed in
 *             defining certain other types, such as the interval and
 *             the probability distribution.
 *          
 * 
 * <p>Classe Java de QTY complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QTY">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ANY">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTY")
@XmlSeeAlso({
    RTOMOPQ.class,
    RTOPQPQ.class,
    MO.class,
    INT.class,
    PQ.class,
    REAL.class,
    RTOQTYQTY.class,
    TS.class
})
public abstract class QTY
    extends ANY
{


}

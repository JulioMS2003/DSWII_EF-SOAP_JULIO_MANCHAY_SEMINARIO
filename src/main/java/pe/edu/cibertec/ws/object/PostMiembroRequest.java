//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 02:21:30 AM EST 
//


package pe.edu.cibertec.ws.object;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="miembro" type="{http://www.cibertec.edu.pe/ws/object}miembrows"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "miembro"
})
@XmlRootElement(name = "postMiembroRequest")
public class PostMiembroRequest {

    @XmlElement(required = true)
    protected Miembrows miembro;

    /**
     * Obtiene el valor de la propiedad miembro.
     * 
     * @return
     *     possible object is
     *     {@link Miembrows }
     *     
     */
    public Miembrows getMiembro() {
        return miembro;
    }

    /**
     * Define el valor de la propiedad miembro.
     * 
     * @param value
     *     allowed object is
     *     {@link Miembrows }
     *     
     */
    public void setMiembro(Miembrows value) {
        this.miembro = value;
    }

}

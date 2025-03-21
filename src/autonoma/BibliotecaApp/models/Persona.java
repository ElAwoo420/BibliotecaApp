/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.BibliotecaApp.models;

/** Persona es quien lee libros en la biblioteca
 * Obtenemos su nombre, su identificador único de tarjeta de identidad y un correo electronico para comunicarse con el
 * @author MAYERLLI
 * @since 14/03/2025
 *  versión 1.0
 */
public abstract class Persona {
    private String nombre;
    private String documentoIdentidad;
    private String correoElectronico;

    /**
     * Construtor que recibe como parametros nombre, id y correo electronico
     * @param nombre
     * @param documentoIdentidad
     * @param correoElectronico 
     */
    public Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Para obtener el nombre de la clase Persona
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Modificar nombre que se dio inicialmente en caso de cambio
     * @param nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtener documento de identidad de la persona para poder identificarse de x lugar, ciudad etc..
     * @return 
     */
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    /**
     * Modificar el documento de identidad en caso de uso
     * @param documentoIdentidad 
     */
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    
    /**
     * Para poder tener el correo electronico, para acceder a ese email de la persona
     * @return 
     */

    public String getCorreoElectronico() {
        return correoElectronico;
    }

   /**
    * Para poder establecer el correo electronico de la persona
    * @param correoElectronico 
    */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
}

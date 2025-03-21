/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.BibliotecaApp.models;

/**
 * Archivo autor.java
 * Esta clase contiene los datos de autor y tiene una herencia con persona
 * @since 14/03/2025
 * @author estuam
 * versión 1.0
 */
public class Autor extends  Persona {
    private String editorial;
    private String profesion;
 /**
     * Constructor de la clase Autor 
     * 
     * @param editorial Parte de donde se hace el libro
     * @param profesión Lo que ejerce el autor
     * @param nombre Nombre del autor.
     * @param documentoIdentidad Con lo que se reconoce al autor como ciudadano de cierto departamento y Pais
     * @param correoElectronico el email que tiene el autor para intercambiar mensajes
     */
    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correoElectronico) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }

    /**
     * obtener cual es la editorial del libro
     * @return editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * para modificar la editorial, recibiendo como parametro ese mismo dato
     * @param editorial 
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
    *para obtener la profesión de la clase persona
    * @param profesión
    */
    public String getProfesion() {
        return profesion;
    }

    /**
     *  modificar la profesión de la clase persona
     *  digamos se recibe inicialmente una profesión de valor
     *  tipo String, la posibilidad de cambiar ese 1er dato
     * @param profesion 
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }       
}

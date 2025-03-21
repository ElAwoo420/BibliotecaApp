/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.BibliotecaApp.models;

/**
 * La clase Libro representa a un libro con un identificador unico (id) y un titulo.
 *  @author MAYERLLI
 * @since 14/03/2025
 *  versión 1.0
 */
public class Libro {
    /**
     * Identificador único de libro
     */
    private long id;
    /**
     * Titulo del libro
     */
    private String titulo;
      /**
       * Constructor de la clase libro
       * @param id
       * @param titulo 
       */
     public Libro(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    /**
     * Obtiene el identificador del libro
     * 
     * @return  El identificador único del libro
     */
    public long getId() {
        return id;
    }
    
    /**
     * Identificador único para el libro
     * @param id Nuevo identificador único del libro
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Obtiene el titulo del libro
     * @return el titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Para modificar el titulo del libro
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}


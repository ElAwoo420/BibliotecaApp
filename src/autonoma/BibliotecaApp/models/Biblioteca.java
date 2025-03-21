package autonoma.BibliotecaApp.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * La clase Biblioteca representa una colección de libros
 *  Este archivo contiene algunos métodos y el crud para la capa de presentación
 * @author Juan Esteban Vera Velez
 * @since 14/03/2025
 * versión 1.0
 */
public class Biblioteca {
    /**
     * Lista qur almacena a los libros dentro de la biblioteca
     */
      private List<Libro> libros;
    
       /**
         * Constrcutor de la clase biblioteca
         * inicializa la lista libros con un Arraylist que esta vacio
         */
    public Biblioteca() {
        
        this.libros = new ArrayList<>();
    }
      /**
        * Método para obtener los libros de manera ordenada en la biblioteca
        * 
         */
      public List<Libro> getLibros() {
        return libros;
    }
      /**
       * Ordena libros de manera alfabetica
       *  
       */
    public void obtenerLibrosAlfabeticamente(){
        List<Libro> librosOrdenados = new ArrayList<>(libros);
        librosOrdenados.sort(Comparator.comparing(Libro::getTitulo));
    }

      /**
       * Agrega un libro a la lista, es la manera en la que por el crud se accede a el libro
       * @param libro El libro que la persona quiere agregar
       * @return true si el libro se puso agregar, false si no se puede hacerlo
       */
    public boolean agregarLibro(Libro libro){
        
        return this.libros.add(libro);
       
    }
    
     /**
      * Buscar un libro comparandolo desde el mismo Objeto Libro que recibe como parametro un libro
      * @param libro que se busca
      * @return libro encontrado o null si no existe o no lo encuentra
      */
    public Libro buscarLibro(Libro libro){
        
        for(int i=0;i<this.libros.size();i++){
            Libro l = this.libros.get(i);
            if(l.equals(libro)){
                return l;
            }
        }
        return null;   
    }
    /**
     *  Buscar libro por su codigo 
     * @param id
     * @return l - que es alusivo al iterador en los for de libro
     */
    public Libro buscarLibro(long id){
        
        for(int i=0;i<this.libros.size();i++){
            Libro l = this.libros.get(i);
            if(l.getId() == id){
                return l;
            }
        }
        return null;   
    }
    
    /**
     * Busca un libro en la lista por su nombre
     * @param nombre de libro a ser encontrado
     * @return si esta el libro returna su nombre, sino un null porque no existe este
     */
    public Libro buscarLibro(String nombre){
        
        for(int i=0;i<this.libros.size();i++){
            Libro l = this.libros.get(i);
            if(l.getNombre().equals(nombre)){
                return l;
            }
        }
        return null;   
    }
    
   /**
    * Actualiza el libro por su id, por su codigo 
    * @param id identificador del libro a actualizar
    * @param libro el nuevo objeto que tiene la clase actualizada
    * @return el devolver el nombre del libro por su id y si no es asi retorna null si no existe
    */
    public Libro actualizarLibro(long id, Libro libro)
    {
        int index = this.buscarIndiceLibro(id);
        if(index>=0){
            return this.libros.set(index, libro);
        }else{
            return null;
        }
    }
    
    /**
     * Elimina un libro de la lista por su id, dependiendo de su codigo, lo verifica
     * @param id el identificador del libro que se quiere eliminar
     * @return  si se borra correctamente el libro borrado y sino null porque antes de borrarlo no existia
     */
    public Libro eliminarLibro(long id){
        
        int index = this.buscarIndiceLibro(id);
        if(index>=0){
            return this.libros.remove(index);
        }else{
            return null;
        }
    }
    
   /**
    * La lista de libros que estan almacenados en la biblioteca
    * @return una cadena de texto de todos los libros
    */
    public String mostrarLibros(){
        String mostrar = "";
        for(int i=0;i<this.libros.size();i++){
            Libro l = this.libros.get(i);
            mostrar += l.toString()+"\n";
        }
        return mostrar;
    }

    private int buscarIndiceLibro(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
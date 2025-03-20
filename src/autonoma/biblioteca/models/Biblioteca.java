package autonoma.biblioteca.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Juan Esteban Vera Velez
 * @since 14/03/2025
 * versión 1.0
 */
public class Biblioteca {
    private List<Libro> libros;
    
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    
      public List<Libro> getLibros() {
        return libros;
    }
      
    public void obtenerLibrosAlfabeticamente(){
        List<Libro> librosOrdenados = new ArrayList<>(libros);
        librosOrdenados.sort(Comparator.comparing(Libro::getTitulo));
    }


    public boolean agregarLibro(Libro libro){
        
        return this.libros.add(libro);
       
    }
    
   
    public Libro buscarLibro(Libro libro){
        
        for(int i=0;i<this.libros.size();i++){
            Libro l = this.libros.get(i);
            if(l.equals(libro)){
                return l;
            }
        }
        return null;   
    }
    
    public Libro buscarLibro(long id){
        
        for(int i=0;i<this.libros.size();i++){
            Libro l = this.libros.get(i);
            if(l.getId() == id){
                return l;
            }
        }
        return null;   
    }
    
    public Libro buscarLibro(String nombre){
        
        for(int i=0;i<this.libros.size();i++){
            Libro l = this.libros.get(i);
            if(l.getNombre().equals(nombre)){
                return l;
            }
        }
        return null;   
    }
    
   
    public Libro actualizarLibro(long id, Libro libro)
    {
        int index = this.buscarIndiceLibro(id);
        if(index>=0){
            return this.libros.set(index, libro);
        }else{
            return null;
        }
    }
    
    
    public Libro eliminarLibro(long id){
        
        int index = this.buscarIndiceLibro(id);
        if(index>=0){
            return this.libros.remove(index);
        }else{
            return null;
        }
    }
    
   
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

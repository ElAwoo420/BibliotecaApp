package autonoma.biblioteca.models;

import java.util.ArrayList;
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
    
    public boolean agregarLibro(Libro libro) {
        if (libro != null) {
            for (Libro l : libros) {
                if (l.getId() == libro.getId()) {
                    return false;
                }
            }
            return libros.add(libro);
        }
        return false;
    }
    
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "No hay libros en la biblioteca.";
        }
        
        StringBuilder sb = new StringBuilder("Lista de libros:\n");
        for (Libro libro : libros) {
            sb.append(libro.getId()).append(" - ").append(libro.getTitulo()).append("\n");
        }
        return sb.toString();
    }
    
    public Libro buscarLibro(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    
    public boolean actualizarLibro(long id, Libro libroActualizado) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, libroActualizado);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarLibro(long id) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public List<Libro> obtenerLibrosAlfabeticamente() {
        List<Libro> librosOrdenados = new ArrayList<>(libros);
        for (int i = 0; i < librosOrdenados.size() - 1; i++) {
            for (int j = i + 1; j < librosOrdenados.size(); j++) {
                if (librosOrdenados.get(i).getTitulo().compareToIgnoreCase(librosOrdenados.get(j).getTitulo()) > 0) {
                    Libro temp = librosOrdenados.get(i);
                    librosOrdenados.set(i, librosOrdenados.get(j));
                    librosOrdenados.set(j, temp);
                }
            }
        }
        return librosOrdenados;
    }
    
    public List<Libro> getLibros() {
        return libros;
    }
}


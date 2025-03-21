
package autonoma.BibliotecaApp.main;
import autonoma.BibliotecaApp.models.Biblioteca;
import autonoma.BibliotecaApp.views.VentanaPrincipal;

/**
 *
 * @author Juan Esteban Vera Velez
 * @since 18/03/2025
 * versión 1.0
 */
public class BibliotecaApp {
    public static void main(String [] args){
       Biblioteca biblioteca = new Biblioteca(); 
       VentanaPrincipal ventana = new VentanaPrincipal(biblioteca);
       ventana.setVisible(true);
    }
}
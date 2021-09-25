import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class CrearFichero {
       //variables globales
         private  File path;

    public File getPath() {
        return path;
    }


    public CrearFichero() {

          //variables
          String nombreFichero = JOptionPane.showInputDialog("nombre del fichero");
          String desktop = "Juan Ochando";
           String rutaCompleta = "C:" + File.separator + "Users" + File.separator + desktop + File.separator +  "Desktop" + File.separator + nombreFichero + ".txt";
           path = new File(rutaCompleta);


                try {
                        if(path.createNewFile()) {
                                System.out.println("el fichero fue creado correctamente");
                        }else {
                                System.out.println("hubo un error al crear el fichero");
                         }
                } catch (IOException e) {
                          e.printStackTrace();
                        }

       }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LeerFichero {

    private ArrayList<String> nombres;


    public LeerFichero() {

        int contarLineas = 0;
        BufferedReader buffe = null;
        String ruta = "c:\\Listadodenombresaleatorios.csv";

        try {
            buffe = new BufferedReader(new FileReader(ruta));

            String lineas;
          nombres = new ArrayList<>();

            while ((lineas = buffe.readLine()) != null) {

             if (contarLineas > 0) {
                 nombres.add(lineas);
             }
             contarLineas ++;
            }


        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (buffe != null)
                    buffe.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

      }


    public ArrayList<String> getNombres() {

        return nombres;
    }


    }


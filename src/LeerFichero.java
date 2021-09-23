import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LeerFichero {

    public LeerFichero() {

        int contarLineas = 0;
        FileReader archivo = null;
        BufferedReader buffe = null;
        String ruta = "c:\\Listadodenombresaleatorios.csv";

        try {
            buffe = new BufferedReader(new FileReader(ruta));

            String lineas = "";
            ArrayList<String>nombres = new ArrayList<String>();

            while ((lineas = buffe.readLine()) != null) {

             if (contarLineas > 0) {
                 nombres.add(lineas);
             }
             contarLineas ++;
            }

     // llama a metodo
           NombresAleatorios(nombres);



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
    public static int rangoAleatorio(int max, int min) {
        int x = 0;
        x = (int)(Math.random()* (max - min)) + min ;
        return x;
    }

    public void  NombresAleatorios(ArrayList array ) {
        ArrayList<String> nombresAleatorios = new ArrayList<String>();

        for (int i = 0; i <10 ; i++) {
            int aleatorios = rangoAleatorio(80,1);

            nombresAleatorios.add((String) array.get(aleatorios));
        }

        System.out.println(nombresAleatorios + " \n");

    }

    }


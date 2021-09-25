
import java.io.*;
import java.util.ArrayList;



    public class EscribirFichero {

        // variables
        CrearFichero ruta = new CrearFichero();
        LeerFichero leer = new LeerFichero();
        int NumNotas = 4;
        int NumAlumno = 10;

    // metodos

    public String agregarNotas() {
              ArrayList<Double>Notas = new ArrayList<>();
               Double calcula = 0.0;
               Double promedio ;
               String mostrarDatos ;

        for (int i = 0; i < NumNotas; i++) {

               double asignaNota = Math.round(Math.random() * (10-1) + 1) ;
                 Notas.add(asignaNota);
                calcula += Notas.get(i);

        }

                    promedio = calcula / NumNotas;

            return mostrarDatos = String.valueOf(Notas) + "   " + promedio;
    }



    public String AgregarDatos() {
                ArrayList<String> nombresAleatorios = new ArrayList<>();
                PrintWriter pintar = null;
                String cabezera="Nombre " + "     " + "    Notas " + "         " + " Promedio \n ";

        try {
                            pintar = Escribir();
                            pintar.println("Nombre " + "        Notas " + "          "   + "Promedio ");
                        for (int i = 0; i <NumAlumno ; i++) {
                              int aleatorios = rangoAleatorio(80,0);

                                nombresAleatorios.add(leer.getNombres().get(aleatorios));
                                pintar.println(nombresAleatorios.get(i) + " " +  agregarNotas());


                                cabezera +=  nombresAleatorios.get(i) + " " +  agregarNotas() + "\n";
            }
                        return cabezera;

        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                if (null != pintar)
                    pintar.close();
        }


                  return null;
    }




    public static int rangoAleatorio(int max, int min) {
                int x = 0;
                x = (int)(Math.random()* (max - min)) + min ;
                return x;
    }

    public PrintWriter Escribir() throws IOException {
                 PrintWriter write = new PrintWriter(new FileWriter(ruta.getPath()));
                return write;
    }



    }

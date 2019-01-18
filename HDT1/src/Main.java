import java.util.Scanner;

public class Main {



    static String OFFmenu = "MENÚ: \n" +
            "\t1. Encender radio. \n" +
            "\t2. Salir.";

    static String ONmenu = "MENÚ: \n" +
            "\t1. Apagar radio. \n" +
            "\t2. Cambiar banda (AM/FM). \n" +
            "\t3. Subir estación. \n" +
            "\t4. Bajar estación. \n" +
            "\t5. Obtener estación favorita. \n" +
            "\t6. Guardar estación favorita.";

    public static void main(String[] args) {
        Radio myRadio = new Radio();
        boolean continuar = true;
        String am = "AM";

        do {
            System.out.println(OFFmenu);
            System.out.print("Seleccione una opción: ");
            Scanner input = new Scanner(System.in);
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    myRadio.encendidoRadio();

                    do {
                    System.out.println(ONmenu);
                    System.out.println("Seleccione una opción: ");
                    int opcionMenu2 = input.nextInt();

                    switch (opcionMenu2) {
                        case 1:
                            myRadio.encendidoRadio();
                            System.out.println("Apagando el radio...");
                            continuar = false;
                            break;
                        case 2:
                            if (myRadio.cambiarAmFm()) {
                                am = "AM";
                            }else{
                                am = "FM";
                            };
                            System.out.println(" Se ha cambiado de sintonia, ahora se encuentra en " + am);
                            break;

                        case 3:
                            System.out.println("La nueva frecuencia es de " +myRadio.subirFrecuencia() +am);
                            break;
                        case 4:
                            System.out.println("La nueva frecuencia es de " +myRadio.bajarFrecuencia() +am);
                            break;
                        case 5:
                            // TODO: 2019-01-17
                            System.out.println("Que estacion quiere escuchar (1-12) ?");
                            String station = input.nextLine();
                            Float x;
                            x = Float.valueOf(station);
                           // System.out.print( "La estacion que seleciono es la" +myRadio.getFavorito(station)));
                            break;
                        case 6:
                            // TODO: 2019-01-17
                            System.out.println(" En que numero quiere guardar la estacion (1-12)?");
                            String station0 = input.nextLine();
                            String station1 = input.nextLine();

                            int change = Integer.valueOf(station1);
                            myRadio.setFavorito((change));
                            System.out.println("Se guardo exitosamente la estacion selecionada");
                            break;




                    }
                } while(myRadio.isEncendido());

                    break;

                //Salir.
                case 2:
                    System.out.println("Apagando el radio...");
                    continuar = false;
                    break;
            }

        } while (continuar);
    }
}

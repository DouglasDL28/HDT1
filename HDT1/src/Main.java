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


                    }
                } while(myRadio.isEncendido());

                    break;

                //Salir.
                case 2:
                    continuar = false;
                    break;
            }

        } while (continuar);
    }
}

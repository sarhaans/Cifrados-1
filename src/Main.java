import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    Scanner sc = new Scanner(System.in);
    int opc;
    Citala_Espartana CE;
    Julio_Cesar JC;
    Acerca_De AD;

    public Main(){

        opc = 0;
        CE = new Citala_Espartana();
        JC = new Julio_Cesar();
        AD = new Acerca_De();

    }

    public void Citala_Espartana(){
        do{
            System.out.println(
                    "--------------------------------------------\n" +
                            "Menu de cifrado: 'Citala Espartana'\n" +
                            "1. Cifrar.\n" +
                            "2. Descifrar.\n" +
                            "0. Volver al menu principal.\n" +
                            "Seleccione una opcion:"
            );
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println(CE.cifrar());
                break;
                case 2:
                    System.out.println(CE.descifrar());
                break;
                case 0:
                    menu();
                    break;
                default: System.out.println("Opción no válida. Inténtalo de nuevo.\n\n");
            }
        }while(opc != 0);
    }

    public void Julio_Cesar(){
        do{
            System.out.println(
                    "--------------------------------------------\n" +
                            "Menu de cifrado: 'Julio Cesar'\n" +
                            "1. Cifrar.\n" +
                            "2. Descifrar.\n" +
                            "0. Volver al menu principal.\n" +
                            "Seleccione una opcion:"
            );
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println(JC.cifrar());
                    break;
                case 2:
                    System.out.println(JC.descifrar());
                    break;
                case 0:
                    menu();
                    break;
                default: System.out.println("Opción no válida. Inténtalo de nuevo.\n\n");
            }
        }while(opc != 0);

    }

    public void menu(){
        do{
            System.out.println(
                    "--------------------------------------------\n" +
                            "Menu de opciones para codificar: \n" +
                            "Seleccione un metodo de codificacion: \n" +
                            "1. Julio Cesar.\n" +
                            "2. Citala Espartana.\n" +
                            "3. Acerca De...\n" +
                            "0. Exit.\n" +
                            "Seleccione una opcion:"
            );
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    Julio_Cesar();
                    break;
                case 2:
                    Citala_Espartana();
                    break;
                case 3:
                    AD.AcercaDe();
                    break;
                case 0:;
                break;
                default: System.out.println("Opción no válida. Inténtalo de nuevo.\n\n");
            }

        }while(opc != 0);
    }

    public static void main(String[] args) {
    Main l = new Main();
    l.menu();

    }
}
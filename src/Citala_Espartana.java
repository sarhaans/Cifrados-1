import java.util.Scanner;

public class Citala_Espartana {
    Scanner sc = new Scanner(System.in);
    String parrafo;
    String textoCifrado;
    String textoDescifrado;
    int secreto;

    public Citala_Espartana() {
        secreto = 0;
        textoDescifrado = "";
        textoCifrado = "";
        parrafo = "";
    }

    public String texto() {
        textoCifrado = "";
        System.out.println("Ingrese el texto: ");
        parrafo = sc.nextLine();
        return parrafo;
    }

    public int clave() {
        System.out.println("Ingrese el numero de columnas: ");
        secreto = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea
        return secreto;
    }

    public String cifrar() {
        String texto = texto();
        int clave = clave();
        StringBuilder cifrado = new StringBuilder();
        int filas = (int) Math.ceil((double) texto.length() / clave);
        char[][] matriz = new char[filas][clave];
        int indiceMensaje = 0;
        for (int j = 0; j < clave; j++) { // Recorre las columnas
            for (int i = 0; i < filas; i++) { // Recorre las filas
                if (indiceMensaje < texto.length()) {
                    matriz[i][j] = texto.charAt(indiceMensaje++);
                } else {
                    matriz[i][j] = ' '; // Rellena con espacios en blanco si es necesario
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < clave; j++) {
                cifrado.append(matriz[i][j]);
            }
        }
        return cifrado.toString();
    }

    public String descifrar() {
        String texto = texto();
        int clave = clave();
        StringBuilder descifrado = new StringBuilder();
        int filas = (int) Math.ceil((double) texto.length() / clave);
        char[][] matriz = new char[filas][clave];
        int indiceMensaje = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < clave; j++) {
                if (indiceMensaje < texto.length()) {
                    matriz[i][j] = texto.charAt(indiceMensaje++);
                } else {
                    matriz[i][j] = ' '; // Rellena con espacios en blanco si es necesario
                }
            }
        }
        for (int j = 0; j < clave; j++) {
            for (int i = 0; i < filas; i++) {
                descifrado.append(matriz[i][j]);
            }
        }
        return descifrado.toString();
    }
}

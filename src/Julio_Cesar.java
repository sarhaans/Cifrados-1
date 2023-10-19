import java.util.Scanner;

public class Julio_Cesar {
    Scanner sc = new Scanner(System.in);
    String parrafo;
    String textoCifrado;
    String textoDescifrado;
    int secreto;

    public Julio_Cesar() {
        secreto = 0;
        textoDescifrado = "";
        textoCifrado = "";
        parrafo = "";
    }

    public String texto(boolean t) {
        if (t) {
            textoCifrado = "";
            System.out.println("Ingrese el texto a cifrar: ");
            parrafo = sc.nextLine(); // Cambiado a nextLine()
        } else {
            textoDescifrado = "";
            System.out.println("Ingrese el texto a descifrar: ");
            parrafo = sc.nextLine(); // Cambiado a nextLine()
        }
        return parrafo;
    }

    public int clave() {
        System.out.println("Ingrese la clave: ");
        secreto = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea
        return secreto;
    }

    public String cifrar() {
        String texto = texto(true);
        int clave = clave();
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (Character.isLetter(letra)) {
                char base = Character.isLowerCase(letra) ? 'a' : 'A';
                letra = (char) (((letra - base + clave) % 26) + base);
            }
            textoCifrado += letra;
        }
        return textoCifrado;
    }

    public String descifrar() {
        String texto = texto(false);
        int clave = clave();
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (Character.isLetter(letra)) {
                char base = Character.isLowerCase(letra) ? 'a' : 'A';
                letra = (char) (((letra - base - clave + 26) % 26) + base);
            }
            textoDescifrado += letra;
        }
        return textoDescifrado;
    }
}
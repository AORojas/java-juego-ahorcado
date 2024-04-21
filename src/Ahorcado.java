import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosmaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Con este arreglo logro obtener cuantas palabras necita el usuario para ganar
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Con este bucle for me encargo de mostrarle al usuario cuantas letras tiene la
        // palabra ah adivinar
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosmaximos) {
            // ValueOf: Devuelve la representación de cadena del argumento de la matriz de
            // caracteres.
            System.out.println("Palabra ah adivinar: " + String.valueOf(letrasAdivinadas) + " ("
                    + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una palabra, por favor");
            // charAt(0) me quedo con la primer letra introducida por el usurio por si el
            // intento escribe mas de una letra.
            // Usamos la clase scanner para pedirle al usuario una letra.
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            // Una Bandera es una variable booleana que nos indica si ha ocurrido un suceso.
            // En este caso la variable seria letraCorrecta.
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                // La estructura de control if va ir controlando letra por letra si se encuentra
                // o no la letra en la palabra
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan: " + (intentosmaximos - intentos) + " intentos");
            }
            // Equals: Compara esta cadena con el objeto especificado.
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                    System.out.println("¡Felicidades has adivinado! La palabra es: " + palabraSecreta);
            }
        }
        if(!palabraAdivinada){
            System.out.println("Lo siento te has quedado sin intentos, GAME OVER");
        }
        scanner.close();
    }
}

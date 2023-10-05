/* Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación 
de las anteriores 5 variables. Por último, muestra la cadena de caracteres por pantalla */
public class Ejercicio8 {
    public static void main(String[] args) {
        char letra1 = 'N';
        char letra2 = 'U';
        char letra3 = 'R';
        char letra4 = 'I';
        char letra5 = 'A';
        String n = letra1 +""+ letra2 +""+ letra3 +""+ letra4 +""+ letra5;

        System.out.println("Mi nombre es " + n);

    }
}

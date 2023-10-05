/* Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;
        int suma;
        int resta;
        double division;
        int multiplicacion;

        suma = 144+999;
        resta = 144-199;
        multiplicacion = 144*999;
        division = (double)144/999;


        System.out.println(x + " + " + y + " = " + suma);
        System.out.println(x + " - " + y + " = " + resta);
        System.out.println(x + " * " + y + " = " + multiplicacion);
        System.out.println(x + " / " + y + " = " + division);

    }
}
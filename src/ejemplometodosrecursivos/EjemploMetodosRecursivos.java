package ejemplometodosrecursivos;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Santiago Betancur Villegas <santiago-betancur at hotmail.com>
 */
public class EjemploMetodosRecursivos {

    public static void main(String[] args) {

        switch (solicitarDatosMenu()) {
            case 1:
                JOptionPane.showMessageDialog(null, sumar());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, identificadorPalabra());
                break;
            case 3:
                JOptionPane.showMessageDialog(null, calularFactorial(solicitarDatos()));
                break;
        }
    }

    public static int solicitarDatosMenu() {
        int datos = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique [1] para Sumar Numeros"
                + "\nIndique [2] para ingresar Palabra que finaliza con ---> [?]"
                + "\nIndique [3] para Calulo de factorial"));
        return datos;
    }

    public static int sumar() {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
        if (num != 0) {
            return num + sumar();
        } else {
            return num;
        }
    }
    ///Metodo que me permita Mostrar la palabra ingresa y finaliza con ?

    public static String identificadorPalabra() {
        String letrasIngresadas = JOptionPane.showInputDialog("Ingrese letra: ");
        char letra = letrasIngresadas.charAt(0);
        if (letra != '?') {
            return (letrasIngresadas + identificadorPalabra());
        } else {
            return "";
        }
    }
    /// Metodo que permite indicar el factorial de un numero por medio de recursividad

    public static int solicitarDatos() {
        int datos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese datos: "));
        return datos;
    }

    public static double calularFactorial(int numerosIngresados) {
        int respuesta = 0;
        if (numerosIngresados == 0) {
            return numerosIngresados + 1;
        } else {
            respuesta = (int) (numerosIngresados * calularFactorial(numerosIngresados - 1));
        }
        return (double) respuesta;

    }
}

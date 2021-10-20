import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int[] a = {2, 9, 4};
        int[] b = {2, 9, 4};
        boolean diferencia = Ejercicio.compararVectoresRecurcividad(a,b);

        System.out.println(diferencia);*/
       Scanner numero = new Scanner(System.in);
        System.out.print("introducir numero a comvertir fibonaci : ");
        int maxCount = numero.nextInt();
        numero.close();

        for (int i = 0; i < maxCount; i++) {
            int fibonacciNumber = Ejercicio.printFibonacci(i);
            System.out.print(" " + fibonacciNumber);
        }

    }

}

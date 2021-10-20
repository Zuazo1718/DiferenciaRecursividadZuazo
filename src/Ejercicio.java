public class Ejercicio {
    public static boolean compararVectores(int [] a, int[] b){
        boolean respuesta = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                respuesta = false;

                break;
            }
        }
        return respuesta;
    }


    public static boolean compararVectores2(int [] a, int[] b){
        int diferencia =0;
        for (int i = 0; i < a.length; i++) {
            diferencia = diferencia +(Math.abs(a[i] - b[i]));
        }
        return diferencia == 0;
    }

    public static int compararVectoresRecurcividad(int [] a, int []b,int i){
        int diferencia;
        if (i == b.length - 1){
            diferencia = Math.abs(a[i] - b[i]);
        }else{
            diferencia = Math.abs(a[i] - b[i]) + compararVectoresRecurcividad(a,b,i +1);
        }
        return diferencia;
    }

    public static boolean compararVectoresRecurcividad(int [] a, int []b){
        int diferencia = compararVectoresRecurcividad( a,b,0);

        return diferencia == 0;
    }
    ////////////////////////////////////////////////////
        /*public void main(String[] args) {
            int maxCount = 10;
            for (int i = 0; i <= maxCount; i++) {
                int fibonacciNumber = printFibonacci(i);
                System.out.print(" " + fibonacciNumber);
            }
        }*/

        public static int printFibonacci(int n) {
            if (n == 0)
                return 0;
            else if (n == 1)
                return 1;
            else
                return printFibonacci(n - 1) + printFibonacci(n - 2);
        }


}

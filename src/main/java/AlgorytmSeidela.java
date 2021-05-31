public class AlgorytmSeidela {

        static double[][] A = {
                {3, 1},
                {2, 5}
        };
        static double[] b = {11, 16};

        public static void main(String[] args) {
            double[] a = rozwiazanie(100);
            int j = a.length;
            for (int i = 0; i < j; i++){
                System.out.println("Wynik: x" + i + " = " + a[i]);
            }
        }

        public static double[] macierz(double[] mc){
            int i;
            for(i = 0; i < mc.length; i++){
                mc[i] = 0;
            }
            return mc;
        }

        public static double[] rozwiazanie(int a){
            int i, j, k;
            int m = A.length;
            double[] x = macierz(new double[m]);
            for(k = 0; k < a; k++){
                for(i = 0; i < m; i++){
                    double l = 0;
                    for(j = 0; j < m; j++) {
                        if (i != j){
                            l += A[i][j] * x[j];
                        }
                        x[i] = (b[i] - l) / A[i][i];
                    }
                }
            }
            return x;
        }
}

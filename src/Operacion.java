public class Operacion {
    public void operacionX(int[][] mat, int c1, int c2) {
        //((c1*7)-(c1*3))/((5*7)-(4*3))
        int fin = ((c1 * mat[1][1]) - (c2 * mat[0][1])) / ((mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]));
        System.out.println("Resultado de X es:" + fin);
    }

    public void operacionY(int[][] matriz, int c1, int c2) {
        //((5*c2)-(4*c1))/((5*/)-(4*3))
        int fin = ((matriz[0][0] * c2) - (matriz[0][1] * c1)) / ((matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]));
        System.out.println("Resultado de Y es:" + fin);
    }
}
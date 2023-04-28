public class Operacion {
    int diaginal1,diagonal2,res,diagonalPrincipal,diagonalSecundaria,resultado,fin;
    public void operacionX(int [][] mat,int c1,int c2){
         diaginal1= c1*mat[1][1];
         diagonal2=c2*mat[0][1];
         res=diaginal1-diagonal2;
         diagonalPrincipal=mat[0][0]*mat[1][1];
         diagonalSecundaria=mat[0][1]*mat[1][0];
         resultado= diagonalPrincipal-diagonalSecundaria;
         fin=res/resultado;
        System.out.println("Resultado de X es:"+fin);

    }
    public void operacionY(int [][] matriz, int c1,int c2){
        diaginal1=matriz[0][0]*c2;
        diagonal2=matriz[0][1]*c1;
        res=diaginal1-diagonal2;

        diagonalPrincipal=matriz[0][0]*matriz[1][1];
        diagonalSecundaria=matriz[0][1]*matriz[1][0];
        resultado= diagonalPrincipal-diagonalSecundaria;
        fin=res/resultado;
        System.out.println("Resultado de Y es:"+fin);
    }
}

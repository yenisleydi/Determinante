import java.util.Scanner;

public class Principal {
    Operacion operacion=new Operacion();
    int c1,c2,valor;
    int [][] matriz = new int [2][2];
    public void principal(){
        Operacion operacion=new Operacion();

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                System.out.println("Ingrese el numero que desee");
                matriz[i][j]=valor=scanner.nextInt();
            }
        }
        System.out.println("Ingrese a C1 y C2");
         c1=scanner.nextInt();
         c2=scanner.nextInt();
        operacion.operacionX(matriz,c1,c2);
        operacion.operacionY(matriz,c1,c2);
    }
    public void recorrer(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        operacion.operacionX(matriz,c1,c2);
        operacion.operacionY(matriz,c1,c2);
    }
}

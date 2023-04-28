import java.util.Scanner;

public class Principal {
    int c1,c2;
    int [][] matriz = new int [2][2];
    public void principal(){
        Operacion operacion=new Operacion();

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                System.out.println("Ingrese el numero que desee");
                int valor=scanner.nextInt();
                matriz[i][j]=valor;
            }
        }
        System.out.println("Ingrese a C1:");
         c1=scanner.nextInt();
        System.out.println("Ingrese a C2");
         c2=scanner.nextInt();
        operacion.operacionX(matriz,c1,c2);
        operacion.operacionY(matriz,c1,c2);
    }

    public void recorrer(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }

    }
}

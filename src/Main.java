public class Main {
    public static void main(String[] args){
        Principal principal=new Principal();
        Operacion operacion=new Operacion();
        principal.principal();
        principal.recorrer();
        operacion.operacionX(principal.matriz,principal.c1,principal.c2);
        operacion.operacionY(principal.matriz, principal.c1, principal.c2);

    }
}

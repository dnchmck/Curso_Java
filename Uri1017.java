import java.util.Scanner;
public class Uri1017 {
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int KM, Time;
        float litros, consumo;
        consumo=12.0f;
        KM=teclado.nextInt();
        Time=teclado.nextInt();
        litros = KM * Time / consumo;
                System.out.printf("%.3f\n", litros);
    }
}
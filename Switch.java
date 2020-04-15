import java.util.Scanner;
public class Switch {
    public static void main(String args []){
    Scanner teclado = new Scanner (System.in);
    int valor = teclado.nextInt();

    switch (valor){
        case 0:
        System.out.println("digitou: " +valor);
        break;
        case 1:
        System.out.println("digitou: " +valor);
        break;
        case 2:
        System.out.println("digitou: " +valor);
        break;
        case 3:
        System.out.println("digitou: " +valor);
        break;
        default:
        System.out.println("Diegite outro valor diferente de: " +valor);

    }

    }

}
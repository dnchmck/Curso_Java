import java.util.Scanner;
public class Uri1038 {
    public static void main(String args []){
    Scanner teclado = new Scanner (System.in);
    int item = teclado.nextInt();
    int quantidade = teclado.nextInt();

    switch (item){
        case 1:
        System.out.printf("Total: R$ %.2f\n",quantidade*4.00);
        break;
        case 2:
        System.out.printf("Total: R$ %.2f\n",quantidade*4.50);
        break;
        case 3:
        System.out.printf("Total: R$ %.2f\n",quantidade*5.00);
        break;
        case 4:
        System.out.printf("Total: R$ %.2f\n",quantidade*2.00);
        break;
        case 5:
        System.out.printf("Total: R$ %.2f\n",quantidade*1.50);
        break;

    }

    }

}
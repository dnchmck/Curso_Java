import java.util.Scanner;
public class DoWhile{

    public static void main(String args[]){

Scanner teclado = new Scanner(System.in);
int opcao = teclado.nextInt();
do{
    System.out.println("*************");
 System.out.println("0 - teste");
 System.out.println("1 - teste");
  System.out.println("2 - teste");
   System.out.println("3 - teste");

} while (opcao == 0);
System.out.println("fim do programa");



    }



}
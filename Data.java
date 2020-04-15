import java.util.Scanner;
public class Data{
    public static void main (String args []){

 
       Scanner teclado = new Scanner(System.in);
        //teclado = new Scanner(System.in);
        int entrada, DD, MM, AA, Resto;

        System.out.println("Por Favor digite a data do seu processamento no Padrão DDMMAAAA: ");
        entrada=teclado.nextInt();
        AA=entrada%10000;
        Resto = entrada / 10000;
        DD = Resto / 100;
        MM = Resto % 100 ;

        System.out.println("Ano de processamento: "+AA);
        System.out.println("Mes de processamento: "+MM);
        System.out.println("Dia de processamento: "+DD);

    }

}
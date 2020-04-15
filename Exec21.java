import java.util.Scanner;
public class Exec21 {
    public static void main (String args[]) {
    Scanner teclado = new Scanner(System.in);
    int idade;
    //Entrada de Dados
    System.out.println("Digite sua idade: ");
    idade = teclado.nextInt();
    //Processamento
    if (idade == 18 && idade <= 65) {
        System.out.println ("Voto obrigatorio");
    }else {
        if (idade < 16) {
        System.out.println ("Nao elegivel");
    }else {
        System.out.println ("Voto Facultativo");
    }
    }
}
}
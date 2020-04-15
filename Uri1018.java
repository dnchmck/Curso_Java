import java.util.Scanner;

public class Uri1018 {
	
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Valorinserido = teclado.nextInt();
        int Resto = Valorinserido;
        int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
        notas100 = Resto / 100;
        Resto = Resto - (notas100 * 100) ;
        
        notas50 = Resto / 50;
        Resto = Resto - (notas50 * 50);
        
        notas20 = Resto / 20;
        Resto = Resto - (notas20 * 20);
        
        notas10 = Resto / 10;
        Resto = Resto - (notas10 * 10);
        
        notas5 = Resto / 5;
        Resto = Resto - (notas5 * 5);
        
        notas2 = Resto / 2;
        Resto = Resto - (notas2 * 2);
        
        notas1 = Resto;
        
        System.out.println(Valorinserido);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
	
}
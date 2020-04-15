import java.util.Scanner;
public class Execicio1{
    Public static void main(String arg[]){
    Scanner teclado = new Scanner(System.in);
    float nota1, nota2, nota3,media;
    nota1=teclado.nextFloat();
    nota2=teclado.nextFloat();
    nota3=teclado.nextFloat();
    media = ((nota1*2)+(nota2*3)+(nota3*5)) / 10;
    System.out.printf("Media do aluno foi: %.1f/n",media);
    }
}
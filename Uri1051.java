import java.util.Scanner;


public class Uri1051{

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		float renda = entrada.nextFloat();
		float imposto = 0f;

		if(renda <= 2000){
			imposto = 0;
            System.out.printf("Isento");
		} else if(renda >2000 && renda <= 3000){
			imposto = (renda-2000f)*0.08f;
            System.out.printf("R$ %.2f\n",imposto);
		}else if(renda >3000 && renda <= 4500){
			imposto = (renda - 3000f)*0.18f + (1000f*0.08f);
            System.out.printf("R$ %.2f\n",imposto);
		}else if(renda >4500){
			imposto =  (renda - 4500f)*0.28f + (1500f*0.18f) + (1000f*0.08f);
            System.out.printf("R$ %.2f\n",imposto);

		}

		
		
	}
}
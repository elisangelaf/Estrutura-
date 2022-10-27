import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Informe sua altura: ");
        double altura = input.nextDouble();

        System.out.print("Informe seu peso: ");
        double peso = input.nextDouble();
       
        double imc = peso / (altura * altura);

        System.out.println("IMC = " +imc);

        if(imc <= 18.5){
            System.out.println("Magresa");

        } else if (imc < 24.9){
            System.out.println("Normal");

        } else if (imc < 29.9){
            System.out.println("Sobrepeso");

        } else{
            System.out.println("Obesidade");
        }
        
        
   } 
}

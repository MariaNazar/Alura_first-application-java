import java.util.Scanner;

public class FunçõesMatematicas {
    /*_______________________________conversão de farenheit para celsius___________________________________________*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//para receber um valor

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 1.8;

        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);

     /*_________________________________ Contas de IMC_________________________________________*/

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura*altura);

        System.out.println("Seu IMC é de: " + imc );

        if (imc < 18.5){

            System.out.println("Você está abaixo do peso") ;
        } else if (imc > 18.6 && imc <24.9){

            System.out.println( "Você está com o peso normal");
        } else

            System.out.println("Você está acima do peso");



    }


    }


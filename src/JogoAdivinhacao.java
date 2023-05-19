import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);// random gera um número aleatório entre 0 e 100
        int tentativas = 0; //começa em 0 mas serão no máximo 5 tentativas

        while (tentativas <5 ){
            System.out.print("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; //interrompe o laço
            } else if (numeroDigitado < numeroGerado){
                System.out.println("O número digitado é menor do que o número gerado..");
            } else {
                System.out.println("O número digitado é maior do que o número gerado.");
            }

            if (tentativas == 5) {
                System.out.println(("Você não conseguiu adivinhar o número :( "));
            }
        }

    }
}

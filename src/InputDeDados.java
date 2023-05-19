import java.util.Scanner;

public class InputDeDados {
    public static void main (String[] args){

        Scanner leitura = new Scanner(System.in); //o in nesse caso é para receber um dado


        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine(); //nextine (string)  espera que voce digite algo na proxima linha do primeiro sisout
        //netxdouble para variavel do tipo double e nextint para variavel do tipo int

        System.out.println("Digite o ano do seu nascimento: ");
        int anoDeNascimento = leitura.nextInt();
        int idade = 2023 - anoDeNascimento;
        String respostaEsperada = "Seu nome é " + nome + " e você tem " + idade + "anos";

        System.out.println(respostaEsperada);

    }
}

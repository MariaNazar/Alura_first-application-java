import java.util.Scanner;

public class LacosRepeticaoWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0; //como boa prática, iniciar a variavel. Pois se ele vai contar ele mesmo e o valor estar vazio, pode dar erro.
        double notaRecebida = 0;
        int totalNotas = 0;

        //enquanto nota for diferente (!=) -1 o loop continua acontecendo
        while (notaRecebida != -1) { //no while, um loop corre ate que ele seja verdadeiro, por isso o boleean
            System.out.println("Digite sua nota ou -1 para encerrar: ");
            notaRecebida = leitura.nextDouble();

            if (notaRecebida != -1) { //se a nota recebida for diferente de -1 ai sim posso fazer os calculos da media, assim nao fica contando o -1
                mediaAvaliacao = mediaAvaliacao + notaRecebida; //aqui a media avaliação vai receber ela mesma+ a nota recebida ate que tres valores sejam digitados
                totalNotas++; //a cada nota que receber no loop, sera adicionado uma nota nessa variavel.
            }
        }
        System.out.println("Media de avalições é: " + mediaAvaliacao / totalNotas); //o total de notas tem o objetivo de fazermos a media sabendo quantas notas foram dadas, ja que no while nao colocamos um limite e sim uma condição

    }
}



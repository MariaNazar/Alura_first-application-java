import java.util.Scanner;
public class LacosRepeticaoFor {
     public static void main(String[] args){
            Scanner leitura = new Scanner(System.in);
            double mediaAvaliacao = 0; //como boa prática, iniciar a variavel. Pois se ele vai contar ele mesmo e o valor estar vazio, pode dar erro.
            double notaRecebida = 0;

            //i++ é o mesmo que i=i+1
            for (int i = 0; i < 3; i++) { // ele ja declara a variavel nesse caso que chama "i" que inicia em zero (o começo do loop)
                //a segunda condição é ate onde ele vai, no caso 3. Isso vai se repetir ate que meu i seja menor que 3
                //o i++ aqui é a condição que será de um em um o incremento.
                System.out.println("Digite sua nota: ");
                notaRecebida = leitura.nextDouble();
                mediaAvaliacao = mediaAvaliacao + notaRecebida; //aqui a media avaliação vai receber ela mesma+ a nota recebida ate que tres valores sejam digitados

            }

            System.out.println("Media de avalições é: " + mediaAvaliacao/3);

        }
    }



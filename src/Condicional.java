public class Condicional {
    public static void main (String[] args){

        int ano = 2022; //passa o tipo, o nome e o valor da variavel (se tiver valor prévio)
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "básico";



        if (ano >= 2020){
            System.out.println("O filme é recente.");
        } else {
            System.out.println("O filme é antigo.");
        }

          // nesse caso abaixo o ("ou" é) || e o ("e" é &&)
        if (incluidoNoPlano == true || tipoPlano.equals("plus")){ //quando condicionamos string usamos o equals ao inves do "=="
            System.out.println("Filme liberado!");

        } else {
            System.out.println("Deve alugar o filme.");
        }


    }
}

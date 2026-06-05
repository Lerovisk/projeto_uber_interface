/*11. Crie um algoritmo em Java contendo a lógica do jogo da forca. O programa deve escolher
aleatoriamente uma palavra de uma lista de palavras e o usuário deve adivinhar a palavra,
uma letra de cada vez. O usuário tem um número fixo de tentativas para adivinhar a palavra.
Dica: para manipular textos que mudam com frequência (como as letras descobertas na forca, como “_ _ A _”),
lembre-se de que a String comum no Java não pode ser alterada. Pesquise sobre como usar o metodo setCharAt()
da classe StringBuilder para substituir os “_” pelas letras corretas.*/
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class jogoDaForca {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> letrasErradas = new ArrayList<>();

        String[] palavras = {"rato", "coelho", "cachorro", "gato", "cavalo", "macaco", "vaca", "centopeia", "galinha"};
        int indice = random.nextInt(10);
        String palavraEscolhida = palavras[indice];


        StringBuilder palavraDesconhecida = new StringBuilder();
        for (int i = 0; i < palavraEscolhida.length(); i++ ){
            palavraDesconhecida.append('_');
        }
        int tentativas = 5;
        System.out.println("======== Bem-vindo ao jogo da forca! ========\n");
        while (tentativas > 0 && palavraDesconhecida.toString().contains("_")) { // Enquanto as tentativas forem maiores do que 0 && enquanto sb conter "_"
            // o StringBuilder ainda contém algum _?
            // Se sim → ainda tem letras escondidas → jogo continua
            // Se não → o jogador descobriu todas as letras → jogo termina


            System.out.println(palavraDesconhecida);
            System.out.print("Tente uma letra: ");
            char letra = scanner.next().toLowerCase().charAt(0); //charAT(0) -> o caractere na [0]posicao

            if (!Character.isLetter(letra)) {
                System.out.println("Digite apenas letras!");
                continue;
            }

            if (palavraDesconhecida.toString().contains(String.valueOf(letra)) || letrasErradas.contains(letra)){
                System.out.println("Letra já digitada, tente outra.");
                continue;
            }

            boolean acertou = false;
            for (int i = 0; i < palavraEscolhida.length(); i++ ){

                if (letra == palavraEscolhida.charAt(i)) {
                    palavraDesconhecida.setCharAt(i, letra);
                    acertou = true;
                }

            }
            if (!acertou) {
                tentativas -= 1;
                System.out.println("\nErrado, você ainda tem "+ tentativas + " tentativas!");
                letrasErradas.add(letra);
                System.out.println("Letras erradas: " + letrasErradas );
            }
        }
        if (palavraDesconhecida.toString().equals(palavraEscolhida)) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavraEscolhida);
        }
    }
}


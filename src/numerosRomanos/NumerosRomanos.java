/*10. Crie um algoritmo em Java que solicita ao usuário para que insira um número inteiro entre 1 e
1000 e converta-o em um número romano. Por exemplo, se o usuário inserir 58,
o programa deve imprimir "LVIII".*/

import java.util.Scanner;

public class NumerosRomanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 1000 para ser convertido em algarismos romanos: ");
        int numero = scanner.nextInt();

        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; // Criamos uma lista com os números base
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};    // Criamos uma lista com os símbolos representantes base
        int resto = numero; // Atribuímos a variável resto o valor digitado pelo usuário

        if (numero < 1 || numero > 1000) {    // Testamos se o número excede os limites ou não
            System.out.print("Número fora das exigências, tente novamente."); // Apresenta uma mensagem informátiva ao usuário
        } else {
            String romano = ""; // Cria uma String vazia

            for (int i = 0; i < valores.length; i++){   // Entramos na lista de valores, vendo cada elemento um por um
                if (resto == 0) break;  // Se o número for zero, paramos o código
                if (resto >= valores[i]) {  // Se o número for maior ou igual a algum número da lista valores
                    int quatidade_simbolos = resto / valores[i]; // Uma nova variável vai receber a divisão desse número, pelo elemento ao qual ele foi comparado. Assim definimos a quatidade de símbolos.
                    resto -= valores[i] * quatidade_simbolos;    // O numero vai subtrair
                    for (int j = 0; j < quatidade_simbolos; j++){ // poderia ser  romano.append(simbolos[i].repeat(x)); // Vai definir a repetição de um símbolo
                        romano += simbolos[i];  // romano vai receber as strings das letras
                    }
                }
            }
            System.out.println(romano); // Vai apresetar o número romano
        }
    }
}


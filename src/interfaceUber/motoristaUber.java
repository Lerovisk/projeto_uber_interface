package interfaceUber;
import java.util.Scanner;


public class motoristaUber {

    // Atributos
    public carro novoCarro = new carro();
    public String nomeMotorista;
    public String idMotorista;

    // Metodos

    public void pedirDadosMotorista(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite seu nome: ");
        nomeMotorista = scanner.nextLine();

        System.out.print("Por favor, digite seu ID: ");
        idMotorista = scanner.nextLine();

        System.out.print("Por favor digite a marca do carro: ");
        novoCarro.marca = scanner.nextLine();

        System.out.print("Por favor digite o modelo do carro: ");
        novoCarro.modelo = scanner.nextLine();

        System.out.print("Por favor digite o ano do carro: ");
        novoCarro.ano = scanner.nextLine();

        System.out.print("Por favor digite a placa do carro: ");
        novoCarro.setPlaca(scanner.nextLine());
    }
}

package saidaDeDados;
import interfaceUber.motoristaUber;

public class apresentacao {

    public void mostrarDadosMotorista(motoristaUber novoMotorista){

        System.out.println("Nome: " + novoMotorista.nomeMotorista);
        System.out.println("ID do motorista: " + novoMotorista.idMotorista);


        System.out.println("\n === Carro de " + novoMotorista.nomeMotorista + " ===");
        System.out.println("Marca: " + novoMotorista.novoCarro.marca);
        System.out.println("Modelo: " + novoMotorista.novoCarro.modelo);
        System.out.println("Placa: " + novoMotorista.novoCarro.getPlaca());
        System.out.println("Ano: " + novoMotorista.novoCarro.ano);
    }

}

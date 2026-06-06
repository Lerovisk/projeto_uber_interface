package main;
import interfaceUber.motoristaUber;
import saidaDeDados.apresentacao;

public class main {

    public static void main(String[] args) {

        motoristaUber motorista = new motoristaUber();
        motorista.pedirDadosMotorista();

        System.out.println("\n=== Detalhes sobre o motorista ===");

        apresentacao ap = new apresentacao();
        ap.mostrarDadosMotorista(motorista);

    }
}

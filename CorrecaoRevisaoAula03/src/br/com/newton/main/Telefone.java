package br.com.newton.main;
import java.util.Scanner;
import br.com.newton.agenda.Contato;

public class Telefone {
    public static void main(String[] args) {
        Contato infoContato = new Contato();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome de contato:");
        String nome = input.nextLine();

        System.out.println("Digite o numero do seu telefone: ");
        String numTelefone = input.nextLine();

        //verifica se o numero do telefone é valido
        if(numTelefone.length() != 9 ) System.out.println("Telefone invalido");
    }
}

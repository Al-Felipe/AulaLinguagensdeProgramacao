package br.com.newton.main;
import java.util.Scanner;
import br.com.newton.agenda.Contato;

public class Telefone {
    public static void main(String[] args) {
        Contato contato = new Contato();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome de contato:");
        String nome = input.nextLine();
        contato.setNome(nome);

        System.out.println("Digite o numero do seu telefone: ");
        String numTelefone = input.nextLine();
        contato.setNumero(numTelefone);

        contato.Excluir(contato);
        contato.incluirContato(contato);

        //verifica se o numero do telefone é valido
        if(contato.getNumero().length() != 9 ) System.out.println("Telefone invalido");

    }
}

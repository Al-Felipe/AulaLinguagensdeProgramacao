package br.com.newton.agenda;

public class Contato {
    private String nome;
    private String numero;

//    Metodo para excluir contato que recebe como paramentro o contato a ser excluido
    public void Excluir(Contato contato) {
        System.out.println("Excluindo o contato " + contato.nome);
    }

    public void incluirContato(Contato contato){
        System.out.println("Incluindo o contato: " + contato.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}

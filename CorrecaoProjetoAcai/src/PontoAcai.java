import javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {
        String tamanho = JOptionPane.showInputDialog("Ponto do Acai \n Escolha a opcao: \n P - 300ml \n M - 500ml \n G - 700ml");
        String desejaSorvete = JOptionPane.showInputDialog("Deseja sorvete? \n S - Sim \n N - Nao");
        Acai acai = new Acai();
        boolean acrescimoSorvete = false;

        if(desejaSorvete.equals("S"))
            acrescimoSorvete = true;

        JOptionPane.showMessageDialog(null, "O valor e R$ " + acai.CalculaValor(acrescimoSorvete, tamanho), "Ponto Acai", JOptionPane.INFORMATION_MESSAGE);
    }
}

import javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {
        String menu = JOptionPane.showInputDialog("Informe o tamanho do Acai desejado: \n1. 300ml\n2. 500ml\n3. 700ml");
        String acrescimo = JOptionPane.showInputDialog("Possui acrescimo de sorvete: \nS - Sim\nN - Nao");
        boolean possuiAcrescimo = false;
        Acai acai = new Acai();

        if(menu.equals("1")){
            int tamanho = 300;
            int valor = 8;

            if(acrescimo.equals("S"))
                possuiAcrescimo = true;

            int precoFinal = acai.retornaValor(tamanho, valor, possuiAcrescimo);
            JOptionPane.showMessageDialog(null,"O seu acai ficou no valor de R$ " + precoFinal, "Valor pedido", JOptionPane.INFORMATION_MESSAGE);
        }

        if(menu.equals("2")){
            int tamanho = 500;
            int valor = 10;

            if(acrescimo.equals("S"))
                possuiAcrescimo = true;

            int precoFinal = acai.retornaValor(tamanho, valor, possuiAcrescimo);
            JOptionPane.showMessageDialog(null,"O seu acai ficou no valor de R$ " + precoFinal, "Valor pedido", JOptionPane.INFORMATION_MESSAGE);
        }

        if(menu.equals("3")){
            int tamanho = 700;
            int valor = 12;

            if(acrescimo.equals("S"))
                possuiAcrescimo = true;

            int precoFinal = acai.retornaValor(tamanho, valor, possuiAcrescimo);
            JOptionPane.showMessageDialog(null,"O seu acai ficou no valor de R$ " + precoFinal, "Valor pedido", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

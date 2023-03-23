public class Acai {
    public int tamanho;
    public int valor;
    public boolean possuiAcrescimo;

    public int retornaValor(int tamanho, int valor, boolean possuiAcrescimo){
        this.tamanho = tamanho;
        this.valor = valor;
        this.possuiAcrescimo = possuiAcrescimo;

        if(possuiAcrescimo)
            return valor + 2;

        if(tamanho == 300)
            return 8;
        else if(tamanho == 500)
            return 10;
        else
            return 12;

    }
}

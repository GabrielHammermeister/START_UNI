package desafio01;

public class Caixa {
 
    public double calculaValorFinal(Produto produto, int quantidade) {

        int tipo = produto.getTipo();   
        double desconto = 1, valorFinal;

        valorFinal = produto.getValor()*quantidade;

        if(tipo == 1) {
            desconto = 0.9;

        }else if(tipo == 2) {
            desconto = 0.8;

        }else if(tipo == 3) {
            if(quantidade > 5) {
                desconto = 0.9;
            }   
        }
        
        return (valorFinal*desconto);
    }

    
}

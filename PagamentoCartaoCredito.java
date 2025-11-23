public class PagamentoCartaoCredito implements IPagamento{
    private String numeroCartao;

    public PagamentoCartaoCredito(String numero){
	this.numeroCartao = numero;
    }

    public boolean processarPagamento(double ent){
	if(numeroCartao != null && ent >= 0 && ent <= 200.0){
	    return true;
	}
	else{
	    return false;
	}
    }
    public String getNumeroCartao(){
	return this.numeroCartao;
    }
    public void setNumeroCartao(String num){
	this.numeroCartao = num;
    }
}

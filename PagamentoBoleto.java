public class PagamentoBoleto implements IPagamento{
    private String codigoBarras;

    public PagamentoBoleto(String ent){
	this.codigoBarras = ent;
    }

    public boolean processarPagamento(double ent){
	if(this.codigoBarras != null && ent >=0 && ent <= 1000.0){
	    return true;
	}
	else{
	    return false;
	}
    }

    public String getCodigoBarras(){
	return this.codigoBarras;
    }
    public void setCodigoBarras(String barras){
	this.codigoBarras = barras;
    }
}

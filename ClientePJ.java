public class ClientePJ extends Cliente{
    private String cnpj;

    public ClientePJ(String nome, String email, String cnpj){
	this.nome = nome;
	this.email = email;
	this.cnpj = cnpj;
    }

    public String getCNPJ(){
	return this.cnpj;
    }
    public void setCNPJ(String cnpj){
	this.cnpj = cnpj;
    }
}

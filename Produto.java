public class Produto{
    protected String nome;
    protected double preco;
    protected int estoque;

    public Produto(String nome, double preco, int estoque){
	this.nome = nome;
	this.preco = preco;
	this.estoque = estoque;
    }

    public String getNome(){
	return this.nome;
    }
    public void setNome(String nome){
	this.nome = nome;
    }
    public double getPreco(){
	return this.preco;
    }
    public void setPreco(double ent){
	this.preco = ent;
    }
    public int getEstoque(){
	return this.estoque;
    }
    public void setEstoque(int ent){
	this.estoque = ent;
    }
}

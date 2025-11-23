public class ItemPedido{
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int qtd){
	this.produto = produto;
	this.quantidade = qtd;
    }

    public double getSubtotal(){
	return this.produto.getPreco();
    }

    public Produto getProduto(){
	return this.produto;
    }
    public void setProduto(Produto produto){
	this.produto = produto;
    }
    public int getQuantidade(){
	return this.quantidade;
    }
    public void setQuantidade(int ent){
	this.quantidade = ent;
    }
    
}

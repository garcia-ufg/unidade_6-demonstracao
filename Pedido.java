import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Pedido{
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private IPagamento metodoPagamento;

    public Pedido(LocalDate data, Cliente cliente, IPagamento metodo){
	this.data = data;
	this.cliente = cliente;
	this.metodoPagamento = metodo;
	this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade){
	ItemPedido novo = new ItemPedido(produto, quantidade);
	this.itens.add(novo);
    }
    public double calcularTotal(){
	double total = 0;
	for(ItemPedido item: itens){
	    total += item.getSubtotal();
	}
	return total;
    }

    public LocalDate getData(){
	return this.data;
    }
    public void setData(LocalDate data){
	this.data = data;
    }
    public Cliente getCliente(){
	return this.cliente;
    }
    public void setCliente(Cliente cli){
	this.cliente = cli;
    }
    public List<ItemPedido> getItemPedido(){
	return this.itens;
    }
    public void setItemPedido(List<ItemPedido> ent){
	this.itens = ent;
    }
    public IPagamento getMetodoPagamento(){
	return this.metodoPagamento;
    }
    public void setMetodoPagamento(IPagamento metodo){
	this.metodoPagamento = metodo;
    }

}

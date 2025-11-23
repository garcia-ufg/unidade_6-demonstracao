import java.time.LocalDate;

public class SistemaPedido{
    public static void main(String[] args){
	ClientePF pessoa = new ClientePF("Marcelo", "marcelogamer@gmail.com", "754825729");
	ClientePJ empresa = new ClientePJ("Marcelo Negócios", "marceloserio@marceloempresa.com", "389143215");

	Produto teclado = new Produto("tecrado", 15.0, 200);
	Produto mouse = new Produto("mause", 15.0, 500);
	Produto teclado_chique = new Produto("tecrado chique", 250.0, 2);
	Produto mouse_chique = new Produto("mause chique", 250.0, 1);
	Produto cadeira_comfortavel = new Produto("cadeira boa", 200.0, 15);
	Produto mesa_feia = new Produto("mesa feia", 300.0, 150);

	LocalDate data = LocalDate.now();

	PagamentoCartaoCredito metodoCartao = new PagamentoCartaoCredito("31482917");
	PagamentoBoleto metodoBoleto = new PagamentoBoleto("48917582");

	Pedido[] array = new Pedido[4];
	
	array[0] = new Pedido(data, pessoa, metodoCartao);
	array[0].adicionarItem(teclado, 5);
	array[0].adicionarItem(mouse, 5);

	array[1] = new Pedido(data, empresa, metodoCartao);
	array[1].adicionarItem(teclado_chique, 1);
	array[1].adicionarItem(mouse_chique, 1);

	array[2] = new Pedido(data, pessoa, metodoBoleto);
	array[2].adicionarItem(cadeira_comfortavel, 4);

	array[3] = new Pedido(data, empresa, metodoBoleto);
	array[3].adicionarItem(mesa_feia, 5);

	for(int i = 0; i < 4; i++){
	    double valor = array[i].calcularTotal();
	    IPagamento metodo = array[i].getMetodoPagamento();
	    String pagoso;

	    boolean teste = metodo.processarPagamento(valor);

	    if(metodo instanceof PagamentoCartaoCredito){
		pagoso = "por cartão de crédito";
	    }
	    else{
		pagoso = "por boleto";
	    }

	    if(teste){
		System.out.printf("Pedido %d %s de valor %.2f aprovado\n", i+1, pagoso, valor);
	    }
	    else{
		System.out.printf("Pedido %d %s de valor %.2f negado\n", i+1, pagoso, valor);
	    }
	}	
	
    }
}

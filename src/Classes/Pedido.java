package Classes;
import java.util.ArrayList;
public class Pedido {
    private int numero;
    private Pessoa cliente;
    private Data data;
    private ArrayList<Produto> produtos = new ArrayList();
    private float totalPedido;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }
    
    public float calculaPedido(){
        float retorno = 0;
        
        for (int i = 0; i < produtos.size(); i++){
            retorno += produtos.get(i).getCusto();
        }
        
        return retorno;
    }
}
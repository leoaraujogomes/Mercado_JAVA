package Classes;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private ArrayList<Ingrediente> ingredientes = new ArrayList();
    private ArrayList<Manufatura> manufatura = new ArrayList();
    private float custo;

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<Manufatura> getManufatura() {
        return manufatura;
    }

    public void setManufatura(ArrayList<Manufatura> manufatura) {
        this.manufatura = manufatura;
    }    
    
    public float calculaCusto(){
        float valor = 0;
        for (int i = 0; i < ingredientes.size(); i++){
            valor += ingredientes.get(i).getMateriaPrima().getPreco() * ingredientes.get(i).getQtde();
        }
        for (int i = 0; i < manufatura.size(); i++){
            valor += manufatura.get(i).getQtde() * manufatura.get(i).getProcesso().calculaCusto();
        }
        return valor;
    }
}
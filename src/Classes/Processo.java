package Classes;
public class Processo {
  private String nome;
  private float custoHora;
  private Operador operador;
  private Equipamento equipamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(float custoHora) {
        this.custoHora = custoHora;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
    public float calculaCusto(){
        float resultado = 0;
        float horaequip = getEquipamento().getDepreciacaoHora();
        float horaop = getOperador().getSalarioHora();
        resultado = horaequip+horaop;
        return resultado;
    }
}

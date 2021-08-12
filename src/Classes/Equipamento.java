package Classes;
public class Equipamento {
  private String nome;
  private String fabricante;
  private Data dataFabricacao;
  private float depreciacaoHora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Data getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Data dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public float getDepreciacaoHora() {
        return depreciacaoHora;
    }

    public void setDepreciacaoHora(float depreciacaoHora) {
        this.depreciacaoHora = depreciacaoHora;
    }
  
}

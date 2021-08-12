package Classes;
public class Manufatura {
    private Processo processo = new Processo();
    private float qtde;
    
    public Processo getProcesso() {
        return processo;
    }
    
    public void setProcesso(Processo processo) {
        this.processo = processo;
    }
    
    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
}

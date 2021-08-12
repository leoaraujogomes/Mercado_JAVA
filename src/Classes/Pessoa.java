package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
    
    private String nome = "";
    private String idade = "";
    private String cpf = "";
    private Data dataNasc;
    private Endereco endereço;

    public Data formataDataHoje(){
        Data dt = new Data();
        String dataAgora;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        dataAgora = String.valueOf(df.format(new Date(System.currentTimeMillis())));
        dt.setDia(Integer.parseInt(dataAgora.substring(0,2)));
        dt.setMes(Integer.parseInt(dataAgora.substring(3,5)));
        dt.setAno(Integer.parseInt(dataAgora.substring(6,10)));
        return dt;
    }
    
    
    public String calculaIdade(){
        Data dt = formataDataHoje();
        if((dt.getMes()>this.dataNasc.getMes()) || (dt.getMes() == this.dataNasc.getMes() && dt.getDia() >= this.dataNasc.getDia())){
            return (dt.getAno() - dataNasc.getAno()) + "";
        }else{
            return (dt.getAno() - dataNasc.getAno()-1) + "";
        }
    }
    
    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
    
    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}

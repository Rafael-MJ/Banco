package altf4.banco;

public class Transferencias {

    private double valor, lastValor;
    private int destino_id, id;
    private String data, nomeRecebedor, nomeLastRecebedor;
    
    public void setTransfers(double valor, int destino_id, int id, String datetime, String nomeRecebedor){
        
        this.nomeRecebedor = nomeRecebedor;
        this.data = datetime;
        this.valor = valor;
        this.destino_id = destino_id;
        this.id = id;
    }
    
    public void setLastTransfer(double valor ,String nomeRecebedor){
        
        this.nomeLastRecebedor = nomeRecebedor;
        this.lastValor = valor;
    }
    
    public double getLastValue(){
        
        return lastValor;
    }
    
    public String getLastNome(){
        
        return nomeLastRecebedor;
    }
    
    public double getValor(){
        
        return valor;
    }
    
    public int getDestino(){
        
        return destino_id;
    }
 
    public int getID(){
        
        return id;
    }
    
    public String getData(){
        
        return data;
    }
    
    public String getRecebedor(){
        
        return nomeRecebedor;
    }
}

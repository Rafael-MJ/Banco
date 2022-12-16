package altf4.banco;

public class Acessos {

    private int id;
    private String data;
    
    public void setAcess(int id, String datetime){
        
        this.data = datetime;
        this.id = id;
    }
 
    public int getID(){
        
        return id;
    }
    
    public String getData(){
        
        return data;
    }
}

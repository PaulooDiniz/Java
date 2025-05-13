package banco;

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
   public ContaBanco(int c, String t, String n, float s){
       
       this.setNumConta(c);
       this.setTipo(t);
       this.setDono(n);
       this.setSaldo(s);       
       
   }
    
    public int getNumConta(){
        return this.numConta;
    } 
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public String getStatus(){
        
        String m;
        
        if(this.status == true){
            
            m = "conta aberta";
            
        } else {
            
            m = "Conta fechada";
        }
        
        return m;
    }
    
    public void setStatus(boolean st){
        this.status = st;
    }
    
    public void abrirConta(String t){
       
        this.setStatus(true);
        this.setTipo(t);
        
        if(this.getTipo().equals("cc")){
            
            saldo += 50;
            
        }else if(this.getTipo().equals("cp")){
            
            saldo += 150;
            
        }
              
    }
    
    public void fecharConta(){
           
        if(this.getSaldo() == 0){
            System.out.println("Conta encerrada!");
            this.setStatus(false);
        }else {
            System.out.println("ALERTA:");
            System.out.println("A conta não pode ser fechada porque há dinheiro nela, saque todo o valor e depois tente encerra-la novamente");
            this.setStatus(true);
        }
        
    }
    
    public void depositar(float valor){
        
        this.setSaldo(this.getSaldo() + valor);
        
    }
    
    public void sacar(float valor){
        
       if(valor <= this.getSaldo()){
           
           this.setSaldo(this.getSaldo() - valor);
           
       }else{
           
           System.out.println("ATENÇÃO!");
           System.out.println("Falha na tentativa de saque, o valor solicitado é maior do que você tem na conta.");
       }
        
    }
    
    public void status(){
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome da conta: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());               
    }
    
}

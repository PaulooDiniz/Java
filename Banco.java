package banco;

public class Banco {

        public static void main(String[] args) {
        
            ContaBanco c1 = new ContaBanco();
            
            ContaBanco c2 = new ContaBanco();
            
            c1.abrirConta("cp");
            c1.setNumConta(123);
            c1.setDono("Paulo Soares");
            //c1.depositar(100);
            //c1.sacar(150);
            //c1.fecharConta();
            
            c2.abrirConta("cc");
                        
            System.out.println("-------------------------------------------");
            
            c1.status();
            
            System.out.println("-------------------------------------------");
            
            c2.status();
    }
    
}

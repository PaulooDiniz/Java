package program;
import entities.Funcionario;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Informe a quantidade de funcionários que serão cadastrados: ");
        int n = sc.nextInt();

        for(int i=0; i < n; i++){

           System.out.println("Employee #" + (i + 1) + ":");
           System.out.print("ID: ");
           Integer id = sc.nextInt();
           sc.nextLine();
           System.out.print("NOME: ");
           String nome = sc.nextLine();
           System.out.print("SALARIO: ");
           Double salario = sc.nextDouble();

          Funcionario fun = new Funcionario(id,nome,salario);

          list.add(fun);
        }

        System.out.println("FUNCIONARIOS: ");
        for(Funcionario emp : list){
            System.out.println(emp);
        }

        System.out.println();

        System.out.print("Informe o id do funcionario que receberá o aumento: ");
        int idAumento = sc.nextInt();
        Integer pos = position(list, idAumento);
        if(pos == null){
            System.out.println("ESSE ID NÃO EXISTE!");
        }else{
            System.out.print("Qual será o aumento: ");
            double aumento = sc.nextDouble();
            list.get(pos).aumentoSalario(aumento);
        }

        System.out.println("FUNCIONARIOS: ");
        for(Funcionario emp : list){
            System.out.println(emp);
        }

        sc.close();
    }
    public static Integer position(List<Funcionario> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

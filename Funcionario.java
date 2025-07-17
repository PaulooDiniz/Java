package entities;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aumentoSalario(double aumento){
        salario = (aumento/100) * salario + salario;
    }

    @Override
    public String toString() {
        return "id= " + id + " nome= " + nome + " salario= " + String.format("%.2f", salario);
    }
}

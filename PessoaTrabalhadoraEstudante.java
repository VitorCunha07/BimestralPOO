public class PessoaTrabalhadoraEstudante extends Pessoa implements Trabalhador, Estudante {
    private double salario;
    private int nota;

    public PessoaTrabalhadoraEstudante(String nome, int idade, double salario) {
        super(nome, idade); 
        this.salario = salario;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando.");
    }

    @Override
    public double receberSalario() {
        System.out.println(getNome() + " recebe um salário de R$ " + salario);
        return salario;
    }

    @Override
    public void estudar() {
        System.out.println(getNome() + " está estudando.");
    }

    @Override
    public int tirarNota() {
        nota = (int) (Math.random() * 10) + 1;
        System.out.println(getNome() + " tirou a nota: " + nota);
        return nota;
    }

    @Override
    public int tirarNota(String comentario) {
        nota = (int) (Math.random() * 10) + 1; 
        System.out.println(getNome() + " tirou a nota: " + nota + ". Comentário: " + comentario);
        return nota;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade());
    }
}

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 3) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome deve ter pelo menos 3 caracteres.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("A idade deve ser maior que 0.");
        }
    }

    public abstract void mostrarDetalhes();
}

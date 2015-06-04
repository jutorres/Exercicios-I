import java.util.Objects;

/**
 * Created by aluno05 on 20/05/15.
 */
public class Contatos implements Comparable{
    String nome;
    String idade;
    String email;

    public Contatos(String nome, String idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object c) {
        return getNome().compareTo(((Contatos)c).getNome());
    }
}

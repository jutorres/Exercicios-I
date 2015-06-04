import java.util.ArrayList;

/**
 * Created by aluno05 on 20/05/15.
 */
public class Pessoa {
    String nome;
    String dataNascimento;
    String rg;
    ArrayList<Telefone> listaTelefone;

    public Pessoa(){
        listaTelefone = new ArrayList<>();
    }

    public Pessoa(String nome, String dataNascimento, String rg) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}



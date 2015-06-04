import java.util.ArrayList;

/**
 * Created by aluno05 on 20/05/15.
 */
public class Telefone {
    String numero;
    String modelo;
    ArrayList<Contatos> listaContatos;

    public Telefone(){
        listaContatos = new ArrayList<>();
    }

    public void adicionarContato(Contatos c){
        listaContatos.add(c);
    }

    public void removerContato(Contatos c){
        listaContatos.remove(c);
    }

    public Telefone(String numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void listaContatos(){
        for (Contatos c: listaContatos){
            System.out.println("Lista de contatos: " + toString());
        }
    }
}

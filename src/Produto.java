/**
 * Created by aluno05 on 19/05/15.
 */
public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int estoque;

    public Produto(int codigo, String descricao, double preco, int estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double calculaPreco(){
        double precofinal;
        if(codigo == 1 || codigo == 2) {
            precofinal = preco*0.95;
        } else if (codigo == 3){
            precofinal = preco*0.93;
        } else if (codigo == 4 || codigo == 5) {
            precofinal = preco*0.9;
        } else {
            precofinal = preco;
        }
        return precofinal;
    }
}

/**
 * Created by aluno05 on 19/05/15.
 */
public class Registradora {
    private double total;

    public Registradora(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addItem(double item){
        total = total+item;
    }

    //Retorna o total com os 10% de serviço
    public double totalComTaxa(){
        return total*1.1;
    }

    public double totalSemTaxa(){
        return total;
    }


}

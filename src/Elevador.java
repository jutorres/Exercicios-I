
public class Elevador {
    private int andar;

    public Elevador(int andar) {
        this.andar = andar;
    }

    public Elevador() {

    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void andarCima(){
        andar = andar+1;
    }

    public void andarBaixo(){
        andar = andar-1;
    }
}

/**
 * Created by aluno05 on 19/05/15.
 */
public class Televisor {
    private int volume;
    private int canal;

    public Televisor(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentaVolume(){
        volume = volume+1;
    }

    public void diminuiVolume(){
        volume = volume-1;
    }

    public void aumentaCanal(){
        canal = canal+1;
    }

    public void diminuiCanal(){
        canal = canal-1;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }
}

/**
 * Created by aluno05 on 19/05/15.
 */
public class Atleta {
    private double nota1,nota2,nota3,nota4,nota5,nota6;

    public Atleta(double nota1, double nota2, double nota3, double nota4, double nota5, double nota6) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.nota6 = nota6;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public double getNota6() {
        return nota6;
    }

    public void setNota6(double nota6) {
        this.nota6 = nota6;
    }

    public double maiorNota (){
    double maiorNota;
        if ((nota1>=nota2)&&(nota1>=nota3)&&(nota1>=nota4)&&(nota1>=nota5)&&(nota1>=nota6)){
            maiorNota = nota1;

        } else if ((nota2>=nota1)&&(nota2>=nota3)&&(nota2>=nota4)&&(nota2>=nota5)&&(nota2>=nota6)){
            maiorNota=nota2;

        }else if ((nota3>=nota1)&&(nota3>=nota2)&&(nota3>=nota4)&&(nota3>=nota5)&&(nota3>=nota6)){
            maiorNota=nota3;
        }else if ((nota4>=nota1)&&(nota4>=nota2)&&(nota4>=nota3)&&(nota4>=nota5)&&(nota4>=nota6)){
            maiorNota=nota4;
        }else if ((nota5>=nota1)&&(nota5>=nota2)&&(nota5>=nota3)&&(nota5>=nota4)&&(nota5>=nota6)){
            maiorNota=nota5;
        }else {
            maiorNota=nota6;
    } return maiorNota;
    }

    public double menorNota (){
        double menorNota;
        if ((nota1<=nota2)&&(nota1<=nota3)&&(nota1<=nota4)&&(nota1<=nota5)&&(nota1<=nota6)){
            menorNota = nota1;

        } else if ((nota2<=nota1)&&(nota2<=nota3)&&(nota2<=nota4)&&(nota2<=nota5)&&(nota2<=nota6)){
            menorNota=nota2;

        }else if ((nota3<=nota1)&&(nota3<=nota2)&&(nota3<=nota4)&&(nota3<=nota5)&&(nota3<=nota6)){
            menorNota=nota3;
        }else if ((nota4<=nota1)&&(nota4<=nota2)&&(nota4<=nota3)&&(nota4<=nota5)&&(nota4<=nota6)){
            menorNota=nota4;
        }else if ((nota5<=nota1)&&(nota5<=nota2)&&(nota5<=nota3)&&(nota5<=nota4)&&(nota5<=nota6)){
            menorNota=nota5;
        }else {
            menorNota=nota6;
        } return menorNota;
    }

    public  double media (){
    return ((nota1+nota2+nota3+nota4+nota5+nota6)-menorNota()-maiorNota())/4;
    }

    public int notasMenores6(){
        int cont =0;
        if(nota1 < 6){
            cont++;
        }
        if(nota2 < 6){
            cont++;
        }
        if(nota3 < 6){
            cont++;
        }
        if(nota4 < 6){
            cont++;
        }
        if(nota5 < 6){
            cont++;
        }
        if(nota6 < 6){
            cont++;
        }
        return cont;
    }
}

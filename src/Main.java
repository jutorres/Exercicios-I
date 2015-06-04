import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println("\fElevador");
//        Elevador elevador = new Elevador();
//        elevador.setAndar(10);
//
//        elevador.andarCima();
//        elevador.andarCima();
//        elevador.andarCima();
//        elevador.andarBaixo();
//        System.out.println(elevador.getAndar());
//
//        System.out.println("\nTelevisor");
//        Televisor televisor = new Televisor(0,0);
//        televisor.mudarCanal(12);
//        televisor.aumentaCanal();
//        televisor.aumentaVolume();
//        televisor.aumentaVolume();
//        televisor.aumentaVolume();
//        televisor.aumentaVolume();
//        televisor.aumentaVolume();
//        System.out.println("O canal é " + televisor.getCanal() + " e o volume é " + televisor.getVolume());
//
//        System.out.println("\n Notas");
//        Alunos rafael = new Alunos("Rafael",10, 8, 5.4);
//        Alunos juliana = new Alunos("Juliana",7,10,9.6);
//        System.out.println("A média do aluno " + rafael.getNome()+ " é " +rafael.media());
//        System.out.println("A média do aluno " +juliana.getNome()+ " é " +juliana.media());
//
//        System.out.println("\nRegistradora");
//        Registradora caixa = new Registradora(0);
//        caixa.addItem(20);
//        caixa.addItem(5);
//        caixa.addItem(25);
//
//        System.out.println("Valor da refeição com taxa de serviço: " + caixa.totalComTaxa());
//        System.out.println("Valor da refeição sem taxa de serviço: " + caixa.totalSemTaxa());

//          // Produto
//          int cont = 0;
//          int codigo = 0;

//        System.out.println("\nProduto1 ");
//        Scanner entrada = new Scanner(System.in);
//        do{
//        System.out.println("Digite o código do produto: ");
//        codigo = entrada.nextInt();
//            if (codigo < 0){
//                System.out.println("Digite um código maior que 0");
//            }
//        } while (codigo < 0);
//
//        System.out.println("Digite a descrição do produto: ");
//        String descricao = entrada.next();
//
//        double preco = 0;
//        do{
//        System.out.println("Digite o preço do produto: ");
//        preco = entrada.nextDouble();
//            if (preco < 0){
//                System.out.println("Digite um preço maior que 0");
//            }
//        } while (preco < 0);
//
//        int estoque = 0;
//        do{
//        System.out.println("Digite a quantidade em estoque do produto: ");
//        estoque = entrada.nextInt();
//            if ((estoque < 2) || (estoque > 30)){
//                System.out.println("Digite um valor entre 2 e 30");
//            }
//        } while ((estoque < 2) || (estoque > 30));
//        Produto produto1 = new Produto(codigo, descricao, preco, estoque);
//
//        System.out.println("\nProduto 2");
//        do{
//            System.out.println("Digite o código do produto: ");
//            codigo = entrada.nextInt();
//            if (codigo < 0){
//                System.out.println("Digite um código maior que 0");
//            }
//        } while (codigo < 0);
//
//        System.out.println("Digite a descrição do produto: ");
//        descricao = entrada.next();
//
//        preco = 0;
//        do{
//            System.out.println("Digite o preço do produto: ");
//            preco = entrada.nextDouble();
//            if (preco < 0){
//                System.out.println("Digite um preço maior que 0");
//            }
//        } while (preco < 0);
//
//        estoque = 0;
//        do{
//            System.out.println("Digite a quantidade em estoque do produto: ");
//            estoque = entrada.nextInt();
//            if ((estoque < 2) || (estoque > 30)){
//                System.out.println("Digite um valor entre 2 e 30");
//            }
//        } while ((estoque < 2) || (estoque > 30));
//        Produto produto2 = new Produto(codigo, descricao, preco, estoque);
//
//        System.out.println("\n");
//
//        System.out.println("O preço do produto 1 é: " + produto1.calculaPreco());
//        System.out.println("O preço do produto 2 é: " + produto2.calculaPreco());

//        Atleta corredor = new Atleta(10,3.2,8.5,5,6,4);
//        System.out.println(corredor.maiorNota());
//        System.out.println(corredor.menorNota());
//        System.out.println(corredor.media());
//        System.out.println(corredor.notasMenores6());

//        Scanner entrada = new Scanner(System.in);
//        Random radom  = new Random();
//        int numeroTmp = 0;
//        numeroTmp = radom.nextInt(30);
//
//        int num;
//        int num1 = 1;
//        int num2 = 30;
//        do{
//        System.out.println("Digite um número entre " + num1 + " e " + num2);
//        num = entrada.nextInt();
//            if(num==numeroTmp){
//                System.out.println("Parabéns, você acertou. O número sorteado foi " + numeroTmp);
//            } else if (num > numeroTmp){
//                System.out.println("O número que você digitou é maior que o número sorteado.");
//                num2 = num;
//            } else {
//                System.out.println("O número que você digitou é menor que o número sorteado.");
//                num1 = num;
//            }
//        }while(num != numeroTmp);
//        }


//        Contatos d = new Contatos("Lo", "5","lo@lo.com");
//        Contatos c = new Contatos("Ana", "20","xuxu@xuxu.com");
//        Contatos b = new Contatos("Gi", "10","gi@gi.com");
//
//        ArrayList<Contatos> listaContatos = new ArrayList<>();
//        listaContatos.add(c);
//        listaContatos.add(d);
//        listaContatos.add(b);
//
//        Collections.sort(listaContatos);
//        System.out.println("Imprimir contatos em ordem crescente: " + listaContatos);
//        Collections.reverse(listaContatos);
//        System.out.println("Imprimir contatos em ordem decrescente: " + listaContatos);
//
//        listaContatos.remove(b);
//        System.out.println(listaContatos);




    }
}

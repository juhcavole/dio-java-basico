import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class NomeIdade {
    public static void main(String[] args) {
        //fluxo de entrada, ler através do teclado
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0"))break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continua aqui...");
    }
   
}
 
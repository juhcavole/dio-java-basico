public class Operadores {
    
    public static void main(String[] args){

        //unários
        int numero = 5;
        boolean variavel = true;
        int a,b;
        a = 6;
        b = 6;
        String nome1= "Juliana";
        String nome2= new String("Juliana");


        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //incremento
        
        System.out.println(++numero);

        //decremento
        System.out.println(--numero);

        //Negação
        System.out.println(!variavel);

        //ternário
        String resultado = a==b ? "verdadeiro" : "falso" ;
        
        System.out.println(resultado);

        //Relacionais
        //equals compara conteúdos
        System.out.println(nome1.equals(nome2));

        //Lógicos
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7>4) ){
            System.out.println("As duas condições são verdadeiras");

        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        


    }
}

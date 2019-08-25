
package javaapplication04ifeelse;


public class JavaApplication04IFeElse {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        if (condição booleana)
        {
            //código
        }
        */
        
        int idade = 30;
        if (idade < 18){
            System.out.println("Menor Idade!");
        }
        else
        {
            System.out.println("Maior Idade!");
        }
        
        //operadores logicos
        // E && (conjunção)
        // OU || (disjunção()
        boolean amigoDoDono = true;
        if (idade < 18 && amigoDoDono == false){
            System.out.println("Menor Idade. Entrada Proibida. ");
        }
        else {
            System.out.println("Maior Idade. Pode entrar. ");
        }
        
        //operador de NEGAÇÃO (!)
            if (idade < 18 && !amigoDoDono ){
            System.out.println("Menor Idade. Entrada Proibida. ");
        }
        else {
            System.out.println("Maior Idade. Pode entrar. ");
        }
        }
    }

import java.util.Scanner;

public class User {
      void metodoApresentacao (){

     System.out.println("Bem Vindo Ao meu GitHub");
     System.out.println("Digite seu nome: ");
         Scanner x = new Scanner(System.in);
         String nome = x.nextLine();
     System.out.println("Insira seu Sobre nome: ");
     String SobreNome = x.nextLine();
          System.out.println("Seu nome completo é "+ nome +" "+ SobreNome);
    }



}

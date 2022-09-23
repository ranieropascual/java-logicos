import java.util.Scanner;

public class ejercicio1_5 {
    public static void main(String[] args) {
       int nota1, nota2;
       double media;
       Scanner sc = new Scanner(System.in);
       
       //leemos las notas
       System.out.println("nota 1: ");
       nota1 = sc.nextInt();
       System.out.println("nota 2: ");
       nota2 = sc.nextInt();
       
       //calculamos la media 
       media = (nota1 + nota2) / 2.0;
       
       System.out.println("la media es: " + media);
    } 
}

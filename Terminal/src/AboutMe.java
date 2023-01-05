import java.util.Locale;
import java.util.Scanner;

public class AboutMe 
{
    public static void main(String[] args) throws Exception 
    {
        //criando o objeto Scanner que permite uma iteração mais amigável com o usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);// Confere se os argumentos serão passados corretamente

        System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura:");
        double altura = scanner.nextDouble();


/* 
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
*/
        System.out.println("Olá, me chamo: " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos!");
        System.out.println("Minha altura é: " + altura + "cm");

    }
}

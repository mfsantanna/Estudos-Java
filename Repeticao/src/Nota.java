import java.util.Scanner;

public class Nota
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota:");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) // Enquanto a nota digitada estiver entre 0 e 10
        {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}

import java.util.Scanner;

public class Fatorial
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Fatorial;

        System.out.println("Qual o Fatorial?: ");
        Fatorial = scan.nextInt();

        for(int i=Fatorial-1;i>0;i--)
        {
            Fatorial=Fatorial*i;
        }

        System.out.println("O Resultado do Fatorial é: " + Fatorial);
    }
}

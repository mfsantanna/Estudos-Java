import java.util.Scanner;
public class ParImpar 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int Numero;
        int quantPares =0, quantImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int count=0;

        do
        {
            System.out.println("Numero: ");
            Numero = scan.nextInt();

            if(Numero % 2 == 0) quantPares++; // verifica o resto da divisão por 2
            else quantImpares++;

            count++;
        }
        while(count<quantNumeros);

        System.out.println("Quantidade de Números Pares: " + quantPares);
        System.out.print("Quantidade de Números Impares: " + quantImpares);

    }
}

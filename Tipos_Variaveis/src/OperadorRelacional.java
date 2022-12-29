public class OperadorRelacional 
{
    public static void main(String[] args)
    {
        int numero1 = 1;
        int numero2 = 2;

        boolean TF = numero1 == numero2;
        System.out.println("Numero1 é igual ao Numero2? " + TF);

        TF = numero1 != numero2;
        System.out.println("Numero1 é diferente do Numero2? " + TF);

        TF = numero1 > numero2;
        System.out.println("Numero1 é maior que Numero2? " + TF);
    }
}

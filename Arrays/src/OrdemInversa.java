public class OrdemInversa
{
   public static void main(String[] args)
   {
    int[] vetor = {0,-5,15,36,8,234};
    int count = (vetor.length) - 1;
    System.out.println("Vetor: ");

    while(count >=0)
    {
        System.out.print(vetor[count] + " ");
        count--;
    }
    
    
   } 
}
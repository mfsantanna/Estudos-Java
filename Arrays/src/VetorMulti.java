import java.util.Random;

public class VetorMulti 
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++) // i precisa percorrer o tamanho de toda a Matriz
        {
            for (int j = 0; j < M[i].length; j++)// j percorre o tamanho de cada linha da Matriz
            {
                M[i][j] = random.nextInt(0, 9); //gera numeros aleatorios entre 0 e 9
            }
        }

        System.out.println("Matriz:");
        for (int[] linha : M) 
        {
            for (int coluna : linha) //percorre cada elemento da linha indicada no "for" acima
            {
                System.out.print(coluna +" ");
            }

            System.out.println(); // depois que termina todas as colunas, pula pra próxima linha
        }
    }
}

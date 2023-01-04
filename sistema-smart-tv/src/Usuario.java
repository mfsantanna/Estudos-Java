public class Usuario {
    public static void main(String[] args) throws Exception 
    { //chamando metodos de uma classe criada em outro arquivo.
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual canal: " + smartTv.canal);
        System.out.println("Qual Volume: " + smartTv.volume);
        System.out.println();

        System.out.println("Ligando a TV");
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Novo Status -> Volume: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> Canal: " + smartTv.canal);


    }
}

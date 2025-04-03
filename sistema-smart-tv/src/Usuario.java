public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        System.out.println("Novo Satus -> TV ligata: " + smartTv.ligada);

        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.aumentarvolume();
        System.out.println("Volume Atual: " + smartTv.volume);


        if(smartTv.mudarcanal(0) > 0){
             System.out.println("Canal Atual: " +smartTv.canal);
        }else{
            smartTv.aumentacanal();
            smartTv.aumentacanal();
            System.out.println("Canal Atual: " +smartTv.canal);
        }
        /* 
        System.out.println("TV ligata: " + smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        */

    
        smartTv.desligar();
        System.out.println("Novo Satus -> TV desligar: " + smartTv.ligada);


    }

}

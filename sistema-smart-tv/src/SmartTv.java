public class SmartTv {
    boolean ligada = false;
    int canal = 0;
    int volume = 25;
 
    public int mudarcanal(int novoCanal){
        if(novoCanal > 0){
           this.canal = novoCanal;
        }
         return this.canal;
    }

    public void aumentacanal(){
        canal++;
    }

    public void diminuircanal(){
        canal--;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
    
    public void aumentarvolume(){
        volume++;
        System.out.println("Aumentando o volume: " + volume);
    }

    public void diminuirvolume(){
        volume--;
        System.out.println("diminuindo o volume: " + volume);
    }
}

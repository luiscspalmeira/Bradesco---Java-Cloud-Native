public class Carro extends Veiculo{

   
    
    private void partida(){
        System.out.println("Cambio em P");
    }

    private void combustivel(){
        System.out.println("Combustível verificado");
    }
    
    public void ligar(){
        partida();
        combustivel();
        System.out.println("Carro ligado");
    }
}

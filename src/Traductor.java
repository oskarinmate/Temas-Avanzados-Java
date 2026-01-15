public interface Traductor {
    void traducir();

    default void iniciarTraductor(){
        System.out.println("Iniciando Traductor...");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a ingles");
    }
}
class Frances implements Traductor{

    public void traducir(){
        System.out.println("Traduzco a Frances");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando Traductor en Frances...");
    }

}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor traductor = new Ingles() ;
        traductor.iniciarTraductor();
        traductor.traducir();

        // traductor en Frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
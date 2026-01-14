public class ClaseAbstracta {
    public static void main(String[] args) {
        //no se puede agregar como objetu una clase abstracta
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();

        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}
// clase abstracta
abstract class FiguraGeometrica{
    public abstract void dibujar();

}
class Rectangulo extends  FiguraGeometrica {
    @Override
    public void dibujar(){
        System.out.println("se dibuja un rectangulo");
    }
}

class Circulo extends FiguraGeometrica{
    @Override
    public void dibujar() {
        System.out.println("Se debe dibujar un circulo");
    }
}
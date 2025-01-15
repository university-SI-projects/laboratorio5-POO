public class Pixel extends Ponto2D{
    private int cor;

    public Pixel (double x, double y, int cor){
        super(x,y);
        this.cor = cor%100;
    }

    public Pixel (){
        super();
        this.cor = 0;
    }

    public int getCor() {
        return this.cor;
    }

    public void mudaCor (int cor){
        this.cor = cor;
    }
    
    //a classe Pixel herda o método desloca() da superclasse
    // public void deslocaPixel(double x, double y){
    //     super.desloca(x,y);
    // }
}

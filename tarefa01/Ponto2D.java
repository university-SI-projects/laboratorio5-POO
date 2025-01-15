public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D (double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ponto2D(){
        this(0.0, 0.0);
    }
    
    public Ponto2D(Ponto2D p){
        this(p.getX(), p.getY());
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void desloca (double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public Ponto2D somaPonto(double dx, double dy){
        return new Ponto2D(this.x + dx, this.y + dy);
    }

    public Ponto2D somaPonto(Ponto2D p){
        return new Ponto2D(this.x + p.getX(), this.y + p.getY());
    }

    public Ponto2D clone (){
        return new Ponto2D(this);
    }

    public String toString() {
        return "Ponto2D [x=" + x + ", y=" + y + "]";
    }
 
}

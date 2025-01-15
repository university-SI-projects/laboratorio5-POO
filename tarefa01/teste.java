
public class teste {
    public static void main(String[] args) {
        Pixel pixel = new Pixel(2.3, 4.5, 75);

        pixel.desloca(2, 3);;
        System.out.println("Nova posiçao X:" + pixel.getX());
        System.out.println("Nova posiçao Y:" + pixel.getY());

    }
}

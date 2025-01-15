
public class teste {
    public static void main(String[] args) {
        Pixel pixel = new Pixel(2.3, 4.5, 75);
        Pixel pixelCopy = (Pixel) pixel.clone();
        pixel.desloca(2, 3);;
        
        System.out.println(pixel.toString());
        System.out.println(pixelCopy.toString());
       

    }
}

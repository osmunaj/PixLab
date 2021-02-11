public class Activity5 {
    public static void main(String[] args){
    


    }

    public void keepOnlyBlue(){
        Pixel[][] pixels;
        Pixel pixel = null;
        for (int row = 0; row < pixels.length; row++){
            for (int col = 0; col < pixels[0].length; col++){
                pixel = pixels[row][col];
                pixel.setRed(0);
                pixel.setGreen(0);
            }
        }
    }

    public void negate(){
        Pixel[][] pixels;
        Pixel pixel = null;
        for (int row = 0; row < pixels.length; row++){
            for (int col = 0; col < pixels[0].length; col++){
                pixel = pixels[row][col];
                pixel.setRed(255-pixel.getRed());
                pixel.setGreen(255-pixel.getGreen());
                pixel.setBlue(255-pixel.getBlue());
            }
        }
    }

}

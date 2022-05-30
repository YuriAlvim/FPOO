import java.awt.image.RenderedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class img {
    public static void main(String[] args) {
        File car = new File("../ProjetoFinal1Semestre/CapaPerfil.png");

        RenderedImage bufferedImage;
        ImageIO.write(bufferedImage, "PNG", car);
    }
}

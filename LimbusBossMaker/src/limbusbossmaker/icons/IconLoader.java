/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package limbusbossmaker.icons;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Ryan
 */
public class IconLoader {
    public BufferedImage loadIcon(String pathRelativeToThis) throws IOException{
        URL url = this.getClass().getResource(pathRelativeToThis);
        BufferedImage img = ImageIO.read(url);
        return img;
    }
    
}

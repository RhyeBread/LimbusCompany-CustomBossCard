/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package limbusbossmaker.templates;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Ryan
 */
public class Skills extends JFrame {
    public Skills(String imagePath){
        JPanel panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon image = new ImageIcon(getClass().getResource("regular_coin.png"));


            }
        };

        this.getContentPane().add(panel);
    }
}

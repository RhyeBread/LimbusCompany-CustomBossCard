/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package limbusbossmaker;

import limbusbossmaker.templates.Skills;

import java.awt.BorderLayout;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static limbusbossmaker.mainJFrame.loadImage;

/**
 *
 * @author Ryan
 */
public class LimbusBossMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> skill1CoinDescriptions =
                List.of(
                        """
                        [On Hit] Deal 20 Envy damage
                        """,
                        "[Heads] Deal 10 Blunt damage");
        
        String skill1Description =
                """
                [On use] Start the music
                """;
        
        String skill1Lore = "\"This is a test\"";
        
        BossSkill skill_1 = new BossSkill(
                "Gotcha!", Types.skill.OFFENSIVE, skill1Description, Types.sin.ENVY,
                Types.attack.BLUNT, Types.coin.REGULAR, 1, 2, 20, 2,
                Types.skillFrame.STRONGEST, skill1CoinDescriptions,
                skill1Lore);
                
        skill_1.displayCoinDescriptions();
        
//        ImageIcon OriginalCoin = new ImageIcon("regular_coin.png");
//        
//        Image coinIcon = OriginalCoin.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
//        ImageIcon resized = new ImageIcon(coinIcon);
        
        mainJFrame main = new mainJFrame();
        main.setSize(700,700);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
    
    
}

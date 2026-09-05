/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package limbusbossmaker.icons;

import java.awt.image.BufferedImage;
import limbusbossmaker.Types;

/**
 *
 * @author Ryan
 */
public class SkillIconTileSheet {
    
    public BufferedImage baseTileSheet;
    public BufferedImage strongestTileSheet;
    int imageWidthAndHeight = 512;
    
    public SkillIconTileSheet(BufferedImage baseTileSheet, BufferedImage strongestTileSheet){
        this.baseTileSheet = baseTileSheet;
        this.strongestTileSheet = strongestTileSheet;
    }
    
    public BufferedImage getSkillIcon(Types.skillFrame skillFrame, Types.sin sin){
        
        BufferedImage tile = strongestTileSheet.getSubimage(2, 0, imageWidthAndHeight, imageWidthAndHeight);
        
        switch(sin){
            case (sin.WRATH):
                if(skillFrame == skillFrame.NORMAL){
                    tile = baseTileSheet.getSubimage(0, 3, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGER){
                    tile = baseTileSheet.getSubimage(1, 1, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                
                else if (skillFrame == skillFrame.STRONGEST){
                    tile = strongestTileSheet.getSubimage(0, 3, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }

                
                
            case(sin.LUST):
                if(skillFrame == skillFrame.NORMAL){
                    tile = baseTileSheet.getSubimage(1, 3, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGER){
                    tile = baseTileSheet.getSubimage(1, 1, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGEST){
                    tile = strongestTileSheet.getSubimage(1, 3, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                
                
                
            case(sin.SLOTH):
                if(skillFrame == skillFrame.NORMAL){
                    tile = baseTileSheet.getSubimage(2, 3, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGER){
                    tile = baseTileSheet.getSubimage(1, 2, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGEST){
                    tile = strongestTileSheet.getSubimage(2, 3, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
            
                
                
            case(sin.GLUTTONY):
                if(skillFrame == skillFrame.NORMAL){
                    tile = baseTileSheet.getSubimage(3, 3, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGER){
                    tile = baseTileSheet.getSubimage(1, 3, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGEST){
                    tile = strongestTileSheet.getSubimage(3, 3, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                
                
                
            case(sin.GLOOM):
                if(skillFrame == skillFrame.NORMAL){
                    tile = baseTileSheet.getSubimage(0, 1, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGER){
                    tile = baseTileSheet.getSubimage(0, 0, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGEST){
                    tile = strongestTileSheet.getSubimage(0, 2, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                
                
            case(sin.PRIDE):
                if(skillFrame == skillFrame.NORMAL){
                    tile = baseTileSheet.getSubimage(0, 1, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGER){
                    tile = baseTileSheet.getSubimage(0, 2, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGEST){
                    tile = strongestTileSheet.getSubimage(1, 2, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
             
                
            case(sin.ENVY):
                if(skillFrame == skillFrame.NORMAL){
                    tile = baseTileSheet.getSubimage(2, 2, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGER){
                    tile = baseTileSheet.getSubimage(0, 2, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
                else if (skillFrame == skillFrame.STRONGEST){
                    tile = strongestTileSheet.getSubimage(2, 2, imageWidthAndHeight, imageWidthAndHeight);
                    break;
                }
             
        }
        return tile;
    }
}

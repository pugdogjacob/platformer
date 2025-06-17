package gamelogic.tiles;

import java.awt.image.BufferedImage;

import gameengine.hitbox.RectHitbox;
import gamelogic.level.Level;



public class Powerup extends Tile {
    public Powerup(float x, float y, int size, BufferedImage image, boolean solid, Level level) {
        super (x, y, size, image, solid, level);
        this.hitbox = new RectHitbox(x *size, y*size, 0, 0, size, size);
    }
    
}

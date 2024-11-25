package game.elements;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;


public class Wall extends Element {
    public Wall(int x, int y) {
        super(x, y);
    }
    public void draw(TextGraphics g) {
        g.setForegroundColor(TextColor.Factory.fromString("#FF3333"));
        g.putString(new TerminalPosition(position.getX(), position.getY()), "X");
    }
}

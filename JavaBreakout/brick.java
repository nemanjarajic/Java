package JavaBreakout;
import javax.swing.*;

public class brick extends sprite {
    private boolean destroyed;

    public brick(int x , int y){
        initBrick(x,y);
    }

    private void initBrick(int x, int y){
        this.x = x;
        this.y = y;

        loadImage();
        getImageDimension();
    }

    private void loadImage(){
        var ii = new ImageIcon();
        image = ii.getImage();
    }

    boolean isDestroyed(){
        return destroyed;
    }

    void setDestroyed(boolean val){
        destroyed = val;
    }
}

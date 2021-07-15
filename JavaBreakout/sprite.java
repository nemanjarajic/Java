package JavaBreakout;
import java.awt.*;

public class sprite {
    int x,y, imageWidth, imageLength;
    Image image;

    protected void setX(int x){
        this.x =x;
    }

    protected void setY(int y){
        this.y = y;
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }

    int getImageWidth(){
        return imageWidth;
    }
    
    int getImageLength(){
        return imageLength;
    }

    Image getImage(){
        return image;
    }

    Rectangle getRect(){
        return new Rectangle(x,y,image.getWidth(null),image.getHeight(null));
    }

    void getImageDimension(){
        imageWidth = image.getWidth(null);
        imageLength = image.getHeight(null);
    }
}

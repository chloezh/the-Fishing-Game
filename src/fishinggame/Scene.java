package fishinggame;

import edu.macalester.graphics.Image;
import java.util.*;

public class Scene{
    Image currentImage;

    Image lakenight = new Image(0,0,"doc/pics/LakeNight.png");
    Image milkyway = new Image(0,0,"doc/pics/MilkyWay.png");

    //map images to the name
    Map<String, Image> theme_to_image = new HashMap<>();
    theme_to_image.put("Lake Night", lakenight);
    theme_to_image.put("Milky Way", milkyway);

    public Scene(String name){
        currentImage = theme_to_image.get(name);
    }

    private static void getImage(){
        return currentImage;
    }

    private static void setImagePosition(double x, double y){
        currentImage.setPosition(x, y);
    }


    
}
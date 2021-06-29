package fishinggame;

import edu.macalester.graphics.*;
import java.util.*;
import java.awt.Color;

public class theFishingGame {
    private static final int CANVAS_WIDTH = 1600;
    private static final int CANVAS_HEIGHT = 900;
    private static final int IMAGE_WIDTH = 800;
    private static final int IMAGE_HEIGHT = 450;
    private CanvasWindow canvas;
    private GraphicsGroup backpackGroup;
    private GraphicsGroup backpackItems;

    private Ellipse range = new Ellipse(0,0,150,70);
    //------------TO DO-------------: set color for the range

    private Ellipse fish = new Ellipse(0,0,30,30);
    //------------TO DO-------------: set color for the fish

    private List<String> backpack = new ArrayList<String>();

    private GraphicsText theme;
    theme.setFont(FontStyle.BOLD, 15);


    private GraphicsText description; //------------TO DO-------------: add description
    description.setFont(FontStyle.PLAIN, 15);
    description.setText("How to play:\n    
                        -Choose a theme first\n    
                        -Click 'Cast' to cast the fishing rod\n    
                        -Wait for the fish to appear\n    
                        -When the fish is within the range of the fishhook, click 'Retrieve' to catch the fish\n    
                        -The fish you caught successfully will appear in the backpack list
                        -The backpack can store up to 10 items
                        -If the backpack is full, restart");
    description.setCenter(0,0);//------------TO DO-------------

    private GraphicsText backpackTitle;
    backpackTitle.setFont(FontStyle.BOLD, 25);
    backpackTitle.setText("Backpack");
    backpackTitle.setCenter(0,0); //------------TO DO-------------
    backpackGroup.add(backpackTitle);

    private GraphicsText backpackNum;
    backpackNum.setFont(FontStyle.PLAIN, 10);
    backpackNum.setText("1\n2\n3\n4\n5\n6\n7\n8\n9\n10");
    backpackNum.setCenter(0,0); //------------TO DO-------------
    backpackGroup.add(backpackNum);

    private GraphicsText backpackFishTitle;
    backpackFishTitle.setFont(FontStyle.PLAIN, 15); //------------TO DO-------------
    backpackFishTitle.setText("Fish");
    backpackNum.setCenter(0,0); //------------TO DO-------------
    backpackGroup.add(backpackFish);

    private GraphicsText backpackWeightTitle;
    backpackWeightTitle.setFont(FontStyle.PLAIN, 15);
    backpackWeightTitle.setText("Weight(kg)");
    backpackWeightTitle.setCenter(0,0); //------------TO DO-------------
    backpackGroup.add(backpackWeightTitle);

    Image character = new Image(0,0,"doc/pics/character.png");
    character.setMaxWidth(15); //------------TO DO-------------
    character.setMaxHeight(15); //------------TO DO-------------

    Image rod = new Image(0,0,"doc/pics/FishRod.png");
    rod.setMaxWidth(20); //------------TO DO-------------
    rod.setMaxHeight(20); //------------TO DO-------------

    public theFishingGame(){
        canvas = new CanvasWindow("The Fishing Game", CANVAS_WIDTH, CANVAS_HEIGHT);

        canvas.add(character);
        canvas.add(BackpackGroup);

        //Buttons
        addThemeButton("Lake Night", 100, 50);
        addThemeButton("Milky Way", 200, 50);
        addCastButton(800, 650);
        addRetrieveButton(800, 700);

    }

    public static void main(String[] args) {
        new theFishingGame();
    }

    private void addThemeButton(String name, double x, double y) {
        Button themeButton = new Button(name);
        canvas.add(themeButton);
        themeButton.setPosition(x, y);
        //themeButton.onClick(() -> currentBrush = brush); //TO DO: decide event for the click
    }

    private void addCastButton(double x, double y) {
        Button castButton = new Button("Cast"); //抛竿
        canvas.add(castButton);
        castButton.setPosition(x, y);
        //castButton.onClick(() -> canvas.add(rod)); //TO DO: decide event for the click
    }

    private void addRetrieveButton(double x, double y) {
        Button retrieveButton = new Button("Retrieve"); //收竿
        canvas.add(themeButton);
        retrieveButton.setPosition(x, y);
        //retriveButton.onClick(() -> currentBrush = brush); //TO DO: decide event for the click
    }

    /**
     * The cast method will generate a random waiting time, 
     * after the waiting time an oval will be added to the canvas, representing the range of the fishing hook.
     */
    private void cast(){
        Random rand = new Random();

        //------------TO DO-------------: how to determine min and max
        double waitingtime = rand.nextDouble() * 5; 

        //------------TO DO-------------: after the waiting time, add the oval to the canvas
        canvas.add(range);

    }

    /**
     * If the fish is within range, return true;
     * If the fish is out of range, return false;
     */
    private boolean success(){
        return true;   
    }

    /**
     * If success, randomly pick a fish, put its name and attribute to the backpack.
     * Add the name and the attribute to the canvas, and the name into the backpack list.
     */
    private void retrieve(boolean success){

    }

    /**
     * Check if the backpack is full
     * If equals 10, return true;
     * If within 10, return false;
     */
    private boolean fullBackPack(){
        if (backpack.size() < 10){
            return false;
        }
        return true;
    }

    private void restart(){
        backpack.removeAll(c); //------------TO DO-------------
    }
}

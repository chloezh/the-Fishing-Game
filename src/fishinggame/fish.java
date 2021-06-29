package fishinggame;

import java.util.*;

public class fish {
    private List<String> currentFish = new ArrayList<String>();
    private List<double> currentWeight = new ArrayList<double>();
    private Map<List<String>, List<double>> currentMap = new HashMap<>();
    private Random rand = new Random();

    //Lake Night fish & weights
    private List<String> lakeNightFish = List.of(
        "Koi", "Carp", "American shad", "Lake herring", "Sardine", 
        "Steelhead trout", "Alligator gar", "Bluegill", "Colorado pikeminnow", "Pike",
        "Yellow perch", "Goldfish"
        ); 

    //------------TO DO-------------: how to determine min and max
    private List<Double> lakeNightWeight = List.of{rand.nextDouble()*3, rand.nextDouble()*5, 
        rand.nextDouble()*10, rand.nextDouble()*7, rand.nextDouble()*15, rand.nextDouble()*9, rand.nextDouble()*20,
        rand.nextDouble()*13, rand.nextDouble()*3.5, rand.nextDouble()*2.4, rand.nextDouble()*8.5, rand.nextDouble()*1}

    //Milky Way fish & weights
    private List<String> milkyWayFish = List.of(
        "Sun", "Earth", "Venus", "Mercury", "Mars", 
        "Pluto", "Uranus", "Neptune", "Saturn", "Jupiter", 
        "Alpha Centauri a", "an asteroid", "Ceres", "Cassini"
        );
    
    //------------TO DO-------------: how to determine min and max
    private List<Double> milkyWayWeight = List.of{2e30, 6e24, 4.867e24, 3.285e23, 6.39e23,
            1.25e22, 8.681e25, 1.024e26, 5.683e26, 1.898e27,
            2.188e30, rand.nextDouble()*(3.2e21), 9.38e20, 2125}

    //map the fish to the weight for each theme
    Map<List<String>,List<double>> LakeNight_FishMapWeight = new HashMap<>();
    for(int i = 0; i < lakeNightFish.size(); i++){
        LakeNight_FishMapWeight.put(lakeNightFish.get(i), lakeNightWeight.get(i));
    }

    Map<List<String>,List<double>> MilkyWay_FishMapWeight = new HashMap<>();
    for(int i = 0; i < milkyWayFish.size(); i++){
        LakeNight_FishMapWeight.put(milkyWayFish.get(i), milkyWayWeight.get(i));
    }

    //map the theme to the fish, weights and map lists
    Map<List<String>,List<String>> ThemeName_map_fish = new HashMap<>();
    ThemeName_map_fish.put("Lake Night", lakeNightFish);
    ThemeName_map_fish.put("Milky Way", milkyWayWeight);


    Map<List<String>,List<String>> ThemeName_map_weight = new HashMap<>();
    ThemeName_map_weight.put("Lake Night", lakeNightWeight);
    ThemeName_map_weight.put("Milky Way", milkyWayFish);

    Map<List<String>,List<String>> ThemeName_map_maps = new HashMap<>();
    ThemeName_map_maps.put("Lake Night", LakeNight_FishMapWeight);
    ThemeName_map_maps.put("Milky Way", MilkyWay_FishMapWeight);


    public fish(String name) {
        currentFish = ThemeName_map_fish.get(name);
        currentWeight = ThemeName_map_weight.get(name);
        currentMap = ThemeName_map_maps.get(name);
    }

    /**
     * return the list of fish of the chosen theme
     */
    public List<String> getFish(){
        return currentFish;
    }

    /**
     * return the list of weights of the fish of the chosen theme
     */
    public List<double> getWeight(){
        return currentWeight;
    }

    /**
     * return the map of the theme to use in order to find the weight of the fish
     */
    public List<double> getMap(){
        return currentMap;
    }


}

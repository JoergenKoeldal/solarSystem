
import java.util.ArrayList;
import java.util.HashMap;

public class SolarSystem {

    //Opretter man et tomt hashmap, men mulighed for en arrayList af måner
    HashMap<Planet, ArrayList<Moon>> solarSystemMap = new HashMap<>();

    //Tilføjer en planet til vores hashmap men med tom value
    public void addPlanet(Planet planet){
        solarSystemMap.put(planet, new ArrayList<Moon>());
    }
    //Tilføjer en value til den ønskede key (planet)
    public void addMoonToPlanet(Moon moon, Planet planet){
        solarSystemMap.get(planet).add(moon);
    }

    //Returnere den ønskede planets values størrelse, altså hvor mange måner den enkelte planet har
  public int getMoons(Planet planet){
        return solarSystemMap.get(planet).size();
  }

  //Udregner afstanden mellem to planet objekter, altid udregnet ud fra afstanden fra jorden
  public int distanceCalculator(Planet planet1, Planet planet2){
        //Math gør det ligegyldigt hvilken rækkefølge planeterne kommer i
      return Math.abs(planet1.getDistance()-planet2.getDistance());

  }

}

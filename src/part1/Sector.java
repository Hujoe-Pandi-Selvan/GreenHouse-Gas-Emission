package part1;
import java.util.*;
public class Sector {
    private String name;
    private Map<Integer, Double> emissions;

    Sector(String name,Map<Integer, Double> emissions ){
        this.name=name;
        this.emissions=emissions;
    }
    public String getName(){
        return this.name;
    }
    public Map<Integer, Double> getEmissions(){
        return this.emissions;
    }
//    public int getYearWithHighestEmissions(){
//        double h = 0;
//
//        double temp;
//        for (double e: this.getEmissions().values()){
//            if(h < e){
//                h=e;
//            }
//        }
//        for (int e: this.getEmissions().keySet()){
//            if(this.getEmissions().get(e).equals(h)){
//                return e;
//            }
//        }
//
//        return 0;
//
//    }
}



package part1;
import java.util.*;


public class Country {
    private String name;
    private Map<Integer, Emission> emissions;

    void Country(String name,Map<Integer, Emission> emissions ){
        this.name= name;
        this.emissions=emissions;
        }
    public String getName(){
        return this.name;

    }
    public Map<Integer, Emission> getEmissions(){
       return this.emissions;
    }
//    public int getYearWithHighestEmissions(){
//        double t=0;
//        int year = -1;
//        for(int e: this.getEmissions().keySet()){
//            Emission em = this.getEmissions().get(e);
//            double total = em.getCO2() + em.getN2O() + em.getCH4();
//            if(total>t){
//                t = total;
//                year = e;
//            }
//        }
//        return year;
//
    }




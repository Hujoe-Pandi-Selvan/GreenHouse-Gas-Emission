package part2;
import java.util.*;
public class Sector {
    private String name;
    private Map<Integer, Double> emissions;

    public Sector(String name,Map<Integer, Double> emissions ){
        this.name=name;
        this.emissions=emissions;
    }
    public String getName(){
        return this.name;
    }
    public Map<Integer, Double> getEmissions(){
        return this.emissions;
    }
    public int getYearWithHighestEmissions(){
        double h = 0;

        double temp;
        for (double e: this.getEmissions().values()){
            if(h < e){
                h=e;
            }
        }
        for (int e: this.getEmissions().keySet()){
            if(this.getEmissions().get(e).equals(h)){
                return e;
            }
        }

        return 0;

    }
    public static Sector sectorWithBiggestChangeInEmissions(List<Sector> sectors, int startYear, int endYear){
        double n;
        double max=0;
        Sector so=null;
        for(Sector s:sectors){
            Map<Integer, Double> d = s.getEmissions();
            n=d.get(startYear)+d.get(endYear);
            if(n > max){
                max=n;
                so=s;
            }
        }
        System.out.print(so.getName());
        return so;

    }


}



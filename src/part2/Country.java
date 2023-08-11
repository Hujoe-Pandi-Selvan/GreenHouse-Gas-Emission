package part2;
import java.util.*;

public class Country {
    private String name;
    private Map<Integer, Emission> emissions;

    public Country(String name,Map<Integer, Emission> emissions ){
        this.name= name;
        this.emissions=emissions;
        }
    public String getName(){
        return this.name;

    }
    public  Map<Integer, Emission> getEmissions(){
        return this.emissions;
    }
    public int getYearWithHighestEmissions(){
        double t=0;
        int year = -1;
        for(int e: this.getEmissions().keySet()){
            Emission em = this.getEmissions().get(e);
            double total = em.getCO2() + em.getN2O() + em.getCH4();
            if(total>t){
                t = total;
                year = e;
            }
        }
        return year;

    }
    public static Country countryWithHighestCH4InYear(List<Country> countries, int year){

        double max=0;
        Country co = null;
        for(Country c : countries){
            Map<Integer,Emission> P = c.getEmissions();
            if( P.get(year).getCH4() > max){
                max = P.get(year).getCH4();
                co = c;
            }
        }
        System.out.print(co.getName());
        return co;
    }

    public static Country countryWithHighestChangeInEmissions(List<Country> countries, int startYear, int endYear) {

        double n;
        Double max = 0.0;
        Country go=null;
//        double[]arr=new double[10000];
        for (Country c1 : countries) {
            Map<Integer, Emission> d = c1.getEmissions();
            n =  (d.get(endYear).getN2O() + d.get(endYear).getCO2() + d.get(endYear).getCH4())-(d.get(startYear).getN2O() + d.get(startYear).getCO2() + d.get(startYear).getCH4()) ;
            if (n > max) {
                max = n;
                go=c1;
            }


        }
        System.out.print(go.getName());
        return go;
    }}





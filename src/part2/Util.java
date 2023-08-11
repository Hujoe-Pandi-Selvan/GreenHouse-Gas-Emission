//
//package part2;
//public class Util {
//    public static int getYearWithHighestEmissions(Country country){
//        double t=0;
//        int year = -1;
//        for(int e: country.getEmissions().keySet()){
//            Emission em = country.getEmissions().get(e);
//            double total = em.getCO2() + em.getN2O() + em.getCH4();
//            if(total>t){
//                t = total;
//                year = e;
//            }
//        }
//        return year;
//
//    }
//    public static int getYearWithHighestEmissions(Sector sector){
//        double h = 0;
//
//        double temp;
//        for (double e: sector.getEmissions().values()){
//            if(h < e){
//                h=e;
//            }
//        }
//        for (int e: sector.getEmissions().keySet()){
//                if(sector.getEmissions().get(e).equals(h)){
//                    return e;
//                }
//        }
//
//        return 0;
//
//    }
//}

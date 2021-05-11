package pyramids;

import java.io.StringReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        pyramid_csv_DAO r=new pyramid_csv_DAO();
        List<pyramid>pyramids=r.read_pyramids_from_csv("/home/mostafa/Downloads/archive/pyramids.csv");
        int i=0;
        for(pyramid p:pyramids){
            System.out.println('#'+(i++)+" "+p.getHeight()+" - "+p.getModern_name()+" - "+p.getPharaoh()+" - "+p.getSite());

        }
        List<pyramid>sort_pyramids=pyramids;
        object_comparator comparator = new object_comparator();
        Collections.sort(sort_pyramids, comparator);
        i=0;
        System.out.println("-----------------After sorting According to height of the pyramid-------------");
        for(pyramid p:sort_pyramids){
            System.out.println('#'+(i++)+" "+p.getHeight()+" - "+p.getModern_name()+" - "+p.getPharaoh()+" - "+p.getSite());
        }

        /*
        * using hash map to show the number of pyramids in each site location
        *
        * */

        Map<String,Integer>site_map=new HashMap<>();

        ArrayList<String>sites=new ArrayList<>();

        for(pyramid p:pyramids){
            sites.add(p.getSite());
        }

        for(String s:sites) {

            int occurrences = Collections.frequency(sites, s);
            site_map.put(s,occurrences);

        }
        System.out.println("----------------Map for Site Location--------------");
        site_map.forEach((k,v)-> System.out.println("site location: "+k+" |count: "+v));




    }
}

package pyramids;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class pyramid_csv_DAO implements read_pyramids {

    public List<pyramid> read_pyramids_from_csv(String filename) {
        List <pyramid>pyramid_data=new ArrayList<>();
        try {
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                FileReader file = null;
                try {
                    file = new FileReader(filename);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                BufferedReader buff = new BufferedReader(file);
                String parts[];
                try {
                    String Line = buff.readLine();
                    while (Line != null) {
                        Line = buff.readLine();
                        if (Line == null)
                            break;
                        parts = Line.split(",");
                        if (parts[7].equals(""))
                            parts[7] = "0";
                        pyramid_data.add(new pyramid(Double.parseDouble(parts[7]), parts[2], parts[0], parts[4]));

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                }
            });
            thread.start();
            thread.join();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        return pyramid_data;
    }
}


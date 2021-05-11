package pyramids;

import java.util.Comparator;

public class object_comparator implements Comparator<pyramid>{


         @Override
         public int compare(pyramid obj1, pyramid obj2) {
            return Double.compare(obj1.getHeight(),obj2.getHeight());
        }

    }



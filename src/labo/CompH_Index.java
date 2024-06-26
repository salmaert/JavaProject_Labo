package labo;

import java.util.Comparator;
import java.util.Objects;

public class CompH_Index implements Comparator {
    public int compare(Object o1,Object o2){
     int H_index1=((chercheur) o1).getH_index();
     int H_index2=((chercheur) o2).getH_index();
     if (H_index2==H_index2) return 0;
     else if (H_index1< H_index2)return 1;
     else return -1;

    }
}

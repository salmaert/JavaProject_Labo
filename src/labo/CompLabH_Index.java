package labo;

import java.util.Comparator;

public class CompLabH_Index implements Comparator {

    public int compare(Object o1,Object o2){
        int HLab_index1=((Laboratoire) o1).getLab_Hindex();
        int HLab_index2=((Laboratoire) o2).getLab_Hindex();
        return HLab_index1-HLab_index2;
    }
}

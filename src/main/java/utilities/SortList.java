package utilities;

import pets.Pets;

import java.util.Comparator;

public class SortList implements Comparator<Pets> {

    @Override
    public int compare(Pets o1, Pets o2) {


        return o1.getType().compareTo(o2.getType());
    }
}

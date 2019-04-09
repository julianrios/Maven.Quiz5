package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    private SortedSet<_> set;

    public SortedGroup() {
        this.set = new TreeSet<>();
    }

    public void insert(_ value) {
        this.set.add(value);
    }


    public void delete(_ value) {
        this.set.remove(value);
    }

    public Integer indexOf(_ value) {
        return new ArrayList<>(set).indexOf(value);
    }
}

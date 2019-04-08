package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_>, GroupInterface<_> {
    private Set<_> set;

    public Group() {
        this.set = new TreeSet<>();
    }

    public Integer count() {
        return this.set.size();
    }

    public void insert(_ value) {
        this.set.add(value);
    }

    public Boolean has(_ value) {
        return this.set.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return new ArrayList<>(set).get(indexOfValue);
    }

    public void delete(_ value) {
        this.set.remove(value);
    }

    public void clear() {
        this.set.clear();
    }

    public Iterator<_> iterator() {
        return this.set.iterator();
    }

    public Integer indexOf(_ value) {
        return new ArrayList<>(set).indexOf(value);
    }

    @Override
    public String toString() {
        return Arrays.toString(set.toArray());
    }

}

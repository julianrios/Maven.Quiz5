package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_>, GroupInterface<_> {
    private List<_> list;

    public Group() {
        this.list = new ArrayList<>();
    }

    public Integer count() {
        return this.list.size();
    }

    public void insert(_ value) {
        this.list.add(value);
    }

    public Boolean has(_ value) {
        return this.list.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return this.list.get(indexOfValue);
    }

    public void delete(_ value) {
        this.list.remove(value);
    }

    public void clear() {
        this.list.clear();
    }

    public Iterator<_> iterator() {
        return this.list.iterator();
    }

    public Integer indexOf(_ value) {
        return list.indexOf(value);
    }

    @Override
    public String toString() {
        return Arrays.toString(list.toArray());
    }

}

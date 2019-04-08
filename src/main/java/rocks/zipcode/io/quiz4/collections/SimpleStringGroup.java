package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    private List<String> list;

    public SimpleStringGroup() {
        this.list = new ArrayList<>();
    }

    public Integer count() {
        return this.list.size();
    }

    public void insert(String string) {
        this.list.add(string);
    }

    public Boolean has(String string) {
        return this.list.contains(string);
    }

    public String fetch(int indexOfValue) {
        return this.list.get(indexOfValue);
    }

    public void delete(String string) {
        this.list.remove(string);
    }

    public void clear() {
        this.list.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return this.list.iterator();
    }
}

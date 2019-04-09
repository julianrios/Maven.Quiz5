package rocks.zipcode.io.quiz4.generics;

import rocks.zipcode.io.quiz4.objectorientation.StringAssembler;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> implements Comparable<_> {
    private Set<_> set;

    public ComparableTreeSet(_... arr) {
        List<_> list = Arrays.asList(arr);
        this.set = new TreeSet<>(list);
    }


    public ComparableTreeSet() {
        this.set = new TreeSet<>();
    }

    public int compareTo(ComparableTreeSet<_> o) {
        return Integer.valueOf(null);
    }

    public Set<_> getSet() {
        return set;
    }

    @Override
    public int compareTo(_ o) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(_ element : set) {
            sb.append(element).append(", ");
        }

        sb.append("]");

        sb.deleteCharAt(sb.length()-3);
        sb.deleteCharAt(sb.length()-2);
        return sb.toString();
    }
}

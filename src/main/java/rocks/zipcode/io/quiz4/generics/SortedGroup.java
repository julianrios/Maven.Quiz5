package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    @Override
    public void insert(_ value) {
        super.insert(value);
    }

    @Override
    public void delete(_ value) {
        super.delete(value);
    }

//    public Integer indexOf(_ value) {
//        return indexOfElement(value);
//    }

    @Override
    public Integer indexOf(_ value) {
        return super.indexOf(value);
    }
}

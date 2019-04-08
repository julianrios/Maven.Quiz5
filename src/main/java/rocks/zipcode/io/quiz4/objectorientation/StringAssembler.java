package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimiter;


    public StringAssembler(Character delimiter) {
        this.delimiter = delimiter;
    }

    public StringAssembler append(String str) {
        return new StringAssembler(delimiter);
    }

    public String assemble() {
        return null;
    }
}

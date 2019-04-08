package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimiter;
    private String str;

    public StringAssembler(Character delimiter) {
        this.delimiter = delimiter;
    }

    public StringAssembler append(String str) {
        StringAssembler stringAssembler = new StringAssembler(delimiter);

        return stringAssembler;
    }

    public String assemble() {
        System.out.println(delimiter);
        System.out.println(str);
        return String.join(delimiter + "", str);
    }
}

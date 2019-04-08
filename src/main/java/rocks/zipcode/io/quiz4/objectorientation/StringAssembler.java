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
        char[] array = str.toCharArray();
        StringAssembler stringAssembler = new StringAssembler(array[0]);

        for (int i = 0; i < array.length; i++) {
            new StringAssembler(array[i]);

        }
        return new StringAssembler(delimiter);
    }

    public String assemble() {
        return null;
    }
}

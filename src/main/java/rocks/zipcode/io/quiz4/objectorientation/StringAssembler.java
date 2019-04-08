package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimiter;
    private StringBuilder sb;

    public StringAssembler(Character delimiter) {
        this.delimiter = delimiter;
        this.sb = new StringBuilder();
    }

    public StringAssembler append(String str) {
        sb.append(str);
        sb.append(delimiter);
        return this;
    }

    public String assemble() {
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}

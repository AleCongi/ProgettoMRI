package di.uniba.it.mri2122.lucene.cran.ex3;

import com.uwyn.jhighlight.fastutil.chars.CharComparator;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.CharTokenizer;


import java.io.IOException;
import java.util.StringTokenizer;

public class CustomTokenizer extends Tokenizer {

    @Override
    public boolean incrementToken() throws IOException {
        return false;
    }


 /*
    @Override
    protected boolean isTokenChar(int i) {

        return !Character.isWhitespace(i) && !(i == '-') && !(i == '.') &&
                !(i == ',') && !(i == ':')&&
                !(i == '$') && !(i == '/') &&
                !(i == '(') && !(i == ')');

    }
*/
}

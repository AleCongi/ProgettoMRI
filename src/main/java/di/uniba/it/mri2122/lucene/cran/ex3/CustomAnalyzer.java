package di.uniba.it.mri2122.lucene.cran.ex3;

import org.apache.cxf.io.ReaderInputStream;
import org.apache.lucene.analysis.*;

import org.apache.lucene.analysis.core.FlattenGraphFilterFactory;
import org.apache.lucene.analysis.core.LetterTokenizer;
import org.apache.lucene.analysis.en.KStemFilter;
import org.apache.lucene.analysis.synonym.*;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.fst.FST;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;




public class CustomAnalyzer extends StopwordAnalyzerBase
 {
        @Override
        protected TokenStreamComponents createComponents(String fieldName) {
            Path wordnet = Paths.get("D:\\Repository\\MRI_2021_22\\src\\main\\java\\di\\uniba\\it\\mri2122\\lucene\\cran\\ex3\\wn_s.pl");


            Tokenizer src = new LetterTokenizer();

            TokenStream result = new LowerCaseFilter(src);
            try {
                result = new StopFilter(result, loadStopwordSet(new FileReader((".\\.\\.\\.\\.\\.\\.\\.\\resources\\cran\\stopwords.txt"))));
            } catch (IOException e) {
                e.printStackTrace();
            }
            result = new KStemFilter(result);
            return new TokenStreamComponents(src, result);
        }

}



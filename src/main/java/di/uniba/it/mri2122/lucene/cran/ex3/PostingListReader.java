package di.uniba.it.mri2122.lucene.cran.ex3;

import org.apache.lucene.index.*;
import org.apache.lucene.search.DocIdSetIterator;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class PostingListReader {


    public static void main(String[] args) throws IOException {
        final String INDEX_DIRECTORY = "D:\\Repository\\MRI_2021_22\\resources\\cran\\index";
        Directory index;
        index = FSDirectory.open(Paths.get(INDEX_DIRECTORY));
        IndexReader indexReader = DirectoryReader.open(index);
        int doc = 1;

        while (doc < 1400) {
            Terms termVector = indexReader.getTermVector(doc, "text");
            TermsEnum termIter = termVector.iterator();
            while (termIter.next() != null) {
                PostingsEnum postingsEnum = termIter.postings(null, PostingsEnum.ALL);
                while (postingsEnum.nextDoc() != DocIdSetIterator.NO_MORE_DOCS) {
                    int freq = postingsEnum.freq();
                    System.out.printf("term: %s, freq: %d,", termIter.term().utf8ToString(), freq);
                    while (freq > 0) {
                        System.out.printf(" nextPosition: %d,", postingsEnum.nextPosition());
                        System.out.printf(" startOffset: %d, endOffset: %d",
                                postingsEnum.startOffset(), postingsEnum.endOffset());
                        freq--;
                    }
                    System.out.println();
                }
            }
            doc++;
        }

    }

}



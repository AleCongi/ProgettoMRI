# ProgettoMRI
##Congedo Alessandro 677315, Villano Giorgia 676577

Per l'esercizio numero 3 del laboratorio numero 1 sulla collezione Cranfield, si è partiti
dalla repository del professor Pierpaolo Basile.

È stato utilizzato un [analizzatore customizzato](./src/main/java/di/uniba/it/mri2122/lucene/cran/ex3/CustomAnalyzer.java):
- Tokenizzatore: "LetterTokenizer"
- Filtro 1: "LowerCaseFilter"
- Filtro 2: "StopFilter"
- FIltro 3: "KStemFilter"

Sono stati concepiti anche degli strumenti per la lettura e l'interpretazione dell'indice, al fine di
sfruttare i dati ottenuti per determinare i pesi di alcuni token:
- [PostingListReader](./src/main/java/di/uniba/it/mri2122/lucene/cran/ex3/PostingListReader.java)
- [DocumentFrequencyScanner](./src/main/java/di/uniba/it/mri2122/lucene/cran/ex3/DocumentFrequencyScanner.java)

La valutazione del sistema di ritrovamento è stata eseguita per mezzo dello strumento "trec_eval" con tale [risultato](./resources/trec_eval/result.txt).


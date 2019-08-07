import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        Map<String ,String > transcribtion = new HashMap<>();
        transcribtion.put("G","C");
        transcribtion.put("C","G");
        transcribtion.put("T","A");
        transcribtion.put("A","U");
        String rnaStrand = "";
        for(int i=0;i<dnaStrand.length();i++)
            rnaStrand += transcribtion.get(Character.toString(dnaStrand.charAt(i)));
        return rnaStrand;
    }

}

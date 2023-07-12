package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App{
    public static String toString(Map map) {
        Map<String, Integer> newMap = new MapStrInt();
        newMap.putAll(map);
        return newMap.toString();
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.putAll(App.getWordCount("Java Java I am programmer"));
        System.out.println(App.toString(map));
    }
    public static Map getWordCount(String sentence){
        Map<String, Integer> wordsAndTheirFreq = new MapStrInt();
        if(sentence == null || sentence == ""){
            return wordsAndTheirFreq;
        }
        String[] words = sentence.split(" ");
        String isCreate = "";
        for (String word: words) {
            if(wordsAndTheirFreq.containsKey(word)) {
                wordsAndTheirFreq.replace(word, wordsAndTheirFreq.get(word), wordsAndTheirFreq.get(word) + 1);
            }
            else {
                wordsAndTheirFreq.put(word, 1);
            }
        }
        return wordsAndTheirFreq;
    }
}
//END

package chp12;

import java.util.HashMap;
import java.util.Map;

/*
Based on the two sets of given test scores, update student grades only if the
second test score is higher then the first. Then print final grades
* */
public class PrintGrades {
    public static void main(String[] args) {
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map <String, Integer> makeUpGrades = TestResults.getMakeUpGrades();
        Map <String, Integer> finalGrades = new HashMap();


        for(var entry:originalGrades.entrySet()){
            String key = entry.getKey();//String key
            if(entry.getValue() < makeUpGrades.get(key)){
                finalGrades.put(key,makeUpGrades.get(key));
            }else{
                finalGrades.put(key, entry.getValue());
            }
        }

        finalGrades.forEach((key, value) -> System.out.println(key + " grade is " + value));
    }
}

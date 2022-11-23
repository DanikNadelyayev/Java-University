package task7;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static task7.FindExtra.findWords;

class FindExtraTest {
    String input;
    String text;
    @Before
    public void SetUp(){
        input = "Print this bus";
        text = "dsdsad dasd bus. fdsfd WARdsasd dsaad. dfsfsd fewreew fsdfsdhfj ccvs. fsdsf 121";
    }
    @Test
    public void FindWordsTest(){
        ArrayList<String> s = findWords(input, text);
        for (String p: s){
            System.out.println(p);
        }
    }
}
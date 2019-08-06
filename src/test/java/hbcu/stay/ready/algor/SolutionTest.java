package hbcu.stay.ready.algor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void countUniqueWordsTest1(){
        String input = "Hello Java. Hello World. Hello Java!";
        String expected =   "The 3 unique words are:\n" +
                            "Java (Seen 2)\n" +
                            "Hello (Seen 3)\n" +
                            "World (Seen 1)";
        String actual = solution.countUniqueWords(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countUniqueWordsTest2(){
        String input = "that that is is that that is not is not is that it it is wutang";
        String expected =   "The 5 unique words are:\n" +
                            "that (Seen 5)\n" +
                            "not (Seen 2)\n" +
                            "wutang (Seen 1)\n" +
                            "is (Seen 6)\n"+
                            "it (Seen 2)";
        String actual = solution.countUniqueWords(input);
        Assert.assertEquals(expected, actual);
    }
}

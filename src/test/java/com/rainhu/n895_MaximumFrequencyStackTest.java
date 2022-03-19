package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n895_MaximumFrequencyStackTest {
    n895_MaximumFrequencyStack st; 
    List<Integer> expected, actual;

    public void execute(String[] s, Integer[] num, List<Integer> list){
        for (int i = 0; i < s.length; i++){
            if (s[i].equals("FreqStack")){
                st = new n895_MaximumFrequencyStack();
                list.add(null);
            } else if (s[i].equals("push")){
                st.push(num[i]);
                list.add(null);
            } else if (s[i].equals("pop")){
                list.add(st.pop());
            }
        }
    }

    @Test
    public void test(){
        String[] inputs = new String[]{"FreqStack", "push", "push", "push", "push", "push", "push", "pop", "pop", "pop", "pop"};
        Integer[] nums = new Integer[]{null, 5, 7, 5, 7, 4, 5, null, null, null, null};
        expected = Arrays.asList(null, null, null, null, null, null, null, 5, 7, 5, 4);
        actual = new ArrayList<>();
        execute(inputs, nums, actual);
        assertEquals(expected, actual);
    }
}

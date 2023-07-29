package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        Function <Integer,Integer> func= new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer o) {
                return o*2;
            }
        };

        List<Integer> data2= Arrays.asList(4,9,5,7);
        data2.stream().map(func).forEach(n->System.out.println(n));
        System.out.println("--------");
        List<Integer> data= Arrays.asList(6,9,5,1);
        data.stream().map(n->n*2).forEach(n->System.out.println(n));

    }
}

package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> num = Arrays.asList(3,87,9);
        Stream<Integer> data= num.stream();
         Stream <Integer> data2=data.map(n->n*2);

        data2.forEach(n->System.out.println(n));


    }
}

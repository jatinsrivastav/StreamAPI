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
        List<Integer> data= Arrays.asList(6,9,5,1);
        data.stream().map(n->n*2).forEach(n->System.out.println(n));

    }
}

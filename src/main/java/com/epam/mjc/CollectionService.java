package com.epam.mjc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
    	List<Integer> listEven = list.stream().filter(x -> x%2==0).toList();
		return listEven;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
    	List<String> listUpperCase = list.stream().map(x -> x.toUpperCase()).toList();
		return listUpperCase;
    }

    public Optional<Integer> findMax(List<Integer> list) {
    	
    	Optional<Integer> listFindMax = list.stream().max(Comparator.naturalOrder());
		return listFindMax;
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
    	Optional<Integer> listFindMin = list.stream().flatMap(y -> y.stream()).min(Comparator.naturalOrder());
    	return listFindMin;
    }

    public Integer sum(List<Integer> list) {
    	Integer sum1 = list.stream().mapToInt(x -> x).sum();
    	//Integer sum = list.stream().mapToInt(Integer::intValue).sum();
    	// IntStream summaInteger = list.stream().mapToInt(x -> x+x);
		return sum1;
    }
}

package com.logics.javaconcepts;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker w1 = new Worker(101,"ajay","HR");
		Worker w2 = new Worker(101,"ajay","QA");
		
		Map<Worker,Worker> map = new HashMap();
		map.put(w1, w1);
		map.put(w2, w2);
		System.out.println(map);
	}

}

package kaprekar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kaprekar {
	
	private Integer seed;
	public static final int FIXED_POINT = 6174;
	
	Kaprekar(int _seed) {
		seed = new Integer(_seed);
	}
	
	public void show() {
		Integer asc = new Integer(this.seed);
		Integer desc = new Integer(asc);
		Integer result = new Integer(0);
		char[] ascending;
		char[] descending;
		
		System.out.println("kaprekar: " + seed.toString());
		
		while (result != FIXED_POINT) {
			ascending = desc.toString().toCharArray();
			descending = new char[ascending.length];
			Arrays.sort(ascending);
			for(int i = ascending.length - 1, j = 0; i >= 0; i--, j++) {
				descending [j] = ascending[i];
			}
			asc = Integer.parseInt(new String(ascending));
			desc = Integer.parseInt(new String(descending));
			result = desc - asc;
			System.out.println(new String(descending) + " - " + new String(ascending) + " = " + result);
			desc = result;
		}
	}

}

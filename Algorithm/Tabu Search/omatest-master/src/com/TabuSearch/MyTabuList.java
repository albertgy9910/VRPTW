package com.TabuSearch;

import org.coinor.opents.*;

@SuppressWarnings("serial")
public class MyTabuList extends ComplexTabuList{
	
	public MyTabuList ( int tenure, int[] attrDim ) {
		super(tenure, attrDim);  // super 指向父类的引用
	}

}

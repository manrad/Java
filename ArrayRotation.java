/*
 Array Rotation in O(1) time based on modulo
*/

import java.util.*;

class ArrayRotation{


	public static void main(String[] args){
	
	// scan number of rotations 2  
	// scan arraysize
	// scan array provided as  line with space -- input A[] 5,6,7,2,3,9,10,1
	// expected output =  7,2,3,9,10,1,5,6
	
		Scanner ins = new Scanner(System.in);
		int rotation = ins.nextInt();
		
		int arraySize = ins.nextInt();
		
		if (rotation > arraySize){
			rotation = rotation%arraySize;
		}

		ArrayList<Integer> arl = new ArrayList<Integer>(arraySize);
		for(int po=0; po < arraySize;po++){
			arl.add(po,(Integer)ins.nextInt());
		}
		
		int[] ta = new int[rotation];
		for(int inx = 0; inx < rotation; inx++){
			// copy from arraysize to ta
			ta[inx] = arl.get(inx);
		}

		for(int ix = 0; ix < rotation; ix++){
			arl.remove(0);
		}
		for(int inx=0; inx < rotation;inx++){
			arl.add(ta[inx]);
		}
		for(int ix = 0; ix < arl.size(); ix++){
			System.out.print(arl.get(ix) + " ");
		}	
		
	}

}
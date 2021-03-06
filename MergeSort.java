
public class MergeSort {

    public int[] merge( int[] a, int[] b ) 
    {
	int[] retarr = new int[a.length+b.length];
	int acount = 0;
	int bcount = 0;
	int i=0;
	
	while(acount < a.length && bcount < b.length){
	    
	    if(a[acount] <= b[bcount]){
		retarr[i]=a[acount];
		acount+=1;
		i+=1;
	    }
	    else{
		retarr[i] = b[bcount];
		bcount+=1;
		i+=1;
	    }
	}
	if(acount < a.length ){
	    for(int x = acount; x < a.length ; x++){
		retarr[i] = a[x];
		i++;
	    }
	}else
        if(bcount < b.length ){
	    for(int x = bcount; x < b.length ; x++){
		retarr[i] = b[x];
		i++;
	    }
	}
	return retarr;
	      
	
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public int[] sort( int[] arr ) 
    {
	
	
	if(arr.length > 1){
	    int pos = arr.length/2;
	    int[] a2 = new int[pos];
	    int[] b2 = new int[arr.length - pos];
	    for(int x = 0; x < pos; x++){
		a2[x]=arr[x];
	    }
	    for(int x = 0; x <arr.length-pos;x++){
		b2[x] = arr[x+pos];
	    }
	    
	    return merge(sort(a2),sort(b2));
	}
	return arr; 
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    // public static void mess( int[] a ) {
    //	for( int i = 0 ; i<a.length; i++ )
    //	    a[i] = 0;
    //  }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    /*
    public static void main( String [] args ) {


	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	//	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
        */
    //   }//end main()

}//end class MergeSort


/*======================================
Eric L
Herman L
Max K



APCS2 pd3
HW#07: What Does the Data Say?  
2017-02-14 


  class MergeSortTester

  ALGORITHM:

  Generate random array/arraylist
  Take time
  Sort
  Take the time it takes
  Repeat
  Average out

  BIG-OH CLASSIFICATION OF ALGORITHM:
  
  n log (n)
	
  ANALYSIS:
  time m = time for MergeSort
  time b = time for BubbleSort
  Batch size: 1,000,000
  n=100 
  Eric L's device	   
  Trial 1: 

  time m: 12027.38515
  time b: 72132.655808

  Trial 2:

  time m: 12018.415917
  time b: 79399.057584


  Batch size: 100
  n=10,000
  Eric L's device
  Trial 1:

  time m: 2342149.93
  time b: 4.8348751365E8

  Trial 2:

  time m: 1881104.61
  time b: 4.1562852499E8


  Do the math assuming BubbleSearch is n^2 and as n grows, Merge becomes closer to n log (n)

  ======================================*/

import java.util.ArrayList;


public class MergeSortTester 
{
    public double totaltime=0;
    public double times=1;
    public double avg=0;


    public double totaltime2=0;
 
    public double avg2=0;
    
    public MergeSortTester(){
	run();
	while (times < 100){
	    run();
	    times++;
	}
	avg=totaltime/times;
	avg2=totaltime2/times;
	
	System.out.println(avg+" avg\n\n"+avg2);
	
    }

    public void run(){
	int [] a = generate();
	long time = (System.nanoTime());
	//		System.out.println(time+" before");
	int [] b = sort (a);
	time=(System.nanoTime()-time);
	//		System.out.println(time+" after");	
       	totaltime+=(double)time;

	///-----------------------------------------------

	ArrayList<Comparable> x  = gen();
	
	time = (System.nanoTime());
	
        x  = bubbleSort(x);
	
	time=(System.nanoTime()-time);
	
       	totaltime2+=(double)time;	
	
    }

    public int[] generate(){
	int[] ret = new int[10000];
	
	for (int i = 0; i < ret.length; i++){
	    ret[i] = (int)(Math.random()*100);
	}
	return ret;
    }


    public ArrayList<Comparable> gen(){
	ArrayList<Comparable> ret = new ArrayList<Comparable>();
	for (int i = 0; i < 10000; i++){
	    ret.add((int)(Math.random()*100));
	}
	return ret;	
    }
    


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
	      	
    }
    
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


    public ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ) 
    {
	//declare and initialize empty ArrayList for copying
        ArrayList<Comparable> data = new ArrayList<Comparable>();

        //copy input ArrayList into working ArrayList
        for( Comparable o : input )
            data.add( o );

        //sort working ArrayList
        bubbleSortV( data );

        return data;
    }

    public void bubbleSortV( ArrayList<Comparable> data ) 
    {
	for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {

            //iterate thru first to next-to-last element, comparing to next
            for( int i = 0; i < data.size()-1; i++ ) {

                //if element at i > element at i+1, swap
                if ( data.get(i).compareTo(data.get(i+1) ) > 0 ) 
                    data.set( i, data.set(i+1,data.get(i)) );   
                
		//      System.out.println(data); //diag: show current state of list
            }
        }
    }    
    public static void main( String[] args ) 
    {
	MergeSortTester a = new MergeSortTester();

    }//end main

}//end class

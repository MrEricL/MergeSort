# MergeSort

## Data
https://docs.google.com/spreadsheets/d/1Kmmko8aiQgMjntf6ujl419Go6C944NH6TJcaiy2oTl0/edit#gid=0
## Methodology of research
In order to find the Big-Oh of mergesort, we decided to use the time it takes for bubblesort to sort a data set. In class, we we able to show how bubblesort runs in n^2 time, so we used its time in correlation with the time of mergesort. 
We would run bubblesort and mergesort on the same set of data, essentially getting estimates (a computer could spit out different results from another) on the time it takes for each sort to run.
To find the time it takes for the sorting methods to run, we would take the time before and after each sorting method is run (e.g bubblesort) in nanoseconds. Then we would subtract those two times. 
This difference gives us how long it takes for the array to be sorted through each sort. 

We then compared the times we got from bubblesort and mergesort. Because we know bubblesort runs in n^2 time, we got the sqrt of the time we got in order to get n.
To incorporate n, we used a base equation of nlogn and found that the time that we got from mergesort was around 10 times greater than the value achieved from nlogn.
As a result, our method for mergesort ended up having a runtime of around 10nlogn, which can be simplified to a runtime of nlogn in terms of Big-Oh.


*Exemplis Gratis
For a data set of 100 run 1,000,000 times
bubble sort: 72132.7 ns  
n^2 = 72132.7, n = 268.6   
merge sort: 12027.4 ns   
nlogn = 652.5, 12027.4 / 652.5 = 18.4
mergesort (for this example) ~~> 18.4nlogn
which can be simplified to nlogn   

This is applied for larger and larger data sets in order to find out what merge sort on average would run as.		
(See more data sets in the spreadsheet)

## Conclusion

In conclusion, we determined that mergesort runs in O(nlog(n)) time.

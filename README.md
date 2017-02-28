# MergeSort

## Data
https://docs.google.com/spreadsheets/d/1Kmmko8aiQgMjntf6ujl419Go6C944NH6TJcaiy2oTl0/pubhtml
## Methodology of research
To time our sorts, we would take the time right before each sort and right after each sort in nanoseconds. Then we would subtract those 2. 
This number would be how long it took for the array to be sorted. However, we would run n sized array a large amount of times. 
If you look at the data, the batch size represents the number of times we randomized the size n array and sorted it using both methods. The displayed time for the trial is an average of all the times.

Merge sort was run alongside with bubblesort. Assuming that the bubblesort code is correct, and that it runs in n^2 time, we can then safely assume that there is correlation with the time of mergesort. Once understanding what n would roughly mean (ideally this refers to the data size, but it will vary due to computer differences), we can attempt to solve for the run time of merge sort. 

*For Example
bubble sort: 100 ns
n^2=100, thus n=10
merge sort: 50 ns
5n=50, thus it seems that merge sort seems to be running almost linearly (x*n)

This is applied for larger and larger data sets in order to find out what merge sort on average would run as. 

## Conclusion

In conclusion, assuming that the average efficiency of bubble sort is O(n^2), Mergesort is something around O(10nlog(n)), which rounds to O(nlog(n)). This is provided with a 10,000 length dataset of random numbers run 10,000 times and averaged. 

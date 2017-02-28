# MergeSort

## Data
https://docs.google.com/spreadsheets/d/1Kmmko8aiQgMjntf6ujl419Go6C944NH6TJcaiy2oTl0/pubhtml
## Methodology of research
To time our sorts, we would take the time right before each sort and right after each sort in nanoseconds. Then we would subtract those 2. 
This number would be how long it took for the array to be sorted. However, we would run n sized array a large amount of times. 
If you look at the data, the batch size represents the number of times we randomized the size n array and sorted it using both methods. The 
displayed time for the trial is an average of all the times.

## Conclusion

In conclusion, Assuming that the average efficiency of bubble sort is O(n^2), Mergesort is something around O(10nlog(n)), which rounds to O(nlog(n)).

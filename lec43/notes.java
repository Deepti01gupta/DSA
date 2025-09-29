package lec43;

public class notes {

}


// Queue : follow first in first out (FIFO)
// heap : it is a CBT(complete binary tree) 
// heap main ham sirf top k data ko acsess kr skte hai.

// CBT: if length of tree is l, then l-1 level should be completely filled
// and l level should be from left to right.

// in min heap parent value must be smaller than both of its child value for each node. parent value is minimum value of the tree.
// in max heap parent value must be greater than both of its child value for each node. parent value is maximum value of the tree.

// 									sorted array	unsorted array	heap
// ADD 								O(N)			O(1)			log(N)
// MINIMUM ELEMENT REMOVE			O(N)			O(N)			log(N)
// GET MINIMUM ELEMENT				O(1)			O(N)			O(1)


// UPHEAPIFY : process to make heap

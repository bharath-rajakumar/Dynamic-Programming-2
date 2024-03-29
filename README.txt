A vendor has a balance (scales) and a number of different weights (stones).
He wants to know how many different weights he can measure with his stones. 
For example, if his stones weigh 100, 100, and 250 grams respectively, then
he can measure the following quantities using his balance:
50, 100, 150, 200, 250, 350, 450 grams.  Here, he measures 150 grams
by placing the 250 gram stone on one side and a 100 gram stone on the
other side.  The problem is to find out the number of distinct weights
that can be measured with a given set of stones.

Input:
The first line of input has N, the number of stones.
The next line contains N integers, giving the weights of the stones.
The weights are not ordered, and it is possible that there are
multiple stones with the same weight.
A batch has several inputs, and N=0 signals the end of the input.
Assume that N is at most 100, and the weights are multiples of 50,
and no weight is more than 2000.

Output:
For each input ptoblem, the output has just one integer, the number of
different weights that can be measured with the stones.

Sample input:
3
100 100 250
4
100 1000 200 100
0

Output for sample input:
7
13
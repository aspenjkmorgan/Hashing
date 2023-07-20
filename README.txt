/******************************************************************************
 *  Name: Aspen Morgan
 *
 ******************************************************************************/

Programming Assignment: Hash Probing

/******************************************************************************
 *  Discuss the extent to which your results validate Proposition M
 *  (α = 1/2).
 *****************************************************************************/
Results:
    Average probes for a miss with N=1000 is: 2.443
    Average probes for a miss with N=10000 is: 2.5113
    Average probes for a miss with N=100000 is: 2.5291
    Average probes for a miss with N=1000000 is: 2.4521

Proposition M for α = 1/2 is 2.5. The results are consistent with the formula
and are quite close.
/******************************************************************************
 *  Change the size of the hash table array so that it is M = 1.5N, instead of 2N
 *  (α = 2/3).
 *  Discuss the extent to which your results validate Proposition M.
 *****************************************************************************/
Results:
Average probes for a miss with N=1000 is: 4.2193
Average probes for a miss with N=10000 is: 4.8102
Average probes for a miss with N=100000 is: 4.9354
Average probes for a miss with N=1000000 is: 5.0347

Proposition M for α = 2/3 is 5. The results are consistent with the formula but
a little less aligned than for α = 1/2.

/******************************************************************************
 *  Change the size of the hash table array so that it is M = 1.25N instead of 2N
 *  (α = 4/5).
 *  Discuss the extent to which your results validate Proposition M.
 *****************************************************************************/
Results:
Average probes for a miss with N=1000 is: 14.3465
Average probes for a miss with N=10000 is: 13.5106
Average probes for a miss with N=100000 is: 12.9729
Average probes for a miss with N=1000000 is: 13.1274

Proposition M for α = 4/5 is 13. The results are pretty consistent with the formula.
According to the textbook, the formula looses some precision for α > 1/2, so
it makes sense that the results are less closely alligned for α = 4/5 than
for α = 2/3 or especially α = 1/2.

/******************************************************************************
 *  Known bugs / limitations.
 *****************************************************************************/

No known bugs or limitations.

/******************************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings or lectures, but do include
 *  any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 *
 *  Also include any resources (including the web) that you may
 *  may have used in creating your design.
 *****************************************************************************/

I confirmed expected outputs with Jayce Holdsambeck. 

/******************************************************************************
 *  Describe any serious problems you encountered.
 *****************************************************************************/

No serious problems. (yay)

/******************************************************************************
 *  List any other comments here. Feel free to provide any feedback
 *  on how much you learned from doing the assignment, and whether
 *  you enjoyed doing it.
 *****************************************************************************/


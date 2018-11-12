// There are tons of such situations where we are required to have all the permutations of a string, ordered in a specific manner
// or something that might tell us to get the lexicographically largest/smallest string from a given string.

// There are tons of approaches people follow but the most common one, always finds its complexity as O(n^2), but here is the
// algorithm based on Lehmer Code and Fischer-Yates shuffle, which does the deed in O(n log n)

// Pseudocode for the algorithm

for i from n downto 2
   do   di ← random element of { 0, ..., i − 1 }
        swap a[di] and a[i − 1]

// This can be combined with the initialization of the array a[i] = i as follows        
        
for i from 0 to n−1
   do   di+1 ← random element of { 0, ..., i }
        a[i] ← a[di+1]
        a[di+1] ← i        

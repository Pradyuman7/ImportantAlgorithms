// Many times we are in state of finding some number is perfect square or not and you don't want O(n) but O(1)
// The best solution for this would be based on the simple algorithm that perfect squares have Intgers as square roots
// This seems like a very naive point, but it is too effective to ignore :)

//Code in java

boolean tellPerfectSquare(int n){
    
    long long y = sqrt(n);
    if (y*y == n) 
        return true;
    
    return false;
}

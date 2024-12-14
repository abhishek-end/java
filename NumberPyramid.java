class NumberPyramid { 
    public static void main(String args []) { 
        int row = 6 ;
        // int col = 5 ; 
        // outer loop  start ---> print row  
        for(int i = 1 ; i <= row ; i++ ){ 
                // inner loop start ---> print col 
                   for(int j=1 ; j <= i  ; j++) { 
                     System.out.print(j + " ");
                   }
                   System.out.println("");
        }
    }
}
class InvertedPyramidWithNumber { 
    public static void main(String args[]) { 
        // outer loop  ---> print row 
        int n = 5 ;
        for(int i=0; i<= n ; i++){ 
            for(int j = 1 ; j<= n - i ; j++ )
            { 
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}

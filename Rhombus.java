class Rhombus { 
    public static void main (String args [] ) { 
        int n = 5 ;
        // outer  for prints rows
        for(int i=1; i<=n; i++ ){ 
            // print spaces
            int spaces = n - i  ;
           for(int j=1; j<=spaces; j++ ){ 
             System.out.print("  ");
           }
           //then print stars
           for(int j=1; j<= n ; j++ ){ 
             System.out.print('*');
           }
             System.out.println();
           
        }
    }
}
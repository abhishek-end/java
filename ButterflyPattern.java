class ButterflyPattern { 
    public static void main(String args []) { 
        int n = 4 ; 
                    // outer loop of --->  row
        for(int i = 1 ; i <= n ; i++ ) { 
                    // inner part for print start
            for(int j = 1 ; j <= i  ; j++ ) { 
                    System.out.print(j + " ");
            }
                    // print space 
                    int spaces = 2 * ( n - i ) ; 
                    for(int j = 1 ; j <=spaces ; j++ ) { 
                        System.out.print("  ");
                    }
                     //right side pattern 

                    for(int j = 1 ; j <= i  ; j++ ) { 
                        System.out.print(j + " "); 
                    }

                       System.out.println("");
        }

        // lower half !!!

         for(int i = n ; i >=  1 ; i-- ) { 
                    // inner part for print start
            for(int j = 1 ; j <= i  ; j++ ) { 
                    System.out.print(j + " ");
            }
                    // print space 
                    int spaces = 2 * ( n - i ) ; 
                    for(int j = 1 ; j <=spaces ; j++ ) { 
                        System.out.print("  ");
                    }
                     //right side pattern 

                    for(int j = 1 ; j <= i  ; j++ ) { 
                        System.out.print(j + " "); 
                    }

                       System.out.println("");
        }

    }
}
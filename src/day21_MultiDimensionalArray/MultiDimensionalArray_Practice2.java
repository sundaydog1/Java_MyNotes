package day21_MultiDimensionalArray;

public class MultiDimensionalArray_Practice2 {

    public static void main(String[] args) {
     int [][][] arr301={ {{1,2},{3, 4, 5}},{ {6,7,8,9}, {10,11},{12,13,14}} }; 
     int [][][] arr302={ {{1,2},{3, 4, 5}},{ {6,7,8,9}, {10,11},{12,13,14}} };
     int [][][] arr303={ {{1,2},{3, 4, 5}},{ {6,7,8,9}, {10,11},{12,13,14}} };
     
        
        
        
        int [][][][] arr4D={arr301,arr302,arr303};

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);
                    }
                }
            }
        }
            
    
    
    
    }
        
        
        
        
    }
    
    
    
    


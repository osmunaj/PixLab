public class Actvity4 {
    public static void main(String[] args){
        int[][] matrix = {
                {5, 5, 10},
                {14, 19, 10},
                {9, 8, 5}

        };



        
    }

    public int getCount(int target){
        int count = 0;
        int current = 0;
        for (int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                current = matrix[row][col];
                if (current == target){
                    count++;
                }
            }
        }
        return count;
    }

    public int getLargest(){
        int largest = Integer.MIN_VALUE;
            for (int row =0; row < matrix.length; row++){
                for (int col = 0; col < matrix[0].length; col++){
                    if (matrix[row][col] > largest){
                        largest = matrix[row][col];
                    }
                }
            }
        return largest;
    }
}

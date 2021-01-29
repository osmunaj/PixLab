public class Activity4E1 {
    public static void main(String[] args){
        getCount
        
    }
    public int getCount(int target)
        {
        int count = 0;
        int current = 0;
        for (int row = 0; row < matrix.length; row++)
        {
        for(int col = 0; col < matrix[0].length; col++)
        {
        current = matrix[row][col];
        if (current == target)
        {
        count++;
        }
        }
        }
        return count;
        }
}
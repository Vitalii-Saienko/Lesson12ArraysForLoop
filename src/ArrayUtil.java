 class ArrayUtil {
    public int [] createArray(int length){
        int [] myArray = new int[length];
        return myArray;
    }
     public void fillArrayWithRandomNumbers(int[] array){
         for (int i = 0; i < array.length; i++) {
             array[i] = (int) (Math.random()*100+1);
         }
     }
     public void printArrayToConsole(int[] array){
         for (int i = 0; i < array.length; i++) {
             System.out.print(array[i]+" ");
         }
     }
     public int findMaxNumber(int[] array){
        int max = array[0];
         for (int i = 0; i < array.length; i++) {
             if (max<array[i]){
                 max = array[i];
             }
         }
        return max;
     }
     public int findMinNumber(int[] array){
        int min = array[0];
         for (int i = 0; i < array.length; i++) {
             if (min>array[i]){
                 min = array[i];
             }
         }
        return min;
     }
}

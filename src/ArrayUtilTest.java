class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        checkArrayCreation();
        checkMaxNumber();
        checkMinNumber();
    }
    public static void checkArrayCreation(){
        ArrayUtil arrayUtil = new ArrayUtil();
        if (arrayUtil.createArray(25).length == 25){
            System.out.println("Test arrayCreate succeed");
        }
        else {
            System.out.println("Error in arrayCreate");
        }
    }
    public static void checkMaxNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {0, 100, 2, 3, 5};
        if (arrayUtil.findMaxNumber(array)== 100){
            System.out.println("Test findMax succeed");
        }
        else {
            System.out.println("Error in findMax");
        }
    }
    public static void checkMinNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {10, 100, 2, 3, 5};
        if (arrayUtil.findMinNumber(array)==2){
            System.out.println("Test findMin succeed");
        }
        else {
            System.out.println("Error in findMin");
        }
    }
}

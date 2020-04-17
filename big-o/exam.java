class BigO{
    /**
     * 
     * @param array
     * O(N) 배열을 두 번 읽든 한 번 읽든 big-O 시간 측정에는 영향을 주지 않음 
     */
    static void exam1(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + "," + product);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        exam1(a);
    }
}
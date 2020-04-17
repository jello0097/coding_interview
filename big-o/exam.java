class BigO{
    /**
     * 
     * @param array
     * O(N) 
     * 배열을 두 번 읽든 한 번 읽든 big-O 시간 측정에는 영향을 주지 않음 
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
        System.out.println("o(N): "+sum + "," + product);
    }
    /**
     * 
     * @param array
     * O(N^2) 
     * 안쪽 for 문의 반복 횟수는 O(N)이고 이 루프가 다시 N번 반복되므로 총 N^2 시간만큼 걸림 
     */
    static void exam2(int[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=0;j<array.length;j++){
                System.out.println("o(N^2) - ver1: "+array[i]+","+array[j]);
            }
        }
    }
    /**
     * 
     * @param array
     * O(N^2) 
     * 안쪽 for문의 시작이 i+1 부터 시작 함 
     * 상위 for문은 O(N) 
     * 안쪽 for문은 (N-1)+(N-2)+(N-3)+...+2+1 반복횟수가 줄어듬 -> 1+2+3...+(N-1) 합과 같음 
     * N(N-1)/2 = (N^2 - N)/ 2 상수는 다 무시되므로 N^2 와 같음   
     */
    static void exam3(int[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=i+1;j<array.length;j++){
                System.out.println("o(N^2) - ver2: "+array[i]+","+array[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        //exam1(a);
        //exam2(a);
        exam3(a);
    }
}
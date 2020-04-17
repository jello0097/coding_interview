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
    /**
     * 
     * @param aArr
     * @param bArr
     * O(ab) 두 루프의 array.length가 각각 다름
     * 밖 for문이 한 번 반복할때 마다 안쪽 for문의 b(bArr.length 회) 반복하므로 두 배열의 크기를 고려하여 ab 시간걸림 
     */
    static void exam4(int[] aArr, int[] bArr){
        for(int i=0; i<aArr.length;i++){
            for(int j=0;j<bArr.length;j++){
                if(aArr[i] < bArr[j]){ // if문은 상수 시간에 수행가능한 단순한 조건문으로 O(1) 시간이라 함 
                    System.out.println("O(ab): "+aArr[i]+","+bArr[j]); 
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 6, 2 };
        exam4(a,b);
        //exam3(a);
        //exam2(a);
        //exam1(a);
    }
}
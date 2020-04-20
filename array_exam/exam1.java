/**
 * 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘 
 */
class Exam1{
    // mine
    static void checkDuplicate(String[] strArr){
        for (int i=0; i<strArr.length; i++) {
            for(int j=i+1; j<strArr.length; j++){
                if(strArr[i] == strArr[j]){
                    System.out.println(strArr[i]);   
                    break;
                }
            }
        }
    }
    public static void main(final String[] args) {
        String[] str = {"ten", "pen", "cake", "dash", "apple", "ten", "apple"};
        checkDuplicate(str);
    }
}
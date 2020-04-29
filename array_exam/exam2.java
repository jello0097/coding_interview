import java.util.Arrays;


/**
 *  문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드 작성 
 *  대소문자 구분, 공백도 하나의 문자로 침 
 */
class Exam2 {
    //mine
    static boolean isPermutation(String[] strArrA, String[] strArrB) {
        // 길이체크 
        if(strArrA.length != strArrB.length)
            return false;
        // 정렬 
        Arrays.sort(strArrA);
        Arrays.sort(strArrB);
        
        if(strArrA != strArrB)
            return false;
        
        return true;
    }

    public static void main(final String[] args) {
        String[] a = { "123", "342", "2333", "book", "MIHEE", "MI" };
        String[] b = { "3323", "PEN", "BOOK", "4687", "MIHEE", "TEST" };
        System.out.println(isPermutation(a,b));
    }    
}

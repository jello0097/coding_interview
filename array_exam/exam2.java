/**
 *  문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드 작성 
 *  대소문자 구분, 공백없음
 */
class Exam2 {
    //mine
    static boolean isPermutation(final String[] strArrA, final String[] strArrB) {
        if(strArrA.length != strArrB.length){
            return false;
        }
        // 순열 관계 체크 --- 알고리즘 추가하기
        return true;
    }

    public static void main(final String[] args) {
        final String[] a = { "123", "342", "2333", "book", "MIHEE", "MI" };
        final String[] b = { "3323", "PEN", "BOOK", "4687", "MIHEE", "TEST" };
        System.out.println(isPermutation(a,b));
    }    
}

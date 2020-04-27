/**
 * 문자열에 들어 있느 모든 공백을 '%20' 으로 바꿔주는 메서드를 작성 
 * java로 구현 시 character array 이용하기 
*/
class Exam3 {
    // mine
    static void urlize(String str, Integer maxStrlength){
        String result;
        result = str.replace(" ", "%20");
        System.out.println("%20 result: "+ result);
    }
    public static void main(String[] args) {
        String str = "Mr John Smith";
        int l= str.length();
        urlize(str, l);
    }
}
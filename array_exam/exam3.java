import jdk.internal.cmm.SystemResourcePressureImpl;

/**
 * 문자열에 들어 있느 모든 공백을 '%20' 으로 바꿔주는 메서드를 작성 
 * java로 구현 시 character array 이용하기 
*/
class Exam3 {
    static int getSpaceCount(final String str) {
        int count = 0;
        for (final char c : str.toCharArray()) {
            if (Character.isWhitespace(c))
                count++;
        }
        return count;
    }

    static void urlize(String str, int trueLength) {
        char[] cArr = str.toCharArray();
        int spaceCount = getSpaceCount(str);
        int index = trueLength + spaceCount * 2;
        char[] resultArr = new char[index];

        // exception 방지용 
        if (trueLength < str.length())
            cArr[trueLength] = '\0';
        // exception 방지용   
        if (trueLength > str.length()) 
            trueLength = str.length();

        for (int i = trueLength - 1; i >= 0; i--) { //배열의 index는 0부터 시작하니까 배일길이-1 부터 0까지 거꾸로 채우기 
            if (cArr[i] == ' ') {
                resultArr[index - 1] = '0';
                resultArr[index - 2] = '2';
                resultArr[index - 3] = '%';
                index = index - 3;
            } else {
                resultArr[index - 1] = cArr[i];
                index--;
            }
        }
        String result = new String(resultArr);
        System.out.println(result);
    }

    public static void main(final String[] args) {
        urlize("Mr John Smith",13);
    }
}
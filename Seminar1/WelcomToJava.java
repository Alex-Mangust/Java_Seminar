// 📌 Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.
public class WelcomToJava {
    public static String lineInvert(String str){
        String oneStr[] = str.split(" ");
        String twoStr[] = new String[oneStr.length];
        int index = 0;
        for (int i = oneStr.length - 1; i >= 0; i--){
            twoStr[index] = oneStr[i];
            index++;
        }
        String str2 = "";
        for (int i = 0; i < twoStr.length;  i++){
            str2 += twoStr[i] + " ";
        }
        return str2;
    }
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        System.out.println(lineInvert(str));
    }
}




// public class Phrase {
//     public static void main(String[] args) {
//         String phrase = "Добро пожаловать на курс по Java";
//         System.out.println(phraseReverse(phrase));

//     }

//     static String phraseReverse(String phrase) {
//         String[] words = phrase.split(" ");
//         String reversePhrase = "";

//         for (int i = words.length - 1; i >= 0; i--) {
//             reversePhrase += words[i] + " ";
//         }
//         return reversePhrase;
//     }
// }
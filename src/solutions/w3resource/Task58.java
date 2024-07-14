package solutions.w3resource;

public class Task58 {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog.";
        String newStr = "";
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            newStr += (strArr[i].substring(0, 1).toUpperCase() +
                    strArr[i].substring(1)) + " ";
        }
        System.out.println(newStr);
    }
}

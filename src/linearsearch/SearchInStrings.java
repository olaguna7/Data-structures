package linearsearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Oscar";
        char target = 'a';
        char target2 = 'l';

        System.out.println(search(name, target));
        System.out.println(search(name, target2));
    }

    public static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }

    // Another solution
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}

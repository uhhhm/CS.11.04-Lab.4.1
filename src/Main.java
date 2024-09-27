public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println(parenthesesCheck("(())(())"));
        System.out.println(reverseInteger(513202));
        System.out.println(encryptThis("test testing very pressing"));
        System.out.println(decipherThis("116tse 116gstine 118yre 112gessinr"));

    }
    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String a){
        int b = 0;
        for(char ch : a.toCharArray()){
            if(ch == '('){
                b++;
            }
            if(ch == ')'){
                b--;
            }
            if(b < 0){
                return false;
            }
        }
        return b == 0;
    }

        // 2. reverseInteger
    public static String reverseInteger(int a){
        int b = 0;
        while(a > 0){
            b = b * 10 + a%10;
            a /= 10;
        }
        return Integer.toString(b);
    }
    public static String encryptThis(String a) {
        StringBuilder d = new StringBuilder();
        String[] b = a.split(" ");
        for (String c : b) {
            if (!c.isEmpty()) {
                StringBuilder e = new StringBuilder();
                e.append((int) c.charAt(0));
                if (c.length() > 2) {
                    e.append(c.charAt(c.length() - 1));
                    e.append(c.substring(2, c.length() - 1));
                    e.append(c.charAt(1));
                } else if (c.length() == 2) {
                    e.append(c.charAt(1));
                }
                d.append(e).append(" ");
            }
        }
        return d.toString().trim();
    }
    public static String decipherThis(String a) {
            StringBuilder ans = new StringBuilder();
            String[] words = a.split(" ");
            for (String word : words) {
                if (!word.isEmpty()) {
                    StringBuilder thing = new StringBuilder();
                    StringBuilder erm = new StringBuilder();
                    
                    int i = 0;
                    while (i < word.length() && Character.isDigit(word.charAt(i))) {
                        erm.append(word.charAt(i));
                        i++;
                    }
        
                    if (erm.length() > 0) {
                        char b = (char) Integer.parseInt(erm.toString());
                        thing.append(b);
                    }
        
                    if (i < word.length()) {
                        char myChar = word.charAt(word.length() - 1);
                        if (i < word.length() - 1) {
                            thing.append(myChar);
                            thing.append(word.substring(i + 1, word.length() - 1));
                            thing.append(word.charAt(i));
                        } else {
                            thing.append(myChar);
                        }
                    }
                    ans.append(thing).append(" ");
                }
            }
            return ans.toString().trim();
        }

    }
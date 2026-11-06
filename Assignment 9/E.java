class E {
    public static void main(String[] args) {
        String s = "aabbcccdddd";
        int max = 0, sec = 0;
        char ch = ' ';

        for (int i = 0; i < s.length(); i++) {
            int c = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    c++;
            }

            if (c > max) {
                sec = max;
                max = c;
                ch = s.charAt(i);
            } else if (c > sec && c < max) {
                sec = c;
                ch = s.charAt(i);
            }
        }

        System.out.println(ch + " (frequency: " + sec + ")");
    }
}

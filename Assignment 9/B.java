class B {
    public static void main(String[] args) {
        String s = "programming";
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (r.indexOf(ch) == -1)
                r += ch;
        }

        System.out.println(r);
    }
}

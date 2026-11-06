class D {
    public static void main(String[] args) {
        String s = "Java is easy";
        String[] a = s.split(" ");

        for (int i = 0; i < a.length; i++) {
            String r = "";

            for (int j = a[i].length() - 1; j >= 0; j--) {
                r += a[i].charAt(j);
            }

            System.out.print(r + " ");
        }
    }
}

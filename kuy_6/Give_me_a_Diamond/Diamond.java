package kuy_6.Give_me_a_Diamond;

class Diamond {
    public static String print(int n) {
        if (n % 2 == 0 || n < 0) {
            return null;
        }

        StringBuilder diamondBuilder = new StringBuilder();
        for (int row = 0; row < n; row++) {
            int spaceCount = Math.abs((n / 2 - row));
            int starCount = n - (spaceCount * 2);
            diamondBuilder.append(" ".repeat(spaceCount));
            diamondBuilder.append("*".repeat(starCount));
            diamondBuilder.append("\n");
        }

        return diamondBuilder.toString();
    }
}
class Solution {
    public boolean isValid(String s) {

        boolean changed = true;

        while (changed) {
            changed = false;

            if (s.contains("()")) {
                s = s.replace("()", "");
                changed = true;
            }
            if (s.contains("{}")) {
                s = s.replace("{}", "");
                changed = true;
            }
            if (s.contains("[]")) {
                s = s.replace("[]", "");
                changed = true;
            }
        }

        return s.length() == 0;
    }
}

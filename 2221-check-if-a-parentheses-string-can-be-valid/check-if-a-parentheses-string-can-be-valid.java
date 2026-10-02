class Solution {
    public boolean canBeValid(String inputs, String locks) {
        if (inputs.length() % 2 != 0) 
            return false;

        int balancecount = 0;
        for (int i = 0; i < inputs.length(); i++) {
            if (locks.charAt(i) == '0' || inputs.charAt(i) == '(') 
                balancecount++;
            else 
                balancecount--;
            if (balancecount < 0) 
                return false;
        }

        balancecount = 0;
        for (int i = inputs.length() - 1; i >= 0; i--) {
            if (locks.charAt(i) == '0' || inputs.charAt(i) == ')') 
                balancecount++;
            else 
                balancecount--;
            if (balancecount < 0) 
                return false;
        }

        return true;
    }
}
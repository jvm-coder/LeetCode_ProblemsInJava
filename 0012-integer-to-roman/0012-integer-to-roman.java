class Solution {
    public String intToRoman(int num) {
        String[] arr1 = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arr2 = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder output = new StringBuilder();
        
        while(num>0) {
            for(int i=0;i<13;i++) {
                if(num >= arr2[i]) {
                    num -= arr2[i];
                    output.append(arr1[i]);
                    break;
                }
            }
        }
        return output.toString();
    }
}
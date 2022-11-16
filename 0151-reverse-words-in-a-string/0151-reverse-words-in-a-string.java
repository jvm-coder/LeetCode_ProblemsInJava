class Solution{
    public String reverseWords(String s){
        String[] arr = s.trim().split("\\s+");
        int i = 0, j = arr.length - 1;
        while(i < j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < arr.length; k++){
            if(k == arr.length - 1){
                sb.append(arr[k]);
            }else{
                sb.append(arr[k]+" ");
            }
        }
        return sb.toString();
    }
}

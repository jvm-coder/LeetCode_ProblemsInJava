class Solution {
    public int convertToMinutes(String a) {
        int mins = Integer.parseInt(a.substring(0,2));
        mins = (mins*60) + Integer.parseInt(a.substring(3,5));
        
        return mins;
    }
    
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1 = convertToMinutes(event1[0]);
        int end1 = convertToMinutes(event1[1]);
        int start2 = convertToMinutes(event2[0]);
        int end2 = convertToMinutes(event2[1]);
        
        if(start2 >= start1 && start2 <= end1)    return true;
        
        if(end2 >= start1 && end2 <= end1)    return true;
        
        if(start2 <= start1 && end2 >= end1)    return true;
        
        return false;
    }
}
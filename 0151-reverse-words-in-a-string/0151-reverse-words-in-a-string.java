class Solution {
    public String reverseWords(String s) {
        String a[]=s.split("\\s+");
        String t="";
        for(int i=a.length-1;i>=0;i--){
            if(i==0){
                t=t+a[i];
            }
            else{

            
            t=t+ a[i]+" ";
            }
        }
     String f= t.trim();
        return f;
    }
}
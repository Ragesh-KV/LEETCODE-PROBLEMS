class Solution {
    public String reverseWords(String s) {
        String str[]=s.split("\\s+");
        String b="";
        for(int i=0;i<str.length;i++){
            String d = str[i];
            String u="";
            for(int j=d.length()-1;j>=0;j--){
                u=u+d.charAt(j);
            }
            b=b+u+" ";
        }
       b= b.trim();
        return b;
    }
}
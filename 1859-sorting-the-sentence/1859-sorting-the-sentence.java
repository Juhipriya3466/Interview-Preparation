class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] res=new String[str.length];
        for(int i=0;i<str.length;i++)
        {
            int pos=str[i].charAt(str[i].length()-1)-'0';
            res[pos-1]=str[i].substring(0,str[i].length()-1)+" ";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<res.length;i++)
            sb.append(res[i]);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
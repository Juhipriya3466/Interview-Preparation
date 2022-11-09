class Solution {
    public String decodeString(String s) {
        Stack<Integer> num=new Stack<Integer>();
        Stack<String> alpha=new Stack<String>();
        int i=0;
        String res="";
        while(i<s.length())
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int count=0;
                while(Character.isDigit(s.charAt(i)))
                {
                    count=count*10+(s.charAt(i)-'0');
                    i++;
                }
                num.push(count);
            }
            else if(s.charAt(i)=='[')
            {
                alpha.push(res);
                res="";
                i++;
            }
            else if(s.charAt(i)==']')
            {
                StringBuilder sb=new StringBuilder(alpha.pop());
                int times=num.pop();
                for(int j=0;j<times;j++)
                    sb.append(res);
                res=sb.toString();
                i++;
            }
            else
            {
                res+=s.charAt(i);
                i++;
            }
        }
        return res;
        
    }
}
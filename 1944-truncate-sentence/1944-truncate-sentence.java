class Solution {
    public String truncateSentence(String s, int k) {
        String out="";
        // ----------->>>  method 1;
        // ArrayList<String> al=new ArrayList<>();
        
        // for(int i=0;i<s.length();i++){
        //     String a="";
        //     while(i!=s.length() && s.charAt(i)!=' '){
        //         a+=s.charAt(i);
        //         i++;
        //     }
        //     al.add(a);
        //     if(i<s.length() && s.charAt(i)==' ')
        //         al.add(" ");

        
        // }
        
        // for (int i=0;i<2*k-1 ;i++){             // no need of last " " so till (2*k) -1
        //     // System.out.print(ele +"|");
        //     out += al.get(i);
        // }


        // ------------>>> OPTIMAL method
        int space_cnt=0;
        int i=0;
        
        for (i=0;i<s.length();i++){
            if (s.charAt(i) == ' ')
                space_cnt++;
            
            if (space_cnt==k)
                break;

        }
        if (i== s.length())
            return s;
        
        
        return s.substring(0,i);
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> win=new HashMap<>();
        int res=0,l=0,maxf=0;
        for(int r=0;r<s.length();r++){
            win.put(s.charAt(r),win.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,win.get(s.charAt(r)));
            while((r-l+1)-maxf>k){
                win.put(s.charAt(l),win.get(s.charAt(l))-1);
                l++;
            } 
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}

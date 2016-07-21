public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C - A)*(D - B);
        int area2 = (G - E)*(H - F);
        int leftx = Math.max(A,E);
        int lefty = Math.max(B,F);
        int rightx = Math.max(Math.min(C,G), leftx); // 画图分析。。找到重叠的leftbottom 和righttop
        int righty = Math.max(Math.min(D,H), lefty);
        
        return area1 + area2 - (rightx - leftx)*(righty - lefty);
        
    }
}
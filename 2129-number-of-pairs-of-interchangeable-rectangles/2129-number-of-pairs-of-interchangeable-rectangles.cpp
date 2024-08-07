class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& r) {
        long long pc=0;
        map<double,int>m;
        int n=r.size();
        for(int i=0;i<n;i++){
            double ratio=(double)r[i][0]/r[i][1];
            pc=pc+m[ratio];
m[ratio]+=1;
        }return pc;
    }
};
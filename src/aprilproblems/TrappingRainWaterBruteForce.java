package aprilproblems;

class TrappingRainWaterBruteForce {
    public int trap(int[] height) {
        int n=height.length;
        int storage=0;
        for(int i=0;i<n;i++){
            int lam=lam(i,height);
            int ram=ram(i,height);
            int d= Math.min(lam,ram);
            if(d>height[i])
            storage+=d-height[i];
            
            
        }
        return storage;
        
    }
    public int lam(int i,int[] a){
        if(i==0)return 0;
        int max=0;
        for(int j=0;j<i;j++)
        max=Math.max(max,a[j]);
        return max;
    }
    public int ram(int i,int[] a){
        if(i==a.length-1)
        return 0;
        int max=0;
        for(int j=i+1;j<a.length;j++)
        max=Math.max(max,a[j]);
        return max;

    }
}
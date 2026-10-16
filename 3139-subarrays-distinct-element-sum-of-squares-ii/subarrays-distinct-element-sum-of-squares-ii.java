
import java.util.*;
class Solution {
    static final long MOD=1000000007L;
    long[] sum,sumSq,lazy;
    int n;
    public int sumCounts(int[] nums) {
        n=nums.length;
        sum=new long[4*n];
        sumSq=new long[4*n];
        lazy=new long[4*n];
        HashMap<Integer,Integer> last=new HashMap<>();
        long ans=0;
        for(int i=0;i<n;i++){
            int prev=last.getOrDefault(nums[i],-1);
            update(0,0,n-1,prev+1,i);
            ans=(ans+query(0,0,n-1,0,i))%MOD;
            last.put(nums[i],i);
        }
        return (int)ans;
    }
    void apply(int index,int l,int r,long d) {
        long len=r-l+1L;
        sumSq[index]=(sumSq[index]+2*d%MOD*sum[index]%MOD+d*d%MOD*len%MOD)%MOD;
        sum[index]=(sum[index]+d*len)%MOD;
        lazy[index]=(lazy[index]+d)%MOD;
    }
    void push(int index,int l,int r) {
        if(lazy[index]==0||l==r)return;
        int mid=l+(r-l)/2;
        apply(2*index+1,l,mid,lazy[index]);
        apply(2*index+2,mid+1,r,lazy[index]);
        lazy[index]=0;
    }
    void update(int index,int l,int r,int ql,int qr) {
        if(qr<l||r<ql)return;
        if(ql<=l&&r<=qr){
            apply(index,l,r,1);
            return;
        }
        push(index,l,r);
        int mid=l+(r-l)/2;
        update(2*index+1,l,mid,ql,qr);
        update(2*index+2,mid+1,r,ql,qr);
        sum[index]=(sum[2*index+1]+sum[2*index+2])%MOD;
        sumSq[index]=(sumSq[2*index+1]+sumSq[2*index+2])%MOD;
    }
    long query(int index,int l,int r,int ql,int qr) {
        if(qr<l||r<ql)return 0;
        if(ql<=l&&r<=qr)return sumSq[index];
        push(index,l,r);
        int mid=l+(r-l)/2;
        long left=query(2*index+1,l,mid,ql,qr);
        long right=query(2*index+2,mid+1,r,ql,qr);
        return (left+right)%MOD;
    }
}

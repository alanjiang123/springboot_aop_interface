package com.example.demo.test.aop.two.test;

@testaaa(test1 = "aaa")
public class test2 {
	// public static void main(String[] args) {
	//
	// }
	public void test() {
		testaaa t = this.getClass().getAnnotation(testaaa.class);
		t.test1();
	}
	
	public static void main(String[] args) {
		int[] list = {1,3,3,16,1,4,16,4};
		
		System.out.println(maxSum3(list, 4, 4));;
	}
	
	static int maxSum3(int[] a,int l,int r){
	    if(l>r){
	        return 0;
	    }
	    if(l==r)
	        return max(a[l],0);
	    int m=(l+r)/2;
	    int lmax=0,sum=0;
	    for(int i=m;i>=0;i--){
	        sum +=a[i];
	        if(sum>lmax)
	            lmax=sum;
	    }
	    int rmax=0;
	    sum=0;
	    for(int j=m+1;j<=r;j++){
	        sum +=a[j];
	        if(sum>rmax)
	            rmax=sum;
	    }
	    return max(lmax+rmax,max(maxSum3(a,l,m),maxSum3(a,m+1,r)));
	}
	
	static int max(int a,int b){
	    return (a>b)?a:b;
	}
}

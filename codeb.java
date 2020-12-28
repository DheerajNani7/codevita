import java.util.*;
class codeb{
public static void main(String[] args)  
{ 
        int d=0,b=0;
        Scanner s=new Scanner(System.in);
        d=s.nextInt();
        b=s.nextInt();
  		if(d>=10&&d<500 && b>=2 && b<=50){
        if(d%b==0){
          int n=d/b;
        ArrayList<Integer>[] a= new ArrayList[n];
        for (int i=0;i<n;i++)
        a[i] = new ArrayList<Integer>(); 
        for(int i=0;i<n;i=i+1){
            for(int j=i;j<=d;j=j+n)
                a[i].add(j);
            }
        int ct=0;
        for (int i = 0; i < n; i++) { 
            int result = prime(a[i]);
             if(result==b)
             ct=ct+1;
             else
             ct=ct+0;
        }
        System.out.print(ct);
        }}
} 
static int prime(ArrayList<Integer> a) {
    int ct = 0;
    for (int i : a) {
        if (isprime(i))
            ct += 1;
    }
    return ct;
}
static boolean isprime(int j) {
  if(j<=1)
    return false;
  else{
  	if (j<=1)
      return false;
  	else{
    for(int i = 2; i < j; i++) {
        if(j%i == 0)
            return false;
    }
    return true;
}}
}
}
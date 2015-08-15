import java.io.BufferedReader;

class RedJohnBack {

    public static void main(String arg[]){
	
        int n=0;
	int dp[];
	int cases=Integer.parseInt(arg[0]);
	for(int j=1;j<=cases;j++){
	    n=Integer.parseInt(arg[j]);
	    
	    dp=new int[n+1];
	    for(int i=0;i<=n;i++){
	       
		if(i==0) dp[i]=0;
		if(i<=3) dp[i]=1;
		if(i==4) dp[i]=2;
		if(i>4)
		    dp[i]=dp[i-1]+dp[i-4];
		      
		       
	    }//one test case	           
	    System.out.println(prime_check(dp[n]));
	}//all test cases
    }
    public static int prime_check(int a){
	//test if a is prime
	//System.out.println("testing for primes:"+a);
	int primes=0;   //no of  prime upto n
	if (a<=1) return 0;
	if (a==2) return 1;
	if (a==3) return 2;
	primes=2;
	for(float g=4;g<=a;g++){
	    //System.out.println(a);
	    int flag=0;   // prime//
	    for(float k=2;k<=Math.sqrt(g);k++){
		//System.out.println(g+"%"+k+":"+g%k);
		if(g%k==0){
		    flag=1; // not a prime
		    break;
		}
	    }
	    if(flag==0) primes++;
	}
	return primes;
    }
}
	

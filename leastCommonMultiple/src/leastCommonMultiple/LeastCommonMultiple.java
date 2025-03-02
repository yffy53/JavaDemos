package leastCommonMultiple;

public class LeastCommonMultiple {

	public static int getCM(int m, int n){

        int a = m;
        int b = n;

        while(true){
            if(m==n){
                break;
            }else if(m>n){
                n+=b;
            }else{
                m+=a;
            }
        }

        return m;
    }

}

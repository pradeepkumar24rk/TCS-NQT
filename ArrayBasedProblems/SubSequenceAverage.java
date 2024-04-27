package ArrayBasedProblems;
public class SubSequenceAverage {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int n=a.length,total = (1<<n)-1,flag =0;
        
        for(int i=1;i<=total;i++) {
            int target = i,j=0,sum1=0,sum2=0;
            while(target!=0) {
                if((target&1)==1)
                    sum1+=a[j];
                else
                    sum2+=a[j];
                j++;
                target>>=1;
            }
            double avg = sum1/((int)Math.log10(sum1)+1);
            if((sum1/((int)Math.log10(sum1)+1)) == (sum2/((int)Math.log10(sum2)+1)) ) {
                System.out.println(avg);
                flag =1;
                break;
            }
        }
        if(flag ==0)
            System.out.println("Not");
    }
}

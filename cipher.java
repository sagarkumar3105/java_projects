import Math;

public class cipher
{   static int[] keys;
    static char[] encrypt(String a)
    {
        char[] arr=a.toCharArray();
        int n=arr.length;
        keys=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {   
            k=(int)(Math.random()*100);
            arr[i]+=k;
            keys[n-i-1]=k;
            System.out.print(arr[i]);
        }
        System.out.print("\n");
        return arr;
    }
    
    static char[] decrypt(char[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {   
            arr[i]-=keys[n-1-i];
            System.out.print(arr[i]);
        }
        System.out.print("\n");
        return arr;
    }

    public static void main(String arg[]) 
    {
       
       char[] x=encrypt("Hello world");
       decrypt(x);
    }
}
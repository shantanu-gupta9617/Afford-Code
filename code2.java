import java.util.*;
class Compress
{
    public static void compress(String str)
    {
        String ans="";
        int freq[]=new int[str.length()];
        char string[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
        freq[i]=1;
        for(int j=i+1;j<str.length();j++)
        {
         if(string[i]==string[j])
         {
             freq[i]++;cd 
             string[j]='0';
            }
        }
        }
        for(int i=0;i<freq.length;i++)
        {
        if(string[i]!=' ' && string[i]!='0')
        {
            ans=ans+freq[i]+string[i];
        }
        
        }
        System.out.println("Compressed string is: "+ ans);
    }
    public static void decompress(String str)
    {
    String ans="";
    char string[]=str.toCharArray();
    for(int i=0;i<str.length();i+=2)
    {
     int n=string[i]-'0';
     for(int j=0;j<n;j++)
     {
         ans=ans+string[i+1];
        }
    }
    System.out.println("Decompressed String is: "+ans);
    }
    
    public static void main(String args[])
    {
      String str="AAAABBBCCCCC";
      compress(str);
      String str1="4A3B2C";
      decompress(str1);
    }
        
}
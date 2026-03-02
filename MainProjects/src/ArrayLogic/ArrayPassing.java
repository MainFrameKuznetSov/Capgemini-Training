package ArrayLogic;

import java.lang.reflect.Array;

public class ArrayPassing 
{

    public static void main(String[] args) 
    {
        boolean boolArr[]= {true,true,false,false};
        char charArr[]= {'a','d','i','t','y','a'};
        int intArr[]= {12,25,43};
        try 
        {
        	printArray(boolArr,charArr,intArr,0);
        }
        catch(Exception ex)
        {
        	System.out.println(ex.getMessage());
        }
    }

    public static void printArray(Object... arr) 
    {
        for(Object obj:arr) 
        {
            int len=Array.getLength(obj);
            for(int i=0;i<len;++i)
                System.out.print(Array.get(obj,i)+" ");
            System.out.println();
        }
    }
}

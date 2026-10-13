class Solution {
    public String intToRoman(int num) {
        
        // int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        // String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        // StringBuilder result=new StringBuilder();

        // for(int i=0;i<values.length;i++)
        // {
        //     while(num>=values[i])
        //     {
        //         result.append(symbols[i]);
        //         num=num-values[i];
        //     }
        // }
        // return result.toString();

        StringBuilder result=new StringBuilder();

        int thousands=num/1000; //handling  the thousand digit
        for(int i=0;i<thousands;i++)
        {
            result.append("M");
        }
        num=num%1000;

        //handling the hundred  digit
        int hundred=num/100;
        if(hundred==9)
        result.append("CM");
        else if(hundred>=5){
        result.append("D");
        for(int i=0;i<hundred-5;i++)
        {
            result.append("C");
        }
        }
        else if(hundred==4)
        result.append("CD");
        else
        for(int i=0;i<hundred;i++)
        {
            result.append("C");
        }
        num=num%100;

        //handling  the tens part
        int tens=num/10;
        if(tens==9)
        result.append("XC");
        else if(tens>=5){
        result.append("L");
        for(int i=0;i<tens-5;i++)
        {
            result.append("X");
        }
        }
        else if(tens==4)
        result.append("XL");
        else
        for(int i=0;i<tens;i++)
        {
            result.append("X");
        }
        num=num%10;

        //handling the  ones digit 
        int ones =num;
        if(ones==9)
        result.append("IX");
        else if(ones>=5){
        result.append("V");
        for(int i=0;i<ones-5;i++)
        {
            result.append("I");
        }
        }
        else if(ones==4)
        result.append("IV");
        else
        for(int i=0;i<ones;i++)
        {
            result.append("I");
        }

        return result.toString();

    }
}

package ICETask3;


 
public class st10434031_ice_task_3 
{
     public boolean isValid(String s)
    {
        // status is false by default
        boolean status=false;
        //tempSB StringBuilder variable that stores String s
        StringBuilder tempSB=new StringBuilder(s);
        //int mover variable to move to correct variable for comparison
        int mover=1;
        
        // if the string is empty it is not valid
        if(tempSB.length()==0)
        {
            return status;
        }
        else
        {
            //if the string is odd it will not pass as brackets occur in pairs, hence all strings must be even
            if(tempSB.length()%2!=0)
            {  
                return status; 
            }
            else
            {
                    
                    //loop is executed (length()/2-1) times as a string with valid brackets can be considers two be two equal mirror images
                    for(int x=0;x<(tempSB.length()/2);x++)
                    {
                        if(tempSB.charAt(x)=='(')
                        {
                            if(tempSB.charAt(tempSB.length()-mover)==')')
                            {
                                status=true;
                            }
                            else
                            {
                                if(tempSB.charAt(x+1)==')')
                                {
                                    status=true;
                                }
                                else
                                {
                                    status=false;
                                } 
                            }
                        }
                        
                        if(tempSB.charAt(x)=='[')
                        {
                            if(tempSB.charAt(tempSB.length()-mover)==']')
                            {
                                status=true;
                            }
                            else
                            {
                                if(tempSB.charAt(x+1)==']')
                                {
                                    status=true;
                                }
                                else
                                {
                                    status=false;
                                }  
                            }
                        }
                        
                        if(tempSB.charAt(x)=='{')
                        {
                            if(tempSB.charAt(tempSB.length()-mover)=='}')
                            {
                                status=true;
                            }
                            else
                            {
                                if(tempSB.charAt(x+1)=='}')
                                {
                                    status=true;
                                }
                                else
                                {
                                    status=false;
                                }
                            } 
                        } 
                        //mover is incremented so that the correct comparison occurs
                        mover++;
                }   
                    
                return status;
            }
        }    
    }

    public int odd_squares_sum(int n)
    {
        int odd_square_sum=0;
        
        for(int x=1;x<=n;x++)
        {
            // if x is odd the square of x is added to odd_square_sum
            if(x%2!=0)
            {
                odd_square_sum+=Math.pow(x,2);
            }
        }
        
        return odd_square_sum;
    }
    
    public int greatest_common_divisor(int a,int b)
    {
        int greatest_commmon_divisor=0;
        
        // if b>a then a would be the greatest common divisor in the worst case, hence the a is used to control the loop
        if(a<b)
        {
            for(int x=1;x<=a;x++)
            {
                if((a%x==0)&&(b%x==0))
                {
                    greatest_commmon_divisor=x;
                }
            }
        }
        else
        {
            // if a>b then b would be the greatest common divisor in the worst case, hence b is used to control the loop
            for(int x=1;x<=b;x++)
            {
                if((a%x==0)&&(b%x==0))
                {
                    greatest_commmon_divisor=x;
                } 
            }
        }
        
        return greatest_commmon_divisor;
    }

}

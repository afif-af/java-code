
package com.mycompany.assignment35;

public class batsman extends player {
    int total_run;
    int total_match;
    batsman(String name,String contact_address,String telephone_number,
            String status,int total_run,int total_match)
    {
        super(name,contact_address,telephone_number,status);
        this.total_run=total_run;
        this.total_match=total_match;
        
    }
    public double calculateAvarage()
    {
        if(total_match==0)
        {
            return 0;
        }
       return (double)total_run / total_match;
        
    }
    public String toString()
        {
            return "batsman";
        }
}

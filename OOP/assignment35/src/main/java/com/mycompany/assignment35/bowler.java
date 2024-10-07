
package com.mycompany.assignment35;

public class bowler extends player {
    int total_wicket;
    int total_match;
    bowler(String name,String contact_address,String telephone_number,
            String status,int total_wicket,int total_match)
    {
        super(name,contact_address,telephone_number,status);
        this.total_wicket=total_wicket;
        this.total_match=total_match;
        
    }
    public double calculateAvarage()
    {
        return (double)total_wicket / total_match;
        
    }
    public String toString()
        {
            return "bowler";
        }
}


package com.mycompany.assignment35;

public abstract class player {
        private String name;
        private String contact_address; 
        private String telephone_number; 
        private String  status;
        player(String name,String contact_address,String telephone_number,String status)
        {
            this.name=name;
            this.contact_address=contact_address;
            this.telephone_number=telephone_number;
            this.status=status;
            
        }
        public abstract double calculateAvarage();
        
        public String toString()
        {
            return "player";
        }
        void display()
        {
            System.out.println("Name "+name);
            System.out.println("contact_address "+contact_address);
            System.out.println("telephone_number "+telephone_number);
            System.out.println("status "+status);
        }
    
}

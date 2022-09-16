package Chapter10EX09;

public class VIP extends Customer {
      private int agentid;
      double saleratio;
      
      VIP(){
    	  customergrade = "VIP";
    	  bonusratio = 0.05;
    	  bounspoint = 10;
    	  
      }
      VIP(int customerid, String customername, int agentid){
    	  super(customerid,customername);
    	  customergrade = "VIP";
    	  bonusratio = 0.05;
    	  bounspoint = 10;
      }
      
}

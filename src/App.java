public class App {
    public static void main(String[] args) throws Exception {
String firstName = "Ahmad";
String lastName = "Musallam";
int age = 24; 
int amount = 127;
boolean ismarried = false; 

double amount2 = 30;
String deposit = "Deposit";
String withdraw = "Withdraw";

int amount3 = 5; 

String fullName = " John doe";

System.out.println(firstName);
System.out.println(lastName);
System.out.println(age);
System.out.println(amount);
System.out.println(ismarried);

System.out.println("The amount is"+ " "+amount2+"KD"+" \n Would you like to" +" "+ deposit + " " +"or" +" "+withdraw +" the amount" );

System.out.println(amount3+" " +"plus "+amount3 +" makes" +" "+ (amount3+amount3));

System.out.println( "My name is"+fullName.substring(0,5).toUpperCase()+" and my last name length is "+fullName.substring(6).length());
System.out.println(fullName.substring(6).startsWith("d"));




    }
    
}

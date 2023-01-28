package bank.creditcard;

import bank.chennai.*;

class Account_Holder{

public static void main(String args[]){

SBI obj =  new   SBI();

System.out.println(SBI.branch_name);

System.out.println(obj.empName);

System.out.println(obj.empId);

obj.get_loan(1000);

obj.create_account();

}

}

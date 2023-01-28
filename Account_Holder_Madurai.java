package bank.madurai;

import bank.chennai.*;

class Account_Holder_Madurai{

public static void main(String args[]){

SBI sbi1 =  new SBI();

System.out.println(SBI.branch_name);

System.out.println(sbi1.empName);

System.out.println(sbi1.empId);

sbi1.get_loan(2000);

sbi1.create_account();

}

}

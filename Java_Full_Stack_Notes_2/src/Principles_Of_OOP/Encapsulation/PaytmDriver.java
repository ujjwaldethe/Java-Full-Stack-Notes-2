package Principles_Of_OOP.Encapsulation;

public class PaytmDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount("ujjwaldethe","SBI",987456321l,1234,"BOBCHALIS",9370682720l,369258147l);
		Paytm p1 = new Paytm(b1.getUserName(),b1.getPhoneNumber(),21);
		p1.createUpi(b1);
		p1.u.displayUpi();
		p1.u.B.getBankName();
	}

}

interface Bank{
	void account();
}
interface Bank1{
	void account();
}
interface ATM extends Bank, Bank1{
	void insertCard();
	void selectOption();
	void enterPassword();
}
public class NewAtm {

}

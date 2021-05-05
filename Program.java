import java.util.Date;

public class Program {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager =new NeroCustomerManager();
		customerManager.Save(new Customer(5454554, "Engin", "Demirog",new Date(05/11/1985), "565655sd565") );

	}

}

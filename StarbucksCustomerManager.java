

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService {
	
	

@Override
          public void Save(Customer customer) throws Exception 
    {
	     if(ICustomerCheckService.CheckIfRealPerson(customer))
	      {
		
	       super.Save(customer);
	      
	      }
	     else
	      {
	     throw new Exception("Not a valid person") ;
	     
    }
    }
}
	
    
    




		
	

      	





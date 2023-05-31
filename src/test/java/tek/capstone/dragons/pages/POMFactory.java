package tek.capstone.dragons.pages;
import tek.capstone.dragons.base.BaseSetup;

public class POMFactory extends BaseSetup {
	
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage accountPage;
	private RetailOrderPage retailorderpage;
	
	
		public POMFactory() {
			this.homePage = new RetailHomePage();
			this.signInPage = new RetailSignInPage();
			this.accountPage = new RetailAccountPage();
			this.retailorderpage = new RetailOrderPage();
		
	}
	
		public RetailHomePage homePage() {
			return this.homePage;
		}
      public RetailOrderPage retailorderpage() {
    	  return this.retailorderpage;
      }
     public RetailSignInPage signInPage() {
	    return this.signInPage;
     
     }
     
     public RetailAccountPage accountPage() {
    	 return this.accountPage;
     }
}
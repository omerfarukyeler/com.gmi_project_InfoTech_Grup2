package pages;

public class AllPages {
    private CreateAccountPage createAccountPage;
    private CreateOrEditACustomerPage createOrEditACustomerPage;
    private GmiBankHomePage homePage;
    private Login_Page loginPage;
    private LoginPasswordPage loginPasswordPage;
    private LoginUserInfoPage loginUserInfoPage;
    private ManageCustomersPage manageCustomersPage;
    private Manage_Accounts_Page manageAccountsPage;
    private RegisterPage registerPage;
    private SignInPage signInPage;
    private UserManagementPage userManagementPage;

    public CreateOrEditACustomerPage createOrEditACustomerPage() {
        if (createOrEditACustomerPage == null) {
            createOrEditACustomerPage = new CreateOrEditACustomerPage();
        }
        return createOrEditACustomerPage;
    }
    public CreateAccountPage createAccountPage() {
        if (createAccountPage == null) {
            createAccountPage = new CreateAccountPage();
        }
        return createAccountPage;
    }
    public GmiBankHomePage homePage() {
        if (homePage == null) {
            homePage = new GmiBankHomePage();
        }
        return homePage;
    }
    public Login_Page expandableListPage() {
        if (loginPage == null) {
            loginPage = new Login_Page();
        }
        return loginPage;
    }
    public LoginPasswordPage loginPasswordPage(){
        if (loginPasswordPage == null){
            loginPasswordPage = new LoginPasswordPage();
        }return loginPasswordPage;
    }
    public LoginUserInfoPage loginUserInfoPage(){
        if (loginUserInfoPage== null){
            loginUserInfoPage = new LoginUserInfoPage();
        }return loginUserInfoPage;
    }

    public ManageCustomersPage manageCustomersPage(){
        if (manageCustomersPage == null){
            manageCustomersPage = new ManageCustomersPage();
        }return manageCustomersPage;
    }
    public Manage_Accounts_Page manageAccountsPage(){
        if (manageAccountsPage == null){
            manageAccountsPage = new Manage_Accounts_Page();
        }return manageAccountsPage;
    }

    public RegisterPage registerPage(){
        if (registerPage== null){
            registerPage = new RegisterPage();
        }return registerPage;
    }

    public SignInPage signInPage(){
        if (signInPage == null){
            signInPage = new SignInPage();
        }return signInPage;
    }
    public UserManagementPage userManagementPage(){
        if (userManagementPage == null){
            userManagementPage = new UserManagementPage();
        }return userManagementPage;
    }
}

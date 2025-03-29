package com.pattern2.builder;

public class TestUserClass {
	/*
	 * 		The Builder Pattern is a creational design pattern used to construct complex objects step by step. In test automation, it’s useful for creating test data objects with flexibility.
		
		🔹 Benefits of Using Builder Pattern for Test Data
			✅ Flexibility: Easily create different test data objects without multiple constructors.
			✅ Readability: Clearly see which fields are being set in each test case.
			✅ Reusability: The same builder can be used across multiple test cases.
			✅ Immutability: Prevents accidental modification of test data objects.
		
		
		🔹 When to Use Builder Pattern in Test Automation?
			When you have complex test data with many optional fields.
			When you need to create different variations of test data easily.
			When you want to avoid large constructors with too many parameters.
			
		🔹 Why Avoid Setters?
			❌ Immutability Issue – Setters allow modifying an object after creation, which can cause unpredictable behavior in tests.
			❌ Thread Safety – Immutable objects are safer in multi-threaded test execution.
			❌ Better Readability – With Builder Pattern, test data creation is cleaner and more structured.
			
		🔹 Scenario: Creating User Test Data
			Let’s say you need to create different User objects for testing login, registration, or profile update. Instead of creating multiple constructors or setting values manually, you can use the Builder Pattern.
			
			Without builder, to create a User object, we need to pass all values. Ex: User user=new User("firstnamevalue","lastnamevalue","email.com","pass123",30);
	
	*/

	public static void main(String[] args) {
		// Creating a Default Test User
		User testUser = new User.UserBuilder()
			    .firstName("John")
			    .lastName("Doe")
			    .email("john.doe@example.com")
			    .password("Test@123")
			    .age(30)
			    .build();
		
		System.out.println(testUser.getAge()+" "+testUser.getLastName());
		
//		Creating a User With Only Required Fields
		User simpleUser = new User.UserBuilder()
			    .email("user@example.com")
			    .password("password123")
			    .build();
		
//		Creating Multiple Users With Different Data
		User adminUser = new User.UserBuilder()
			    .firstName("Admin")
			    .lastName("User")
			    .email("admin@example.com")
			    .password("Admin@123")
			    .age(40)
			    .build();

			User guestUser = new User.UserBuilder()
			    .firstName("Guest")
			    .lastName("User")
			    .email("guest@example.com")
			    .password("Guest@123")
			    .build();
			
		/*
		 * Example: Using in a Test Case
			@Test
			public void testUserLogin() {
			    User testUser = new User.UserBuilder()
			        .email("testuser@example.com")
			        .password("SecurePass123")
			        .build();

			    LoginPage loginPage = new LoginPage(driver);
			    loginPage.enterEmail(testUser.getEmail());
			    loginPage.enterPassword(testUser.getPassword());
			    loginPage.clickLogin();

			    Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed!");
			}
		*/
		
	}

}

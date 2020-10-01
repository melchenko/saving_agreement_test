Meta:
@current

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: CHECK THE CORRECT SAVING AGREEMENT FOR LIFE, CRITICAL AND DISABILITY INSURANCE

Given the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page
And the user is on the login Page
When the user click on 'email' and input 'automation@gmail.com'
And the user click on 'password' and input '-fXIGf'
And the user click on the 'Login' button
And the user is on the Agreement Insurance Page
And the user click on 'Please, select advisor' and choose 'Automation'
And the user click on 'application_number' and input 'N777'
And the user click on 'first_name' and input 'John'
And the user click on 'last_name' and input 'Doe'
And the user click on 'Please, select product type' and choose 'Safe Driver'
And the user click on 'Please, select company' and choose 'La Capitale'
And the user click on 'annual_premium' and input '1200'
And the user toggle On checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user toggle On checkbox 'EFA/Needs Analysis Completed'
And the user toggle On checkbox 'This is an Electronic application'
And the user choose 'No' for 'Will this policy replace another policy?'
And the user choose 'Yes' for 'Banking information included in application'
And the user choose 'Reason Why Letter was given immediately after the sale' for 'Reason Why questions, please pick one'
And the user upload 'src/x.pdf' to 'Disclosure Form' form
And the user upload 'src/x.pdf' to 'Illustration' form
And the user upload 'src/x.pdf' to 'Reason Why.' form
And the user click on the 'Add' button
Then they should see 'NBT for La Capitale John Doe N777 has been successfully created'
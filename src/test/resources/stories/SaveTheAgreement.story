Meta:
@current

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: CHECK THE CORRECT SAVING AGREEMENT FOR LIFE, CRITICAL AND DISABILITY INSURANCE

Given the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page
And the user is on the login Page
When the user clicks 'email' and inputs 'automation@gmail.com'
And the user clicks 'password' and inputs '-fXIGf'
And the user clicks the 'Login' button
And the user is on the Agreement Insurance Page
And the user clicks 'Please, select advisor' and chooses 'Automation'
And the user clicks 'application_number' and inputs 'N777'
And the user clicks 'first_name' and inputs 'John'
And the user clicks 'last_name' and inputs 'Doe'
And the user clicks 'Please, select product type' and chooses 'Safe Driver'
And the user clicks 'Please, select company' and chooses 'La Capitale'
And the user clicks 'annual_premium' and inputs '1200'
And the user toggles checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user toggles checkbox 'EFA/Needs Analysis Completed'
And the user toggles checkbox 'This is an Electronic application'
And the user chooses 'No' for 'Will this policy replace another policy?'
And the user chooses 'Yes' for 'Banking information included in application'
And the user chooses 'Reason Why Letter was given immediately after the sale' for 'Reason Why questions, please pick one'
And the user uploads 'src/x.pdf' to 'Disclosure Form' form
And the user uploads 'src/x.pdf' to 'Illustration' form
And the user uploads 'src/x.pdf' to 'Reason Why.' form
And the user clicks the 'Add' button
Then they should see 'NBT for La Capitale John Doe N777 has been successfully created'
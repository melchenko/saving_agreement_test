Meta:
@current

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: CHECK THE CORRECTNESS OF SAVING THE AGREEMENT FOR LIFE, CRITICAL AND DISABILITY INSURANCE

Given the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page
And the user is on the login Page
When the user clicks 'email' and inputs 'fa@experior.test'
And the user clicks 'password' and inputs 'fa'
And the user clicks the 'Login' button
And the user is on the Agreement Insurance Page
And the user clicks 'application_number' and inputs '12345'
And the user clicks 'first_name' and inputs 'Test'
And the user clicks 'last_name' and inputs 'Pass'
And the user clicks 'Please, select product type' and chooses 'Term to 80'
And the user clicks 'Please, select company' and chooses 'La Capitale'
And the user clicks 'annual_premium' and inputs '1200'
And the user toggles checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user uploads 'src/sample.pdf' to 'Disclosure Form' form
And the user toggles checkbox 'EFA/Needs Analysis Completed'
And the user uploads 'src/sample.pdf' to 'Application' form
And the user uploads 'src/sample.pdf' to 'Illustration' form
And the user chooses 'No' for 'Will this policy replace another policy?'
And the user chooses 'Yes' for 'Banking information included in application'
And the user chooses 'Reason Why Letter will be emailed or mailed to the client no later than policy delivery' for 'Reason Why questions, please pick one'
And the user clicks the 'Add' button
Then they should see 'NBT for La Capitale Test Pass 12345 has been successfully created'
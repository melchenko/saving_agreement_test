Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: CHECK THE CORRECTNESS OF SAVING THE AGREEMENT FOR LIFE, CRITICAL AND DISABILITY INSURANCE

Given the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page
And the user is on the login Page
When the user clicks 'Email' and inputs 'fa@experior.test'
And the user clicks 'Password' and inputs 'fa'
And the user clicks the 'Login' button
And the user is on the Agreement Insurance Page
And the user clicks 'Application Number' and inputs '10001'
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Please, select product type' and chooses 'Term to 80'
And the user clicks 'Company' dropdown menu and chooses 'La Capitale'
And the user clicks 'Annual Premium' and inputs '1200'
And the user toggles checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user uploads 'src/sample.pdf' to 'Disclosure Form' form
And the user toggles checkbox 'EFA/Needs Analysis Completed'
And the user uploads 'src/sample.pdf' to 'Application' form
And the user uploads 'src/sample.pdf' to 'Illustration' form
And the user chooses 'No' for 'Will this policy replace another policy?'
And the user chooses 'Yes' for 'Banking information included in application'
And the user chooses 'Reason Why Letter will be emailed or mailed to the client no later than policy delivery' for 'Reason Why questions, please pick one'
And the user clicks the 'Add' button
Then they should see 'NBT for La Capitale Test Pass 10001 has been successfully created'

Given the user is on the Agreement Insurance Page
When the user clicks 'Application Number' and inputs '10002'
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Please, select product type' and chooses 'Term to 80'
And the user clicks 'Company' dropdown menu and chooses 'La Capitale'
And the user clicks 'Annual Premium' and inputs '1200'
And the user toggles checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user uploads 'src/sample.pdf' to 'Disclosure Form' form
And the user toggles checkbox 'EFA/Needs Analysis Completed'
And the user uploads 'src/sample.pdf' to 'Application' form
And the user uploads 'src/sample.pdf' to 'Illustration' form
And the user chooses 'No' for 'Will this policy replace another policy?'
And the user chooses 'Yes' for 'Banking information included in application'
And the user chooses 'Reason Why Letter was given immediately after the sale' for 'Reason Why questions, please pick one'
And the user uploads 'src/x.pdf' to 'Reason Why.' form
And the user clicks the 'Add' button
Then they should see 'NBT for La Capitale Test Pass 10002 has been successfully created'

Given the user is on the Agreement Insurance Page
When the user clicks 'Application Number' and inputs '10003'
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Please, select product type' and chooses 'Term to 80'
And the user clicks 'Company' dropdown menu and chooses 'La Capitale'
And the user clicks 'Annual Premium' and inputs '1200'
And the user toggles checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user uploads 'src/sample.pdf' to 'Disclosure Form' form
And the user toggles checkbox 'EFA/Needs Analysis Completed'
And the user uploads 'src/sample.pdf' to 'Application' form
And the user uploads 'src/sample.pdf' to 'Illustration' form
And the user chooses 'Yes' for 'Will this policy replace another policy?'
And the user uploads 'src/sample.pdf' to 'LIRD' form
And the user uploads 'src/sample.pdf' to 'Add another LIRD' form
And the user chooses 'Yes' for 'Banking information included in application'
And the user chooses 'Reason Why Letter was given immediately after the sale' for 'Reason Why questions, please pick one'
And the user uploads 'src/x.pdf' to 'Reason Why.' form
And the user clicks the 'Add' button
Then they should see 'NBT for La Capitale Test Pass 10003 has been successfully created'

Given the user is on the Agreement Insurance Page
When the user clicks 'Application Number' and inputs '10004'
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Please, select product type' and chooses 'Term to 80'
And the user clicks 'Company' dropdown menu and chooses 'La Capitale'
And the user clicks 'Annual Premium' and inputs '1200'
And the user toggles checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user uploads 'src/sample.pdf' to 'Disclosure Form' form
And the user toggles checkbox 'EFA/Needs Analysis Completed'
And the user uploads 'src/sample.pdf' to 'Application' form
And the user uploads 'src/sample.pdf' to 'Illustration' form
And the user chooses 'Yes' for 'Will this policy replace another policy?'
And the user uploads 'src/sample.pdf' to 'LIRD' form
And the user chooses 'Yes' for 'Banking information included in application'
And the user chooses 'Reason Why Letter was given immediately after the sale' for 'Reason Why questions, please pick one'
And the user uploads 'src/x.pdf' to 'Reason Why.' form
And the user clicks the 'Add' button
Then they should see 'NBT for La Capitale Test Pass 10004 has been successfully created'

Given the user is on the Agreement Insurance Page
When the user clicks 'Application Number' and inputs '10005'
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Please, select product type' and chooses 'Term to 80'
And the user clicks 'Company' dropdown menu and chooses 'La Capitale'
And the user clicks 'Annual Premium' and inputs '1200'
And the user toggles checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user uploads 'src/sample.pdf' to 'Disclosure Form' form
And the user toggles checkbox 'EFA/Needs Analysis Completed'
And the user uploads 'src/sample.pdf' to 'Application' form
And the user uploads 'src/sample.pdf' to 'Illustration' form
And the user chooses 'No' for 'Will this policy replace another policy?'
And the user chooses 'No' for 'Banking information included in application'
And the user uploads 'src/sample.pdf' to 'Banking information' form
And the user chooses 'Reason Why Letter will be emailed or mailed to the client no later than policy delivery' for 'Reason Why questions, please pick one'
And the user clicks the 'Add' button
Then they should see 'NBT for La Capitale Test Pass 10005 has been successfully created'

Given the user is on the Agreement Insurance Page
When the user clicks 'Application Number' and inputs '10006'
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Please, select product type' and chooses 'Safe Driver'
And the user clicks 'Company' dropdown menu and chooses 'La Capitale'
And the user clicks 'Annual Premium' and inputs '1200'
And the user toggles checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user toggles checkbox 'EFA/Needs Analysis Completed'
And the user toggles checkbox 'This is an Electronic application'
And the user chooses 'No' for 'Will this policy replace another policy?'
And the user chooses 'Yes' for 'Banking information included in application'
And the user chooses 'Reason Why Letter was given immediately after the sale' for 'Reason Why questions, please pick one'
And the user uploads 'src/sample.pdf' to 'Disclosure Form' form
And the user uploads 'src/sample.pdf' to 'Illustration' form
And the user uploads 'src/sample.pdf' to 'Reason Why.' form
And the user clicks the 'Add' button
Then they should see 'NBT for La Capitale Test Pass 10006 has been successfully created'



Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: CHECK THE CORRECTNESS OF SAVING THE AGREEMENT FOR INVESTMENT WITH DSC REIMBURSEMENT DEAL

Given the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page
And the user is on the login Page
When the user clicks 'Email' and inputs 'fa@experior.test'
And the user clicks 'Password' and inputs 'fa'
And the user clicks the 'Login' button
And the user go to the 'New Business Transmittals' menu
And the user go to the NBT 'Add Investment with DSC reimbursement' menu
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Company' dropdown menu and chooses 'La Capitale'
And the user clicks 'Please, select type:' and chooses 'LIRA'
And the user clicks 'Investment Amount' and inputs '1200'
And the user clicks 'Source funds/relinquishing institution' and inputs '100'
And the user clicks 'DSC Percent' and inputs '5'
And the user toggles checkbox 'EFA/Investor profile was completed'
And the user toggles checkbox 'Deal exactly matches to remittance form'
And the user uploads 'src/sample.pdf' to 'Remittance Form' form
And the user clicks the 'Add' button
Then they should see 'Dsc Deal Added'
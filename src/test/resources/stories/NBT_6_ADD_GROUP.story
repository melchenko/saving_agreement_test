Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: CHECK THE CORRECTNESS OF SAVING THE AGREEMENT FOR INVESTMENT

Given the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page
And the user is on the login Page
When the user clicks 'Email' and inputs 'fa@experior.test'
And the user clicks 'Password' and inputs 'fa'
And the user clicks the 'Login' button
And the user go to the 'New Business Transmittals' menu
And the user go to the NBT 'Add Group' menu
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Company' dropdown menu and chooses 'La Capitale'
And the user clicks 'Annual Premium' and inputs '1200'
And the user toggles checkbox 'Amount was calculated automatically, please check and approve it is correct'
And the user clicks the 'Add' button
Then they should see 'Group Deal Added'
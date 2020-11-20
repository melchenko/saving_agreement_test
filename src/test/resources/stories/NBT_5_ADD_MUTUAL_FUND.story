Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: CHECK THE CORRECTNESS OF SAVING THE AGREEMENT FOR MUTUAL FUND DEAL

Given the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page
And the user is on the login Page
When the user clicks 'Email' and inputs 'fa@experior.test'
And the user clicks 'Password' and inputs 'fa'
And the user clicks the 'Login' button
And the user go to the 'New Business Transmittals' menu
And the user go to the NBT 'Add Mutual Fund' menu
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Investment Amount (Lump Sum)' and inputs '1200'
And the user clicks the 'Add' button
Then they should see 'Mutual Fund Deal Added'

Given the user go to the 'New Business Transmittals' menu
When the user go to the NBT 'Add Mutual Fund' menu
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Investment Amount (Lump Sum)' and inputs '1200'
And the user toggles checkbox 'Weekly/Bi Weekly/Monthly PAD (if applicable)'
And the user clicks 'Weekly/Bi Weekly/Monthly' dropdown menu and chooses 'Monthly'
And the user clicks 'Weekly/Bi Weekly/Monthly Amount' and inputs '100'
And the user toggles checkbox 'EFA/Investor profile was completed'
And the user clicks the 'Add' button
Then they should see 'Mutual Fund Deal Added'
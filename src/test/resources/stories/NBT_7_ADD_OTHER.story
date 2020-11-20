Meta:
@current

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: CHECK THE CORRECTNESS OF SAVING THE AGREEMENT FOR OTHER DEAL

Given the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page
And the user is on the login Page
When the user clicks 'Email' and inputs 'fa@experior.test'
And the user clicks 'Password' and inputs 'fa'
And the user clicks the 'Login' button
And the user go to the 'New Business Transmittals' menu
And the user go to the NBT 'Add Other' menu
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Please, select company' and chooses 'B2B'
And the user clicks the 'Add' button
Then they should see 'Other deal added'

Given the user go to the 'New Business Transmittals' menu
When the user go to the NBT 'Add Other' menu
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Please, select company' and chooses 'Home/Auto/Commercial'
And the user clicks the 'Add' button
Then they should see 'Other deal added'

Given the user go to the 'New Business Transmittals' menu
When the user go to the NBT 'Add Other' menu
And the user clicks 'First Name' and inputs 'Test'
And the user clicks 'Last Name' and inputs 'Pass'
And the user clicks 'Please, select company' and chooses 'Mortgages'
And the user clicks the 'Add' button
Then they should see 'Other deal added'
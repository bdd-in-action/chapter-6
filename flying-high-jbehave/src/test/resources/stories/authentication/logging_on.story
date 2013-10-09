Logging on to the 'My Flying High' web site

Meta:
@tags component:SSO

Scenario: Logging on successfully
GivenStories: given/joe_has_registered.story
When Joe logs on with password 'secret'
Then he should be given access to the site

Scenario: Logging on with an incorrect password
GivenStories: given/joe_has_registered.story
When Joe logs on with password 'wrong'
Then he should be informed that his password was incorrect

Scenario: Logging on with an expired account
GivenStories: given/joe_has_registered.story
Given the account has expired
When Joe logs on with password 'wrong'
Then he should be informed that his account has expired
And he should be invited to renew his account


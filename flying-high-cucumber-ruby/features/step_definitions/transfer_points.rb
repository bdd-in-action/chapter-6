
Given /^the following accounts:$/ do |accounts|
  # table is a Cucumber::Ast::Table
  @initial_accounts = accounts
end

When /^Joe transfers (\d+) points to Jill$/ do |pointCount|
	pending
end

Then /^the accounts should be the following:$/ do |expected_accounts|
	@initial_accounts.diff!(expected_accounts)
end
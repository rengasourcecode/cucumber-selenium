Feature: Tagging implementations

@smoke
Scenario: login 
Given login verification test

@sanity
Scenario: upload 
Given uploading test

@sanity
Scenario: download 
Given downloading test

@regression @sanity
Scenario: Like  
Given like files test

@regression @sanity
Scenario: Share
Given sharing files test

@regression
Scenario: Comment
Given commenting files test

@endtoend
Scenario: Log-out
Given logout verification test





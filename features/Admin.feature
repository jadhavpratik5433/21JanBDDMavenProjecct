Feature:Admin

Scenario: Login with valid credentil
Given User Lanch chrome Browser
When  User open url "http://admin-demo.nopcommerce.com/login"
And   User enter email as "admin@yourstore.com" and password as "admin"
And   User click on Login button
Then  Page tittle should be "Dashboard / nopcommerce administration"
And   close browser


Scenario Outline: Login Data Driven
Given User Lanch chrome Browser
When  User open url "http://admin-demo.nopcommerce.com/login"
And   User enter email as "<email>" and password as "<password>"
And   User click on Login button
Then  Page tittle should be "Dashboard / nopcommerce administration"
And   close browser



Examples:
|     email                       |          password       |
|admin@yourstore.com              |        admin            |
|admin@yourstore.com              |        admin12          |
|pratikjadhav0022@yourstore.com   |        admin            |
|admin1@yourstore.com             |       admin             |
# Banking Application
## User Stories
1. As a customer, so I can safely store use my money, I want to create a current account.
2. As a customer, so I can save for a rainy day, I want to create a savings account.
3. As a customer, so I can keep a record of my finances, I want to generate bank statements with transaction dates, amounts, and balance at the time of transaction.
4. As a customer, so I can use my account, I want to deposit and withdraw funds.
5. As an engineer, so I don't need to keep track of state, I want account balances to be calculated based on transaction history instead of stored in memory.
6. As a bank manager, so I can expand, I want accounts to be associated with specific branches.
7. As a customer, so I have an emergency fund, I want to be able to request an overdraft on my account.
8. As a bank manager, so I can safeguard our funds, I want to approve or reject overdraft requests.
9. As a customer, so I can stay up to date, I want statements to be sent as messages to my phone.

## Domain Model
### Account (Parent of CurrentAccount & SavingsAccount)
| Members                | Methods     | Scenarios | Outcomes | User Stories |
|------------------------|-------------|-----------|----------|--------------|
| `String accountNumber` |             |           |          |              |
| `String accountHolder` |             |           |          |              |
| `String branchCode`    |             |           |          | 6            |
| `int balanceInCents`   |             |           |          |              |
|                        | `Account()` |           |          |              |


### CurrentAccount (Child of Account)
| Members | Methods            | Scenarios | Outcomes | User Stories |
|---------|--------------------|-----------|----------|--------------|
|         |                    |           |          |              |
|         | `CurrentAccount()` |           |          |              |
|         |                    |           |          |              |
|         |                    |           |          |              |

### SavingsAccount (Child of Account)
| Members | Methods            | Scenarios | Outcomes | User Stories |
|---------|--------------------|-----------|----------|--------------|
|         |                    |           |          |              |
|         | `SavingsAccount()` |           |          |              |
|         |                    |           |          |              |
|         |                    |           |          |              |

### AccountActions
| Members                        | Methods              | Scenarios | Outcomes | User Stories |
|--------------------------------|----------------------|-----------|----------|--------------|
| `List<Integer> transactions`   |                      |           |          |              |
|                                | `createAccount`      |           |          | 1-2          |
|                                | `generateStatement`  |           |          | 3            |
|                                | `deposit`            |           |          | 4            |
|                                | `withdraw`           |           |          | 4            |
|                                | `searchAccount`      |           |          |              |
|                                |                      |           |          |              |

### Main
| Members | Methods | Scenarios | Outcomes | User Stories |
|---------|---------|-----------|----------|--------------|
|         |         |           |          |              |
|         |         |           |          |              |
|         |         |           |          |              |
|         |         |           |          |              |
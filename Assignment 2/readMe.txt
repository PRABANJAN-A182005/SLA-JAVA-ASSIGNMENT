## 1. Scenario: Employee Salary Calculation

A company wants to calculate the monthly salary of its employees, including allowances and deductions.

Requirements:

1. Create a class `EmployeeSalary`.
2. Create a method `calculateSalary()` that accepts basic salary and allowance and returns the gross salary.
3. Create a method `calculateNetSalary()` that accepts gross salary and deductions and returns the net salary.
4. Create a method `displayDetails()` to display the employee name, gross salary, and net salary.
5. Call all methods from `main()` without using a constructor.

Sample input:

- Basic salary = ₹25,000
- Allowance = ₹5,000
- Deductions = ₹2,000

Expected output:

```
Gross Salary: 30000.0
Net Salary: 28000.0
```

## 2. Scenario: Student Result Calculation

A college wants to calculate students' results based on five subject marks.

Requirements:

1. Create a class `StudentResult`.
2. Create a method `calculateTotal()` that accepts five subject marks and returns the total.
3. Create a method `calculateAverage()` that accepts the total and returns the average.
4. Create a method `calculateGrade()` that accepts the average and returns a grade:
   - 90 and above: A
   - 75–89: B
   - 50–74: C
   - Below 50: Fail
5. Create a method to display the total, average, and grade.

Sample input: 85, 78, 92, 88, 77

Expected output:

```
Total: 420
Average: 84.0
Grade: B
```

## 3. Scenario: Shopping Cart Bill Calculation

An online shopping application calculates the final bill based on the purchase amount and membership type.

Requirements:

1. Create a class `ShoppingCart`.
2. Create a method `calculateTotal()` that accepts the prices of three products and returns the total.
3. Create a method `calculateDiscount()` that accepts the total and membership type. Apply:
   - Gold: 20% discount
   - Silver: 10% discount
   - Regular: 5% discount
4. Create a method `calculateFinalAmount()` that returns the amount after discount.
5. Create a method to display the total, discount, and final amount.

Sample input: ₹2,000, ₹1,500, ₹500; membership = Gold

Expected output:

```
Total Amount: 4000.0
Discount: 800.0
Final Amount: 3200.0
```

## 4. Scenario: Electricity Bill Calculation

An electricity board calculates a household bill based on units consumed.

Requirements:

1. Create a class `ElectricityBill`.
2. Create a method `calculateBill()` that accepts the number of units consumed and returns the bill amount using these slabs:
   - First 100 units: ₹2 per unit
   - Next 100 units: ₹3 per unit
   - Above 200 units: ₹5 per unit
3. Apply the rates progressively. For example, 250 units means 100 units at ₹2, 100 units at ₹3, and 50 units at ₹5.
4. Create a method `addFixedCharge()` that accepts the bill amount and adds a fixed charge of ₹50.
5. Create a method to display the final bill.

Sample input: 250 units

Expected output:

```
Energy Charge: 750.0
Fixed Charge: 50.0
Final Bill: 800.0
```

## 5. Scenario: Banking Operations

A bank needs a simple application to perform deposits, withdrawals, and balance checks.

Requirements:

1. Create a class `BankingOperations`.
2. Create a method `deposit()` that accepts the current balance and deposit amount and returns the updated balance.
3. Create a method `withdraw()` that accepts the current balance and withdrawal amount. If sufficient funds are unavailable, display an appropriate message.
4. Create a method `checkBalance()` that accepts the current balance and displays it.
5. Create a method `displayTransactionSummary()` that displays the deposit amount, withdrawal amount, and final balance.
6. Call all methods from `main()` without using constructors.

Sample input:

- Initial balance: ₹5,000
- Deposit: ₹2,000
- Withdrawal: ₹1,500

Expected output:

```
Initial Balance: 5000.0
Deposited: 2000.0
Withdrawn: 1500.0
Final Balance: 5500.0
```

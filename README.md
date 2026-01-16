# Class Assignment :

## Program 1 Documentation: Print Numbers from 1 to N (Using While Loop)

## Pseudo Code

START  
INPUT number  
IF number <= 0  
&nbsp;&nbsp;&nbsp;&nbsp;PRINT "Invalid input"  
ELSE  
&nbsp;&nbsp;&nbsp;&nbsp;SET i = 1  
&nbsp;&nbsp;&nbsp;&nbsp;WHILE i <= number  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PRINT i  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;i = i + 1  
&nbsp;&nbsp;&nbsp;&nbsp;END WHILE  
END IF  
END


---

## Trace Table

**Input:** `number = 4`

| Step | i | Condition (i ≤ number) | Output |
|------|---|------------------------|--------|
| 1    | 1 | true                   | 1      |
| 2    | 2 | true                   | 2      |
| 3    | 3 | true                   | 3      |
| 4    | 4 | true                   | 4      |
| 5    | 5 | false                  | Stop   |

---

## Test Cases

| Test Case | Input | Output         |
|----------|-------|-----------------|
| 1        | 5     | 1 2 3 4 5       |
| 2        | 1     | 1               |
| 3        | 0     | Invalid input   |
| 4        | -2    | Invalid input   |

---

## Program 2 Documentation: Print Numbers Between Two Integers (Using While Loop)

## Pseudo Code

START  
INPUT firstNumber  
INPUT secondNumber  

IF firstNumber > secondNumber  
&nbsp;&nbsp;&nbsp;&nbsp;PRINT "Invalid input"  
ELSE  
&nbsp;&nbsp;&nbsp;&nbsp;SET i = firstNumber  
&nbsp;&nbsp;&nbsp;&nbsp;WHILE i <= secondNumber  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PRINT i  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;i = i + 1  
&nbsp;&nbsp;&nbsp;&nbsp;END WHILE  
END IF  

END  

---

### Trace Table

**Input:**  
firstNumber = 3  
secondNumber = 7  

| Step | i | Condition (i ≤ secondNumber) | Output |
| ---- | - | ---------------------------- | ------ |
| 1 | 3 | true | 3 |
| 2 | 4 | true | 4 |
| 3 | 5 | true | 5 |
| 4 | 6 | true | 6 |
| 5 | 7 | true | 7 |
| 6 | 8 | false | Stop |

---

### Test Cases

| Test Case | Input (firstNumber, secondNumber) | Output |
| --------- | -------------------------------- | ------ |
| 1 | 1, 5 | 1 2 3 4 5 |
| 2 | 3, 3 | 3 |
| 3 | 5, 8 | 5 6 7 8 |
| 4 | 8, 5 | Invalid input |
| 5 | -2, 2 | -2 -1 0 1 2 |

---

## Program 3 Documentation: Print Numbers from n1 to n2 with Increment n3

## Pseudo Code

START  
INPUT n1  
INPUT n2  
INPUT n3  

IF n1 > n2  
&nbsp;&nbsp;&nbsp;&nbsp;PRINT "Invalid Input"  
ELSE  
&nbsp;&nbsp;&nbsp;&nbsp;SET i = n1  
&nbsp;&nbsp;&nbsp;&nbsp;WHILE i <= n2  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PRINT i  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;i = i + n3  
&nbsp;&nbsp;&nbsp;&nbsp;END WHILE  
END IF  

END  

---

## Trace Table

### Input:
n1 = 2  
n2 = 10  
n3 = 2  

| Step | i | Condition (i ≤ n2) | Output |
|------|---|--------------------|--------|
| 1    | 2 | true               | 2      |
| 2    | 4 | true               | 4      |
| 3    | 6 | true               | 6      |
| 4    | 8 | true               | 8      |
| 5    | 10 | true              | 10     |
| 6    | 12 | false             | Stop   |

---

## Test Cases

| Test Case | Input (n1, n2, n3) | Output |
|----------|--------------------|--------|
| 1 | 1, 5, 1 | 1 2 3 4 5 |
| 2 | 2, 10, 2 | 2 4 6 8 10 |
| 3 | 3, 15, 3 | 3 6 9 12 15 |
| 4 | 5, 3, 1 | Invalid Input |
| 5 | 4, 4, 1 | 4 |



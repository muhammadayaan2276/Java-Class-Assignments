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

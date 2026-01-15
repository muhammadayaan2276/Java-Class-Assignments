Pseudo Code:

START
INPUT number
IF number <= 0
    PRINT "Invalid input"
ELSE
    SET i = 1
    WHILE i <= number
        PRINT i
        i = i++
END IF
END

Trace Table:

input number = 4;

| Step | i | Condition (i ≤ number) | Output |
| ---- | - | ---------------------- | ------ |
| 1    | 1 | true                   | 1      |
| 2    | 2 | true                   | 2      |
| 3    | 3 | true                   | 3      |
| 4    | 4 | true                   | 4      |
| 5    | 5 | false                  | Stop   |


Test Cases:

| Test Case | Input | Output        |
| --------- | ----- | ------------- |
| 1         | 5     | 1 2 3 4 5     |
| 2         | 1     | 1             |
| 3         | 0     | Invalid input |
| 4         | -2    | Invalid input |


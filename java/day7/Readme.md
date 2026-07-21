# Java `String.format()` Notes

`String.format()` is used to **create a formatted string** by replacing placeholders (`%`) with values.

**Syntax**

```java
String result = String.format("format string", values);
```

Example:

```java
String name = "Rahul";
int age = 20;

String result = String.format("My name is %s and I am %d years old.", name, age);

System.out.println(result);
```

**Output**

```
My name is Rahul and I am 20 years old.
```

---

# General Format

```java
String.format("%[flags][width][.precision]conversion", value);
```

Example

```java
String.format("%10.2f", 123.456);
```

- Width = 10
- Precision = 2
- Conversion = `f`

---

# Important Conversion Specifiers

| Specifier | Meaning | Example |
|-----------|---------|---------|
| `%s` | String | `"Java"` |
| `%c` | Character | `'A'` |
| `%d` | Integer | `25` |
| `%o` | Octal Integer | `10` → `12` |
| `%x` | Hexadecimal (lowercase) | `255` → `ff` |
| `%X` | Hexadecimal (uppercase) | `255` → `FF` |
| `%f` | Floating point | `12.3456` |
| `%e` | Scientific notation | `1.23e+02` |
| `%E` | Scientific notation (uppercase) | `1.23E+02` |
| `%g` | Shortest floating representation | `123.45` |
| `%G` | Uppercase version of `%g` | |
| `%b` | Boolean | `true` |
| `%B` | Boolean (uppercase) | `TRUE` |
| `%h` | Hash code (hex) | |
| `%H` | Hash code (uppercase) | |
| `%%` | Percent sign | `%` |
| `%n` | New line | Platform-independent |

---

# `%s` → String

```java
String.format("Hello %s", "Java");
```

Output

```
Hello Java
```

---

# `%d` → Integer

```java
String.format("Age : %d", 21);
```

Output

```
Age : 21
```

---

# `%f` → Decimal Number

```java
String.format("%.2f", 45.6789);
```

Output

```
45.68
```

---

# `%c` → Character

```java
String.format("%c", 'A');
```

Output

```
A
```

---

# `%b` → Boolean

```java
String.format("%b", true);
```

Output

```
true
```

---

# `%x` → Hexadecimal

```java
String.format("%x", 255);
```

Output

```
ff
```

Uppercase

```java
String.format("%X", 255);
```

Output

```
FF
```

---

# `%o` → Octal

```java
String.format("%o", 10);
```

Output

```
12
```

---

# `%e` → Scientific Notation

```java
String.format("%e", 1234.56);
```

Output

```
1.234560e+03
```

---

# Width

Width means **minimum number of characters**.

```java
String.format("%10s", "Java");
```

Output

```
      Java
```

(6 spaces + Java)

---

# Left Alignment (`-` Flag)

```java
String.format("%-10s", "Java");
```

Output

```
Java
```

(Java followed by spaces)

---

# Zero Padding (`0` Flag)

```java
String.format("%05d", 25);
```

Output

```
00025
```

---

# Sign (`+` Flag)

```java
String.format("%+d", 25);
```

Output

```
+25
```

---

# Space Flag

```java
String.format("% d", 25);
```

Output

```
 25
```

Leaves one leading space for positive numbers.

---

# Comma Separator

```java
String.format("%,d", 1000000);
```

Output

```
1,000,000
```

---

# Parentheses for Negative Numbers

```java
String.format("%(d", -500);
```

Output

```
(500)
```

---

# Precision

Precision controls decimal places for floating-point numbers.

```java
String.format("%.3f", 12.34567);
```

Output

```
12.346
```

---

# Width + Precision

```java
String.format("%10.2f", 123.456);
```

Output

```
    123.46
```

---

# Multiple Values

```java
String name = "Rahul";
int age = 20;
double marks = 92.75;

String result = String.format(
    "Name: %s Age: %d Marks: %.2f",
    name,
    age,
    marks
);

System.out.println(result);
```

Output

```
Name: Rahul Age: 20 Marks: 92.75
```

---

# Argument Index

Reuse the same argument multiple times.

```java
String.format("%1$s scored %2$d. %1$s passed.", "Rahul", 95);
```

Output

```
Rahul scored 95. Rahul passed.
```

---

# Date & Time Formatting

```java
Date date = new Date();

String.format("%tF", date);
```

Example Output

```
2026-07-21
```

Common date specifiers:

| Specifier | Meaning |
|-----------|---------|
| `%tH` | Hour (00–23) |
| `%tM` | Minute |
| `%tS` | Second |
| `%tY` | Year |
| `%tm` | Month |
| `%td` | Day |
| `%tF` | yyyy-MM-dd |
| `%tT` | HH:mm:ss |

---

# Escape Percent Sign

```java
String.format("Discount: 20%%");
```

Output

```
Discount: 20%
```

---

# New Line

```java
String.format("Hello%nWorld");
```

Output

```
Hello
World
```

---

# Common Interview Examples

## Employee Details

```java
String name = "Aman";
int age = 24;
double salary = 45678.987;

System.out.println(
    String.format(
        "Name: %-10s Age: %3d Salary: %,.2f",
        name,
        age,
        salary
    )
);
```

Output

```
Name: Aman       Age:  24 Salary: 45,678.99
```

---

## Table Formatting

```java
System.out.printf("%-10s %-5s %-10s%n", "Name", "Age", "Marks");
System.out.printf("%-10s %-5d %-10.2f%n", "Rahul", 20, 95.50);
System.out.printf("%-10s %-5d %-10.2f%n", "Aman", 22, 88.75);
```

Output

```
Name       Age   Marks
Rahul      20    95.50
Aman       22    88.75
```

---

# Important Rules

- `%s` → String
- `%d` → Integer
- `%f` → Decimal/Floating point
- `%c` → Character
- `%b` → Boolean
- `%x` → Hexadecimal
- `%o` → Octal
- `%e` → Scientific notation
- `%%` → Print `%`
- `%n` → New line
- Width → Minimum field size
- Precision → Decimal places (or max string length with `%s`)
- `-` → Left align
- `0` → Zero padding
- `+` → Always show sign
- `,` → Thousand separator
- `(` → Show negative numbers in parentheses
- `%1$s`, `%2$d` → Argument indexing (reuse arguments)

---

# Formula to Remember

```
%[argument_index$][flags][width][.precision]conversion
```

Example:

```java
String.format("%1$-10.2f", 123.456);
```

Meaning:

- `1$` → First argument
- `-` → Left align
- `10` → Width = 10
- `.2` → Two decimal places
- `f` → Floating-point number

---

# Quick Cheat Sheet

| Pattern | Meaning |
|----------|---------|
| `%s` | String |
| `%d` | Integer |
| `%f` | Float |
| `%.2f` | 2 decimal places |
| `%10s` | Width 10 |
| `%-10s` | Left align |
| `%05d` | Zero padding |
| `%+d` | Show sign |
| `%,d` | Thousand separator |
| `%x` | Hexadecimal |
| `%o` | Octal |
| `%e` | Scientific notation |
| `%1$s` | First argument |
| `%%` | Percent sign |
| `%n` | New line |
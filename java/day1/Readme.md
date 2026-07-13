# Java

It is a multipurpose popular programing language. it is owned by oracle, created in 1995.

It is used for:
- Mobile Application
- Desktop Application
- Backend Development
- Games
- Database connection and much more.


## why use Java?

- It works on  different platforms
- Easy to learn and simple to use
- It is open sourse and free
- It supports object oriented programming

# variable 

- varialbes are the container which stores some data.

### Variable Declaration

- in java , we declare variable before it's use. Tocreate a variavble we mention the type of the value which we are going to store in the particular variable then we put the variable name and last we optionally assing the value to it.

syntax:

```


type variableName = value;
```

Example:

```

int a = 50;
string firstname;
```

### Final Variables

if we don't want to overwrite existing values, we use `final` keyword.

### Identifiers

The general naming rules of variable in java are:
- Names can contains letters, digits, undedrscores, and doller sign
- Names should start with a lowercase charecter and cannot contain whitespace.
- Names can also begin with $ and _
- Names are case sensitive
- Reserved keywords cannot be used as names.

### Java data types
**Primitive data types**: It is a type of variables that is getting stored or the kind of values it store.
- int (-2147483648 to 2147483647)
- float(sufficient for storing 6 to 7 decimal digit)
- char (ASCII charecter)
- double (sufficient for storing 15 to 16 decimal digit)
- short ( -32,768 to 32,767)
- bollean (Stores true or false values)
- long (Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
- byte (Stores whole numbers from -128 to 127)

**Non-Primitive data types**:
- string
- array
- classes

**Once a variable is declared with a type, it cannot change to another type later in the program.**

## Numbers 

- Integer Type: byte, short, int long
- Floating Point Types : float double


## Byte
- It is a data type that can store numbers from -128 to 127. This caan be useed instead of int or other types to save memory.

## int
- The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.

## Long
- The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
   - Example
long myNum = 15000000000L;
System.out.println(myNum);
## Short
- The short data type can store whole numbers from -32768 to 32767:

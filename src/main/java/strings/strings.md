# String
In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string. For example:

	char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
	String s=new String(ch); 
	
is same as:

	String s="javatpoint";  
	
Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.

*CharSequence Interface*

The *CharSequence* interface is used to represent the sequence of characters. **String**, **StringBuffer** and **StringBuilder** classes implement it. It means, we can create strings in Java by using these three classes.

The Java String is **immutable** which means it cannot be changed. Whenever we change any string, a new instance is created. For **mutable** strings, you can use StringBuffer and StringBuilder classes.

We will discuss immutable string later. Let's first understand what String in Java is and how to create the String object.

#What is String in Java?
Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.

#How to create a string object?
There are two ways to create String object:

1. *By string literal*
2. *By new keyword*

## String Literal
Java String literal is created by using double quotes. For Example:

	String s="welcome";  

Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:

	String s1="Welcome";  
	String s2="Welcome";//It doesn't create a new instance  
	
In the above example, only one object will be created. Firstly, JVM will not find any string object with the value "Welcome" in string constant pool that is why it will create a new object. After that it will find the string with the value "Welcome" in the pool, it will not create a new object but will return the reference to the same instance.

**Note**: String objects are stored in a special memory area known as the **"string constant pool"**.

### Why Java uses the concept of String literal?
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).

## By new keyword

	String s=new String("Welcome");  
	
In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in a heap (non-pool).

# Java String class methods

The java.lang.String class provides many useful methods to perform operations on sequence of char values.
1. 	**char charAt(int index)	It returns char value for the particular index**
2.  **int length()	It returns string length**
3.	static String format(String format, Object... args)	It returns a formatted string.
4.	static String format(Locale l, String format, Object... args)	It returns formatted string with given locale.
5.	**String substring(int beginIndex)	It returns substring for given begin index.**
6.	**String substring(int beginIndex, int endIndex)	It returns substring for given begin index and end index.**
7.	**boolean contains(CharSequence s)	It returns true or false after matching the sequence of char value.**
8.	static String join(CharSequence delimiter, CharSequence... elements)	It returns a joined string.
9.	static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)	It returns a joined string.
10.	**boolean equals(Object another)	It checks the equality of string with the given object.**
11.	**boolean isEmpty()	It checks if string is empty.**
12.	String concat(String str)	It concatenates the specified string.
13.	**String replace(char old, char new)	It replaces all occurrences of the specified char value.**
14.	**String replace(CharSequence old, CharSequence new)	It replaces all occurrences of the specified CharSequence.**
15.	**static String equalsIgnoreCase(String another)	It compares another string. It doesn't check case.**
16.	String[] split(String regex)	It returns a split string matching regex.
17.	String[] split(String regex, int limit)	It returns a split string matching regex and limit.
18.	String intern()	It returns an interned string.
19.	**int indexOf(int ch)	It returns the specified char value index.**
20.	**int indexOf(int ch, int fromIndex)	It returns the specified char value index starting with given index.**
21.	int indexOf(String substring)	It returns the specified substring index.
22.	int indexOf(String substring, int fromIndex)	It returns the specified substring index starting with given index.
23.	**String toLowerCase()	It returns a string in lowercase.**
24.	String toLowerCase(Locale l)	It returns a string in lowercase using specified locale.
25.	**String toUpperCase()	It returns a string in uppercase.**
26.	String toUpperCase(Locale l)	It returns a string in uppercase using specified locale.
27.	**String trim()	It removes beginning and ending spaces of this string.**
28.	static String valueOf(int value)	It converts given type into string. It is an overloaded method.

# Converting String to numbers
	int valueI = Integer.parseInt("String obj representing number");
	double valueD = Double.parseDouble("String obj representing number with decimal");
	

# Converting number to String
	String result1 = 1+"";
	String result2 = 1.5+"";
	
---
description: Introduction to operators in Kotlin.
---

# Operators

Now that we covered variables and data types, lets get into operators. The purpose of an operator is to manipulate a value in terms of another value or itself. Operators are fairly easy to understand because you've likely come across most of them in math classes. Here is a list of some basic operators that you can use.

#### Arithmetic Operators

These operators are binary, meaning they take two values. For instance, to use the `+` operator you would do `5 + 5`. Although mostly just for math, there are other uses for some of these too, which will be discussed later. The type of the result of performing arithmetic operations depends on the types being operated on.

* `+` - Adds two numbers. Can also combine two strings.
* `-` - Subtracts a number from another.
* `*` - Multiplies two numbers.
* `/` - Divides a number by another.
* `%` - Used to get the remainder of a division problem, this is the **modulus** operator.

Here's an example of how one might use these operators.

```kotlin
val x = "Hello " + "world" // equals "Hello world", same as `val x = "Hello world"
val y = 11 % 2 // equals 1, same as `val y = 1`
val z = 3 * 3 // equals 9, same as `val z = 9`
```

#### Comparison Operators

Comparison operators are binary like arithmetic operators, but they return `Boolean` values instead of numbers; `true` if the statement is true, and `false` if it is not. They are used to compare numbers and sometimes other values.

* `==` - Checks if two values are equal. This works for more than just numbers.
* `!=` - Checks if two values are not equal. This also works for more than numbers.
* `<` - Checks if a number is less than another.
* `>` - Checks if a number is greater than another.
* `<=` - Checks if a number is less than or equal to another.
* `>=` - Checks if a number is greater than or equal to another.

An example of comparison operators:

```kotlin
val x = 6 == 6 // equals true
val y = 4 < 2 // equals false
val z = "foo" != "bar" // equals true
```

#### Logical Operators

There are three very useful logical operators. They work with `Boolean` values, and return a new `Boolean`. Two are binary, but one is **unary**, meaning it only takes one value. To use a unary operator, you place the operator to the left or right of the value, depending on the operator.

* `&&` - The _and_ operator. Returns `true` if the booleans on either side are both `true`, and `false` otherwise.
* `||` - The _or_ operator. Returns `true` if either one of the booleans are `true`, and `false` if they are both `false`.
* `!` - The _not_ operator. Returns `true` if used on `false`, and `false` if used on `true`.

Here are logical operators in action:

```kotlin
val x = true && false // equals false
val y = true || false // equals true
val z = !false // equals true
```

### Your Turn

So much info! We need an exercise! Quick!

1. Open up `src/main/kotlin/part1/Operators.kt`.
2. Declare two variables containing numbers. They can be whatever you want.
3. Use `println(...)` to log some operation between these numbers to the console. Try experimenting

   with different numbers and different operators.

4. Now, mix them up. Use comparison operators to get two `Boolean` values from your numbers, and

   then a logical operator to operate on the booleans.

5. Finally, try using `+` on two `String` values, and print the result to the console.

Now, so far we really only know enough to make programs that follow a single course of action no matter what. Now, if that's all that programming could accomplish, we may as well just make a video instead. However, there is another concept in programming called _control flow_ that allows us to make decisions, and this is what we will begin with in **part 2**. Stay tuned!


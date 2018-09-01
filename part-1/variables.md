---
description: Introduction to variables in Kotlin
---

# Variables

Let's dive in further.

One of the most fundamental concepts in programming is called a **variable**. Variables are what allow programmers like you to store information throughout their code. Here's what **declaring** \(or setting the value of\) a variable looks like in Kotlin:

```kotlin
var teamName = "SERT"
```

Now lets break this down. The `var` **keyword** \(a specific word or command which tells the computer what you're doing\) is used whenever you want to make a new variable that can change later. The `teamName` is just the name of the variable. The equal sign `=` means that we want to give the variable a value, and `"SERT"` is the value that we are assigning to the variable.

Now lets look at another example:

```kotlin
val teamNumber = 2521
```

There are a few differences in this example to explain. The most obvious one is that instead of `var`, our variable is declared with `val`. The difference between `var` and `val` is that a variable declared with `var` can be changed later, but a variable declared with `val` cannot. Trying to change a variable declared with `val` will result in errors when trying to run your program. Another difference is the **type** of value we assign the variable. In the previous example, we assigned a string to the variable, but here we assign a number. Note that there are no quotations around the number. Numbers do not need quotation marks.

Well, if a variable declared with `var` can change, how do we change it? Good question! To change the value of a variable, just do something like this:

```kotlin
var willChange = "I won't be set to this for long."
willChange = "I changed!"
```

This is called **reassigning** a variable. Note that you do not have to use the `var` keyword again, you must only use it when you first declare the variable. Also note that you cannot set a variable to a different type. For example, you cannot assign a variable that was originally storing a string to later be a number. You'll learn more about data types in the next lesson.

#### Your Turn

1. Open up `src/main/kotlin/part1/Variables.kt`.
2. In the main function, declare a new variable with `var`. It can store whatever whatever you want.
3. On the next line, put the name of your variable inside a `println(...)`. Run the program. Were 

   you surprised?

4. Next, reassign the variable to a different value, and then put it inside `println(...)` again.

   Run the program again.

5. Finally, change the `var` to `val` and try to run the program. Did it work?

That last instruction should have caused an error. It's impossible to reassign a variable declared with the `val` keyword. Variables are some of the most useful tools in any programming language, as they let us store and use data within a program, even if we don't exactly know what it will be. Next, we will discuss data types.


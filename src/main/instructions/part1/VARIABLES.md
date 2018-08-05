# Part 1
## Variables

Well, now that your introduced, lets dive in to learning to code in Kotlin!

One of the most basic concepts in programming is called a *variable*. Variables are what allow
programmers to store information throughout their code. Here's what declaring a variable looks
like in Kotlin:

```
var teamName = "SERT"
```

Now lets break this down. The `var` keyword is used whenever you want to make a new variable that
can change later. The `teamName` is just the name of the variable. The equal sign `=` means that
we want to assign the variable a value, and the `"SERT"` is just the value we are assigning a
variable.

Now lets look at another example:

```
val teamNumber = 2521
```

There are a few differences in this example to explain. The most obvious one is that instead of
`var`, our variable is declared with `val`. The difference between `var` and `val` is that a
variable declared with `var` can be changed later, but a variable declared with `val` cannot.
Another difference is the type of value we assign the variable; before we assigned a string
to the variable, but here we assign a number. Note that there are no quotations around the number.
Numbers do not need quotations.

Well, if a variable declared with `var` can change, how do we change it? Simple, we would just do
something like this:

```
var willChange = "I won't be set to this for long."
willChange = "I changed!"
```

This is called *reassigning* a variable. Note that you do not have to use the `var` keyword again. 
Also note that you cannot set a variable to different type. For instance, you cannot assign a
variable that was storing a string to a number. You'll learn more about data types in the next 
lesson.

### Your Turn

1. Open up `src/main/kotlin/part1/Variables.kt`.
2. In the main function, declare a new variable with `var`. It can store whatever whatever you want.
3. On the next line, put the name of your variable inside a `println(...)`. Run the program. Were 
you surprised?
4. Next, reassign the variable to a different value, and then put it inside `println(...)` again.
Run the program again.
5. Finally, change the `var` to `val` and try to run the program. Did it work?

The next lesson is `src/main/instructions/part1/DATA_TYPES.md`.

---
description: Introduction to control flow
---

# Control Flow

Hello! Welcome back to SERT's self guided programming module. Lets get started right away with control flow.

Consider the code we have written so far. Inside of the main function, all our code runs linearly. In other words, Kotlin executes one instruction after the other, from top to bottom no matter what. However, all this can change when we add in something called **control flow**. Control flow is essentially what allows any program to make decisions. Lets cover some basic control flow; `if` and `else` statements and while `while` and `do while` loops.

### If and else statements

`if` statements allow us to run code only under certain conditions. For instance:

```text
if (7 < 2) {
    println("Seven is less than two!")
}
```

That's it. Inside the parenthesis, we put a condition which must be of type `Boolean`. If the condition is `true`, then the code inside the brackets runs. If it is `false`, it doesn't. Note that you can also add an additional `else` statement, like this:

```text
if (5 is String) {
    println("Five is a String? What?")
} else {
    println("Ha! Five isn't a String, just as I thought.")
}
```

As you may have guessed, the `else` branch's block of code will run when the condition in the parenthesis is `false`.

### While and do while loops

`while` loops allow you run code over and over again as long as a condition is `true`. Here is a basic example:

```text
while (coding) {
    println("While loops are used often!")
}
```

As you can see, `while` loops are structured similar to an `if` statement. The only difference is that rather than running the code once and then moving on, a while loop will run the code in the brackets again and again as long as the condition in the parenthesis remains `true`.

But what if you need the code to run at least once no matter what? While this could be achieved using the logical `&&` operator and a variable, there is actually a feature built into the language that allows you to achieve this in a concise way, and it's called the `do while` loop. `do while` loops are structured in a way  that's a bit different than a while loop, but they are still pretty simple. Here's one:

```text
do {
    println("Let's wash this car!") // Wash the car at least once
} while (dustyCrusty) // If it's still dusty crusty, keep doing it until it isn't
```

The only difference here is that the code in the brackets will always run at least once, even if the condition is `false`.

{% hint style="warning" %}
Careful! When using while loops, it is important to make sure that your loop is able to end somehow. Oftentimes an out of control `while` loop can make your computer freeze up or cause your program to crash.
{% endhint %}

## Your turn

Are you ready for some exercises?

1. Open up `src/main/kotlin/part2/ControlFlow.kt`.
2. Declare a variable named whatever you want, and set it to `0`. Make sure to declare it using `var`.
3. Now inside the `main` function, write an `if` statement with an `else` branch. Inside the parenthesis, check weather the number is less than some other number or not. In the brackets, print something to the console, but make sure you print something different in both brackets so you can tell which block of code ran.
4. Run the code. Did it do what you expected?
5. Now, after the if statement, write a `while` loop. Inside the parenthesis, check whether or not your variable is less than 10. Inside the brackets, print the value of your variable to the console. Then, add `1` to the your variable. The shorthand way to do this is by calling `myVariable++`.
6. Run the program once more.

That last instruction should have printed the numbers 0 through 9 to the console. This is because every time the loop ran, it printed the value of your variable to the console, and then added one more to the variable. Once the variable ceased to be less than ten, though, the while loop's condition was no longer true, and so the program ended.

We're actually not done with control flow entirely, and we will cover the rest in a later lesson. In the meantime, though, head over to the next lesson to learn about **functions**!




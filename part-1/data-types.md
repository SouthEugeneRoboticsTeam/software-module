---
description: Introduction to data types in Kotlin.
---

# Data Types

In the previous lesson, you learned how to assign a variable. Well, what you didn't know is that when you assigned those variables they were implicitly assigned types as well. If your variable was a string \(using quotation marks\), then it had the type `String`. If it was a number, then it probably had the type `Int`, or `Double` if the number contained a decimal. Or maybe `Long` if it was a really big number. There are a lot of number types. Anyways, here is a list of the most basic types in Kotlin.

* `String` - Used to store text. We already learned about this one!
* `Char` - A character, like 'a' or 'b'. Create one using **single quotes** `'...'`. 
* `Int` - An integer. Used to store numbers of reasonable size.
* `Long` - A big integer. No surprises here, a `Long` is... long. Used to store very large 
  numbers.  
* `Float` - A **floating point** number. Used to store numbers with decimals that do not need
  much accuracy. To create one, write a number followed by an 'F', like this: `1.5F`
* `Double` - A more precise floating point number. Used more often than `Float` because it is, well, double the precision. Create one by adding a decimal after a number, like this: `18.` or `8928.0` or `2.82376437`
* `Boolean` - Possibly the most essential data type there is, a `Boolean` is either `true` or 
  `false`. Note that like numbers, `true` and `false` do not need quotation marks.

That should be enough to keep us busy, right? So lets look at how we can apply these types to our programs. Here is an example of setting a variable, but rather than letting Kotlin imply the type, we tell it exactly what type we want it to be.

```kotlin
val sertIsAwesome: Boolean = true
```

There's some new syntax here that we need to cover. Notice that after the variable's name, we have a colon `:` followed by the type of the variable, `Boolean`. After that, we have the `=` and then the value like usual. Here are some more examples:

```kotlin
val firstLetterOfSert: Char = 'S'
val pi: Float = 3.14F
val sertIsNotCool: Boolean = false
```

Note that in any of these examples, we could have just as easily declared the variable without a type because Kotlin is smart enough to interpret the type for us if we don't specify one. The purpose of types is to make sure certain values can only be used for certain things. For instance, it would not make much sense to try to add `3` to `false`

#### Your Turn

1. Open `src/main/kotlin/part1/DataTypes.kt`.
2. Explicitly make the variable `name` a `String`, and assign it to your name.
3. Use `println(...)` to print it's value to the console. Run the program.
4. After the `name` variable inside `println(...)`, type `is String`. What do you think will
   happen? Run the program.
5. This time, put `is Boolean` after the variable, and run it again. What was the result?

Wasn't that neat? The console should have printed `true` for `name is String` and `false` for `name is Boolean`. The `is` keyword, as we just observed, can be used to check whether or not a variable is a certain type. The result of using an `is` statement is `true` or `false`, making it a... `Boolean`! Every time something has a value in Kotlin, it has a data type. Remember, a data type is just a way for the language to know what a variable can and cannot be used for, so try not to think about it too much.

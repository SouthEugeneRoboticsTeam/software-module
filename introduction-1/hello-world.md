---
description: Introduction to programming and the Kotlin language
---

# Hello, world!

Hey y'all! Welcome to SERT's programming module, designed to get you ready to program a robot with Kotlin. Kotlin is the programming language that SERT uses program it's robots.

Anyway, programming can often seems daunting when you look at page full of foreign-looking text, so lets start with a really basic example - all it will do will to say "Hello, world!" to the user.Well, here it is in Kotlin: 

```kotlin
fun main(args: Array<String>) {
    println("Hello, world!")
}
```



Even this can look a bit daunting, so just focus on what's inside the brackets `{ ... }` for now.`"Hello, world!"` is a string. In programming, the word 'string' just means a string of text. Notice the quotation marks `"..."`: all strings have quotation marks around them. As for `println(...)`, that just prints to the console whatever is inside it. So `println("Hello, world!")` just means to print "Hello, world!" to the console. Now that isn't too bad! Now, take a look at `fun main(args: Array<String>) { ... }`. This is called the 'main function'. You don't have to understand this yet, but it is important to note that all code must go inside the brackets here.

#### Your Turn

1. Look at the file `src/main/kotlin/introduction/HelloWorld.kt`. If you haven't already, double-click on it to open it up.
2. Look at the little green triangle next to the main function. Click on it to run the program.
3. Try editing what is between the quotation marks. How does it affect the program?




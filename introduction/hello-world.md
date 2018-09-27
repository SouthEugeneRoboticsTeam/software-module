# Hello, world!

Welcome to SERT's programming module, designed to get you ready to program a robot with Kotlin. Kotlin is the programming language that SERT uses program it's robots. While it isn't the most widely used language, its sister language, Java, is potentially the most well-known programming language in existence. 

Programming can often seems daunting when you look at pages full of foreign-looking text, so lets start with a really basic example - all it will do will do is display the words "Hello, world!" to the person running the program. Here is how you would write that code in Kotlin:

```kotlin
fun main(args: Array<String>) {
    println("Hello, world!")
}
```

From this short chunk of code, you can likely make inferences about what each line's purpose is. However, let's go through the lines one-by-one to make sure everything is crystal clear. This code can look a bit daunting to those new to programming, so just focus on what's inside the **brackets** \(`{ ... }`\) for now.`"Hello, world!"` is a **string**. In programming, the word "string" just means a bunch of letters that come together to form a word, phrase, sentence, essay, book, etc. Notice the quotation marks `"..."`: all strings have quotation marks around them. As for `println(...)`, that displays whatever is inside of it to the **console** \(where you run the program and can see the code's output from\). So `println("Hello, world!")` just means to **print** \(or display\) "Hello, world!" to the console. Now, take a look at `fun main(args: Array<String>) { ... }`. This is called the **main function**. You don't have to understand this yet, but it is important to note that in a typical program, all of your code must go inside the brackets here.

#### Your Turn

1. Look at the file `src/main/kotlin/introduction/HelloWorld.kt`. If you haven't already, double-click on it to open it up.
2. Look at the little green triangle next to the main function. Click on it to run the program.
3. Try editing what is between the quotation marks. How does it affect the program?




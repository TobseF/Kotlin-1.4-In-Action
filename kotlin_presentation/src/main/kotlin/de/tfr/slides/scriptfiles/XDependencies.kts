/*
This is an example script with declared maven dependencies.
To run it use:
`kotlinc -v -cp kotlin-main-kts-1.3.30.jar -script Dependencies.kts`
Unfortunately this doesn't work for me. So I submitted a bug for this:
https://youtrack.jetbrains.com/issue/IDEA-211361

@file:Repository("https://jcenter.bintray.com")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-html-jvm:0.6.11")

import org.jetbrains.kotlin.script.util.DependsOn
import org.jetbrains.kotlin.script.util.Repository

import kotlinx.html.*
import kotlinx.html.stream.*

print(createHTML().html {
    body {
        h1 { +"Hello, World!" }
    }
})

println("Hello, World!")
*/


/*
This is an example script with declared maven dependencies.
Run with IDE or with installed Kotlin compiler:
`kotlinc -v -cp kotlin-main-kts.jar -script HtmlByDependcy.main.kts`
*/

@file:Repository("https://jcenter.bintray.com")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.2")

import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.html
import kotlinx.html.stream.createHTML

print(createHTML().html {
    body {
        h1 { +"Hello, World!" }
    }
})

println("Hello, World!")



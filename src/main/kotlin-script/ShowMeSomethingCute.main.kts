val url = "https://pixabay.com/images/search/kitten/"
openBrowser(url)

/**
 * Opens a Browser on Windows.
 */
fun openBrowser(url: String) {
    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url)
}

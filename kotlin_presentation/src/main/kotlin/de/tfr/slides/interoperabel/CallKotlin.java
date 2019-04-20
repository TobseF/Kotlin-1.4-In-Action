package de.tfr.slides.interoperabel;


public class CallKotlin {

    public static void main(String... args) {
        callKotlinStringExtension();
        callKotlinService();
        callKotlinDomain();
    }

    private static void callKotlinDomain() {
        Contact contact = new Contact("Thomas", "Anderson");
        System.out.println(contact);
    }

    private static void callKotlinService() {
        NewKotlinService ourNewFeature = new NewKotlinService();
        ourNewFeature.sendSlackMessageToAllOurCustomers("We introduced NetID oAuth!");
    }

    private static void callKotlinStringExtension() {
        String htmlSnipped = "<h1>Kotlin Presentation</h1>";
        String title = KotlinStringUtilsKt.between(htmlSnipped, "<h1>", "</h1>");
        System.out.println(title);
    }
}

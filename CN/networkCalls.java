package CN;

import java.net.http.*;
import java.net.URI;

public class NetworkCalls {
    public static void main(String[] args) throws Exception{
        System.out.println("Namaskara");
        makeAHTTPRequestPrintResponse();
    }
    public static void makeAHTTPRequestPrintResponse() throws Exception
    {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest req = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")).GET().build();
        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: " + resp.statusCode());
        System.out.println("Headers: " + resp.headers());
        System.out.println("Body: " + resp.body().substring(0, 120));

        // HttpClient (client) = the caller/phone (sends the request),
        // HttpRequest (req) = what you ask for (the message you place on the call),
        // HttpResponse (resp) = what the server answers.
    }

}

// Start Program: Your main method begins.

// Print "Namaskara": The first thing it does is print your greeting.

// Create HttpClient: It then calls your makeAHTTPRequestPrintResponse method, which first builds the reusable client object.

// Build HttpRequest: It creates the request, telling the client what to get (the GET method) and where to get it from (the URI).

// Send Request & Wait: This is the most important step. The code client.send(...) pauses your program and makes the actual network call. It waits until the server jsonplaceholder.typicode.com sends a response back.

// Receive HttpResponse: The response from the server is captured in the resp variable.

// Print Status Code: The program continues and prints the status (like 200 for "OK").

// Print Headers: It prints the metadata (like "Content-Type").

// Print Body: It prints the actual JSON data it received from the server.

// End Program: Both methods are finished, and the program stops.

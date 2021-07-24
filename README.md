# ZemChallenge

This app present a list of post and its comments. You can delete an post by swiping to the right, you ca refresh the posts, you can delete all post, and you can set as favorite. 

To run the app, simply build the app and install de app in your device.

Used Clear Architecture to separate the  business logic to the framework logic. In the framework layer I used MVP architecture.

Libraries used:
- Room: To cache the post. It is pretty simple to setup and to use.
- Retrofit: To retrieve the post from a repository.
- Dagger: To implement dependency Injection.

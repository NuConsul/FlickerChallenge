package com.chemwater.flickerchallenge;

public class ResearchQuestions {
}




/*
1. How to implement the 4 observables.

Flowable:
You can create a Flowable using Flowable.create().


Single:
You can create a Single using Single.create() and passing it a onSubscribe value.


Maybe:
You can create a Maybe by implementing a Maybe observer that will have one or more of the 4 main observable
methods implemented.



Completable:
You can create a Completable by using the Completable.create() method and passing it a onSubscribe value.



2. The difference in the 4 observables.

Flowable: flowable is implemented in cases where the Observable is emitting huge values
which can not all be consumed by the Observer.

Single: is implemented when the Observable has to emit only a single value like a response from a network
call.

Maybe: is implemented when the Observable has to emit a value or may not emit any value at all.

Completable: is implemented when the Observable has to do some task without emitting a value.


3. How to implement the RXJava Map and FlatMap.
You will implement the RXJava Map by calling the map method on your observable. Which will take
a custom class as a parameter which will have User information as a generic parameterized type, and
a user will be returned.

You will implement the RXJava FlatMap by calling the flatmap method on your observable. Which will take
a custom class as a parameter which will have user details as a generic parameterized type, and a
custom method will be returned.


4. The difference in map vs flatmap
The map operator applies a function of your choosing to each item emitted by the source Observable,
and returns an Observable that emits the results of these functions applications.

The Flatmap operator transforms an Observable by applying a function that you specify to each item emitted by the
source Observable, where that functions returns an Observable that itself emits items.

5. What are hot and cold observables.
Hot observables are close over external data producers.
Cold observables are observables that run their sequence when and if they are subscribed to.
 */
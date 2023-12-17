package com.example.reactor;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactorTest {

    @Test
    void helloReactorTest() {
        Flux<String> sequence = Flux.just("Hello", "Reactor");
        sequence.map(data -> data.toLowerCase())
                .subscribe(data -> System.out.println(data));
    }

    @Test
    void helloMono() {

        Mono.just("Hello Mono")
                .subscribe(data -> {
                            System.out.println("# onNext Signal");
                            System.out.println(data);
                        },
                        error -> {
                            System.out.println("# onError Signal");
                            System.out.println(error.getMessage());
                        },
                        () -> {
                            System.out.println("# onComplete Signal");
                        });
    }
}

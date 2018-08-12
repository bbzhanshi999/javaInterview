package com.other.reactive;

import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;

public class ReactiveTest {

    public static void main(String[] args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        MySubscriber<String> mySubscriber = new MySubscriber();
        publisher.subscribe(mySubscriber);

        System.out.println("publishing items");

        Arrays.asList("1","x","y","new").stream().forEach(i->publisher.submit(i));
        publisher.close();
    }
}

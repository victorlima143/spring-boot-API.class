package com.aulaamigos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication//ler sobre todas as Syntax
@RestController//ler
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")//ler syntax
    public GreetResponse greet() {
        GreetResponse response = new GreetResponse(
                "hello",
                List.of("java", "Golang", "Javascript"),
                new Person("Victor", 23, 30_000)
        );
        return response;
    }

    record Person(String name, int age, double savings) {

    }

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ) { }


}
//     static class GreetResponse {
//         private final String greet;
//
//         GreetResponse(String greet){
//             this.greet = greet;
//         }
//
//         public String getGreet() {
//             return greet;
//         }
//
//         @Override
//         public String toString() {
//             return "GreetResponse{" +
//                     "greet='" + greet + '\'' +
//                     '}';
//         }
//
//         @Override
//         public boolean equals(Object o) {
//             if (this == o) return true;
//             if (o == null || getClass() != o.getClass()) return false;
//             GreetResponse that = (GreetResponse) o;
//             return Objects.equals(greet, that.greet);
//         }
//
//         @Override
//         public int hashCode() {
//             return Objects.hashCode(greet);
//         }
//     }
//


package org.example;

import java.util.Scanner;

public class PersonController {
    public static void main(String[] args) {
        
        PersonService personService = new PersonService();
        FriendService friendService = new FriendService();
        LikeService likeService = new LikeService();
        PhotoService photoService = new PhotoService();

        Scanner scanner= new Scanner(System.in);

        while (true) {
            try {
                var line = scanner.nextLine().split(" "); // addd 20 name name
                switch (line[0]) {
                    case "1" -> System.out.println();
                    case "add" -> personService.addPerson(Integer.parseInt(line[1]), line[2],
                                                                    Integer.parseInt(line[3]));
                    default -> System.out.println("Not found actio");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

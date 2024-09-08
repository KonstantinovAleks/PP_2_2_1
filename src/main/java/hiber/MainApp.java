package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      User user1 = new User("Oleg", "Olegov", "ol_ol@mail.ru");
      User user2 = new User("Petr", "Petrov", "pet_pet@gmail.ru");
      User user3 = new User("Ivan", "Ivanov", "iv_iv@mail.ru");
      User user4 = new User("Andrey", "Angreev", "an_an@gmail.ru");
//      User user5 = new User("Andr", "Angr", "anndr_anandr@gmail.ru");

      Car car1 = new Car("Reno", 111);
      Car car2 = new Car("Pego", 222);
      Car car3 = new Car("Reno", 333);
      Car car4 = new Car("Reno", 444);
//      Car car5 = new Car("RenoPego", 555);

      user1.setCar(car1);
      user2.setCar(car2);
      user3.setCar(car3);
      user4.setCar(car4);
//      user5.setCar(car5);

      userService.add(user1);
      userService.add(user2);
      userService.add(user3);
      userService.add(user4);
//      userService.add(user5);

//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }

//      System.out.println("Пользователь с выбранной моделью и серией машины " + userService.getUserByCarModelAndSeries("Reno", 111));
      System.out.println(user3);

      context.close();
   }
}

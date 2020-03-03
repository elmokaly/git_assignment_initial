import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

      while (true) {
          ThreadSubscriber subscribers[] = {
                  new SphereCircumference(),
                  new multiplicationSeries(),
                  new BallVolume(),
                  new twoPowerN(),
                  new Fibonacci(),
                  new SphereArea(),
          };

          Topic mathTopic = new Topic();
          for (ThreadSubscriber sub : subscribers) {
              mathTopic.addSubscriber(sub);
              sub.setTopic(mathTopic);
          }
          Scanner sc = new Scanner(System.in);
          String input = sc.nextLine();
          mathTopic.setInput(input);
          mathTopic.dispatchEvent();
      }
  }
}

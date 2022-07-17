package java_lesson_9;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.toString());//toString - для строкового представления объекта (класс объекта + имя+ хэшкод(обычное число int)
        User user1 = new User();
        System.out.println(user1.equals(user));// сравнивает 2 объекта(false, ибо хэшкод разный)
    }
}

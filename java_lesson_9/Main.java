package java_lesson_9;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.toString());//toString - ��� ���������� ������������� ������� (����� ������� + ���+ ������(������� ����� int)
        User user1 = new User();
        System.out.println(user1.equals(user));// ���������� 2 �������(false, ��� ������ ������)
    }
}

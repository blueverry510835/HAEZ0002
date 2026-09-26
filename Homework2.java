import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String input = sc.nextLine();

            Student s = new Student();
            s.setter(input);

            students[i] = s;
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println((i + 1) + "번째 학생: " + s.getter());
        }

        sc.close();
    }
}

class Student {
    private int schoolID;
    private String name;
    private String sub;
    private long phonnum;

    public Student() {
    }


    public void setter(String input) {
        String[] words = input.split(" ");
        this.schoolID = Integer.parseInt(words[0]);
        this.name = words[1];
        this.sub = words[2];

        String phonestr = words[3];
        if (phonestr.startsWith("0")) {
            phonestr = phonestr.substring(1);
        }
        this.phonnum = Long.parseLong(phonestr);
    }


    public String getter() {
        String a = Long.toString(phonnum);

        while (a.length() < 10) {
            a = "0" + a;
        }
        String full = "0" + a;

        String b = full.substring(0, 3) + "-"
                + full.substring(3, 7) + "-"
                + full.substring(7, 11);

        return schoolID + " " + name + " " + sub + " " + b;
    }
}
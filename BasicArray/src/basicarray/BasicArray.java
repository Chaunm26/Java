package basicarray;

public class BasicArray {

    public static void main(String[] args) {
        arrObject();
    }

    public static void arrObject() {
        Student[] a = new Student[2];
        a[0] = new Student("SE180004", "Minh", 2000, 7);
        a[1] = new Student("SE180005", "Hoang", 2003, 5);
        for (Student x : a) {
            x.showProfile();
        }

    }
}

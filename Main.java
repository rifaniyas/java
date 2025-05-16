package rifa;

interface Student {
    int score = 25;
    void displayscore();
}

interface Sports {
    int score = 10;
    void sportsscore();
}

class Result implements Student, Sports {
    public void displayscore() {
        System.out.println(Student.score);  
    }

    public void sportsscore() {
        System.out.println(Sports.score);
    }
}

class Main {
    public static void main(String[] args) {
        Result ob = new Result();
        ob.displayscore();
        ob.sportsscore();
    }
}


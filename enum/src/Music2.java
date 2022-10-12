public enum Music2 {
    //сталі записуються з великої лтери
    CLASSIC(3,"cl"){
        @Override
        public String toString() {
            return "music of the past that has stood the test of time and has an audience in today's society.";
        }

    },
    ROCK(5,"rk"),
    POP(10,"pp");
    private int i;
    private String name;

    Music2(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    //створення методів
    void m(){
        System.out.println("Music is the art of organizing musical sounds, primarily in time, pitch and timbre scales.");
    }
}

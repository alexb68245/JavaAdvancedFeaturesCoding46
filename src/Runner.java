public enum Runner {
    BEGINNER(100, 160),
    INTERMEDIATE(70,99),
    ADVANCED(30,69);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime){
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time){
        if (time <= ADVANCED.maxTime){
            return ADVANCED;
        }else if (time >= INTERMEDIATE.minTime && time <= INTERMEDIATE.maxTime){
            return INTERMEDIATE;
        }
        else {
            return BEGINNER;
        }
    }


    public static void main(String[] args) {
        System.out.println(getFitnessLevel(79));
    }
}

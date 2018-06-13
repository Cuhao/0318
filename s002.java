class Person{
    private String name;
    private int[] scores = new int[5];
    public Person(String name1, int chinese, int english, int math){
        this.name = name1;
        this.scores[0] = chinese;
        this.scores[1] = english;
        this.scores[2] = math;
        this.scores[3] = scores[0] + scores[1] + scores[2];
        this.scores[4] = Math.round(scores[3] / 3);
    }
    public void setName(String name1){
        this.name = name1;
    }
    public String getName(){
        return this.name;
    }
    public void setChineseScore(int val){
        this.scores[0] = val;
    }
    public void setEnglishScore(int val){
        this.scores[1] = val;
    }
    public void setMathScore(int val){
        this.scores[2] = val;
    }
    public int getChineseScore(){
        return this.scores[0];
    }
    public int getEnglishScore(){
        return this.scores[1];
    }
    public int getMathScore(){
        return this.scores[2];
    }
    public int getAvgScore(){
        return this.scores[4];
    }
    public int getSumScore(){
        return this.scores[3];
    }
    public void show(){
        System.out.println( "Name: "+this.getName()
                // +"\nSex: "+this.getSex()
                +"\nChinexe: "+getChineseScore()
                +"\nEnglish: "+this.getEnglishScore()
                +"\nMath: "+this.getMathScore());
    }
}

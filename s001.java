import java.util.Scanner;

public class s001 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int op, val1;

        Person person[] = new Person[3];
        boolean flag = true;
        for(int i = 0;i<3;i++){
            person[i] = new Person(scn.next(), scn.nextInt(), scn.nextInt(), scn.nextInt());
            person[i].show();
            if (i==3){
                System.out.println("0:離開\n+1:某人總成績+\n+");
            }
        }


        while(flag){
            System.out.println();
            System.out.println("0:離開\n1:某人總成績\n2:某人總平均\n3:全部總分和平均\n4:科目平均");
            op= scn.nextInt();
            switch(op){

                case 0: // exit system  System.out.println("0:離開\n+1:某人總成績+\n+");

                    flag = false;
                    break;
                case 1: // show someone's total score value
                    System.out.println(("0:"+person[0].getName())+("\n1:"+person[1].getName())+("\n2:"+person[2].getName()));
                    val1 = scn.nextInt();
                    System.out.println(person[val1].getName() + ": Total=" + person[val1].getSumScore() );
                    break;
                case 2:
                    System.out.println(("0:"+person[0].getName())+("\n1:"+person[1].getName())+("\n2:"+person[2].getName()));
                    val1 = scn.nextInt();
                    System.out.println(person[val1].getName() + ": Average=" + person[val1].getAvgScore() );
                    break;
                case 3:
                    System.out.println(person[0].getName() + ": Total=" + person[0].getSumScore()+
                            "\n"+  person[0].getName() + ": Average=" + person[0].getAvgScore()+
                                    "\n"+
                            "\n"+person[1].getName() + ": Total=" + person[1].getSumScore()+
                            "\n"+   person[1].getName() + ": Average=" + person[1].getAvgScore()+
                                    "\n"+
                            "\n"+ person[2].getName() + ": Total=" + person[2].getSumScore()+
                            "\n"+ person[2].getName() + ": Average=" + person[2].getAvgScore()


                    );
                    break;
                case 4:
                    System.out.println("0:國文\n1:英文\n2:數學");
                    val1 = scn.nextInt();
                    if (val1==0){
                        System.out.println((person[0].getChineseScore()+person[1].getChineseScore()+person[2].getChineseScore())/3);
                    }
                    if (val1==1){
                        System.out.println((person[0].getEnglishScore()+person[1].getEnglishScore()+person[2].getEnglishScore())/3);
                    }
                    if (val1==2){
                        System.out.println((person[0].getMathScore()+person[1].getMathScore()+person[2].getMathScore())/3);
                    }
                    break;

                   // System.out.println(person[0].getChineseScore()+person[1].getChineseScore()+person[2].getChineseScore());

            }
        }


    }
}
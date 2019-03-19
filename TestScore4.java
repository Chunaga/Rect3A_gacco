import java.util.Scanner;
class TestScore4 {
    public static void main(String[] args){
	int score[] = new int[10], order[] = new int[10], i, j, tmp;
	String name[] = new String[10];
	Scanner scan = new Scanner(System.in);

	for(i=0;i<order.length;i++){
	    System.out.printf("名前とスコア？ ");
	    order[i] = i;
	    name[i] = scan.next();
	    score[i] = scan.nextInt();
	}
	for(i=order.length; i>1; i--){
	    for(j=0; j<i-1; j++){
		if(score[order[j]] < score[order[j+1]]){
		    ExValue(order, j, j+1);
		}
	    }
	}
	double average = calcAve(score), stddev = calcStddev(score);
	boolean line_flag = false;
	for(i=0;i<order.length;i++){
	    if(!line_flag && score[order[i]] < average){
		System.out.printf("--- 平均点 %.2f点 ---\n", average);
		line_flag = true;
	    }
	    System.out.printf("%d番：%s さん %d点 （%.1f）\n", i+1, name[order[i]], score[order[i]], 10 * (score[order[i]]-average)/stddev + 50);
	}
    }
    private static void ExValue(int []a, int i, int j){
	int tmp = a[i];
	a[i] = a[j];
	a[j] = tmp;
    }
    private static double calcAve(int[] score){
	int sum = 0, i;
	for(i=0;i<score.length;i++){
	    sum = sum + score[i];
	}
	return (double)sum/score.length;
    }
    private static double calcStddev(int[] score){
	int score2[] = new int[score.length], i;
	for(i=0;i<score.length;i++){
	    score2[i] = (int)Math.pow(score[i], 2);
	}
	return Math.sqrt(calcAve(score2) - Math.pow(calcAve(score), 2));
    }
}


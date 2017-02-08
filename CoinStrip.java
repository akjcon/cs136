import java.util.Arrays;

public class CoinStrip{
    public static String toString(int[] stripArray){
	String gameboard = "";
	for(int i = 0; i <= stripArray.length; i++){
	    gameboard += (stripArray[i]);
	    gameboard += "|";
	}
	return gameboard;
    }
 


    public static void main(String[] args){
	int striplen =(int)(Math.random() * 10 + 15); //10-15
	int firstcoin = (int)(Math.random() * 4 + 1); //1-4
	int[] stripArray = new int[striplen];
	// Arrays.fill(stripArray, -1);
	int i = -1;
	while(i < striplen){
	    int rand = (int)(Math.random() * 4 + 1);
	    i += rand;
	    int coincounter = 1;
	    if(i >= striplen){
		break;
	    }
	    stripArray[i] = coincounter;
	    coincounter++;
	}
	System.out.println(stripArray.toString()); //HOW DO I WRITE A TOSTRING????????
    }
}

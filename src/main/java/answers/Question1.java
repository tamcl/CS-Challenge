package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		// TODO Auto-generated method stub
		int count = 0, sndcount = 0, size = 0;
		int max=0, current=0;
		size = portfolios.length;
		for(count=0;count<size-1;count++){
			for(sndcount=count+1;sndcount<size;sndcount++){
				current = portfolios[count]^portfolios[sndcount];
				if(current>max){
					max=current;
				}
			}
		}
		System.out.println("The maximum evaluated value: " + max);
		
		return max;
	}

}

public class Question6E{
	public static void recursive(int Server, int[] minTime, int[][] times, int numServers){
		for(int i =1;i<numServers;i++){
			if(x==i){
			}else if((minTime[x]+times[x][i])<minTime[i]){
				minTime[i] = minTime[x]+times[x][i];
				recursive(i, minTime[], times[][], numServers);
			}else if(x==targetServer){
				break;
			}
		}
	}
}

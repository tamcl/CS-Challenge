package answers;

public class Question6 {

	public static int shortestServerRoute(int numServers, int targetServer, int[][] times) {
		// TODO Auto-generated method stub
		int[] minTime = new int[numServers];
		minTime[targetServer] = times[0][targetServer];
		for(int i=0;i<numServers;i++){
			minTime[i]=times[0][i];
		}
		
		
		return minTime[targetServer];
	}


}





/*recursive(int Server, int[] minTime, int[][] times, int numServers){
 for(int i =1;i<numServers;i++){
	 if(x==i){
	 }else if((minTime[x]+times[x][i])<minTime[i]){
		 minTime[i] = minTime[x]+times[x][i];
		 recursive(i);
	 }else if(x==targetServer){
		 break;
	 }
 }
}
*/

package smartGroups;
import java.util.Arrays;

import org.json.JSONObject;

public class smartGroups {
	public static String[] briggsList = {"INFP","ENFP","INFJ","ENFJ","INTJ","ENTJ","INTP","ENTP","ISFP","ESFP","ISTP","ESTP","ISFJ","ESFJ","ISTJ","ESTJ"};
	
	public static JSONObject briggsScoreJSON = new JSONObject();
	
	//

	

		
		
		
		
		
		
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i=0;i<briggsList.length;i++) {
			for (int j=0;j<briggsList.length;j++) {
				String first = briggsList[i];
				String second = briggsList[j];

				
			}
		}
		
		for (int i=0;i<briggsList.length;i++) {
			System.out.print(briggsList[i]+briggsMatch.briggsReturn(briggsList[i])+"\n");
		}*/
		
	//	System.out.print(briggsMatch.briggsScore("ENTJ","ESTJ"));
		JSONObject groupJSON = new JSONObject();
		groupJSON.put("JEROME CHEN", "ENFJ");
		groupJSON.put("JOHN LEE", "ISFJ");
		groupJSON.put("TIM SMITH", "ENTJ");
		groupJSON.put("RICHARD TONG", "INFP");
		
		System.out.print(briggsMatch.groupBriggsScore(groupJSON));
	}

}

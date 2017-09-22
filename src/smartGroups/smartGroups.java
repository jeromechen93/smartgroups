package smartGroups;
import java.util.Arrays;
import java.util.HashMap;

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
		HashMap groupJSON = new HashMap();
		groupJSON.put("JEROME CHEN", "ENFJ");
		//able to show one person can bring score down vs. another
		//groupJSON.put("JOHN LELE", "ISFJ");
		groupJSON.put("JOHN LEE", "ENFP");
		groupJSON.put("TIM SMITH", "ENTJ");
		groupJSON.put("RICHARD TONG", "INFP");
		groupJSON.put("RICHARD SONG", "INFJ");
		//System.out.print(briggsMatch.groupBriggsScore(groupJSON));
		
		//System.out.print((float) groupJSON.size() / (float) 3);
		//System.out.print(briggsMatch.combo(3));
		System.out.print(briggsMatch.groupBriggsScore(groupJSON));
	}

}

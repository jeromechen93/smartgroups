package smartGroups;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;

public class smartGroups {
	public static String[] briggsList = {"INFP","ENFP","INFJ","ENFJ","INTJ","ENTJ","INTP","ENTP","ISFP","ESFP","ISTP","ESTP","ISFJ","ESFJ","ISTJ","ESTJ"};
	
	public static JSONObject briggsScoreJSON = new JSONObject();
	
	public static HashMap manualGeneratePopBriggsMap() {
		HashMap popMap = new HashMap();
		popMap.put("JEROME CHEN", "ENFJ");
		popMap.put("YIQIAN DING", "ISFJ");
		popMap.put("JOHN LELE", "ISFJ");
		popMap.put("JOHN LEE", "ENFP");
		popMap.put("TIM SMITH", "ENTJ");
		popMap.put("RICaHARD TONG", "ISFP");
		popMap.put("RICaHARD SONG", "ENFJ");
		popMap.put("JEROdsME CHEN", "ESFJ");
		popMap.put("YIQdIAN DfING", "ISFJ");
		popMap.put("JOHN LELEa", "ESFP");
		popMap.put("JOHdN LEE", "ENFP");
		popMap.put("TIM SMffITH", "ENTJ");
		popMap.put("RICHddARD TONG", "ENTP");
		popMap.put("RICHddsARD SONG", "INFJ");
		popMap.put("JEROghME CHEN", "ENTJ");
		popMap.put("YIQIaAN DING", "ISFJ");
		popMap.put("JOHN LtrELE", "INFP");
		popMap.put("JOHN LrEE", "ENFP");
		popMap.put("TI3M SMITH", "ENTJ");
		popMap.put("RICfHARD TONG", "ENTP");
		popMap.put("RICHAARD SONG", "INTJ");

		return popMap;

	}

	public static String generateRandomBrigg() {
		String personBrigg = "";
		double random = Math.random();


		if (random >=0 && random<.138) {
			personBrigg = "ISFJ";
		}
		else if (random >=.138 && random<.261) {
			personBrigg = "ESFJ";
		}
		else if (random >=.261 && random<.377) {
			personBrigg = "ISTJ";
		}
		else if (random >=.377 && random<.465) {
			personBrigg = "ISFP";
		}

		else if (random >=.465 && random<.552) {
			personBrigg = "ESTJ";
		}
		else if (random >=.552 && random<.637) {
			personBrigg = "ESFP";
		}
		else if (random >=.637 && random<.718) {
			personBrigg = "ENFP";
		}
		else if (random >=.718 && random<.772) {
			personBrigg = "ISTP";
		}
		if (random >=.772 && random<.816) {
			personBrigg = "INFP";
		}
		else if (random >=.816 && random<.859) {
			personBrigg = "ESTP";
		}
		else if (random >=.859 && random<.892) {
			personBrigg = "INTP";
		}
		else if (random >=.892 && random<.924) {
			personBrigg = "ENTP";
		}
		if (random >=.924 && random<.949) {
			personBrigg = "ENFJ";
		}
		else if (random >=.949 && random<.97) {
			personBrigg = "INTJ";
		}
		else if (random >=.97 && random<.987) {
			personBrigg = "ENTJ";
		}
		else if (random >=.987 && random<1) {
			personBrigg = "INFJ";
		}

		return personBrigg;
	}

	public static String generateRandomName() {
		Double number = Math.floor(Math.random()*(100000000-1000000+1)+1000000);
		return number.toString();

	}
	public static HashMap randomGeneratePopBriggsMap(int numberOfPersons) {
		HashMap popMap = new HashMap();

		for (int i=0;i<numberOfPersons;i++) {
			String name = generateRandomName();
			String brigg = generateRandomBrigg();
			popMap.put(name,brigg);

		}


		return popMap;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap popMap = manualGeneratePopBriggsMap();

		//System.out.print(briggsMatch.briggsScore("ENTJ","ESTJ"));
		//System.out.print(briggsMatch.groupBriggsScore(groupJSON));
		//System.out.print((float) groupJSON.size() / (float) 3);
		//System.out.print(groupJSON);

		//System.out.print(briggsMatch.groupBrigggsPairScores(groupJSON).toString() + '\n');
		//System.out.print(briggsMatch.groupBriggsAverageScore(groupJSON));

		//System.out.print(briggsMatch.groupAssign(popMap,4));
		HashMap randomPopMap = manualGeneratePopBriggsMap();
		//HashMap randomPopMap = randomGeneratePopBriggsMap(36);
		HashMap popGroupMap = briggsMatch.groupAssign(randomPopMap,4);


		System.out.print("Population Mean: ");
		System.out.print(briggsMatch.getPopBriggsMeanScoreByBriggsMap(randomPopMap));
		System.out.print('\n');
		System.out.print("Group: ");
		System.out.print(popGroupMap);
		System.out.print('\n');
		System.out.print("Group Means: ");
		System.out.print(briggsMatch.getMeanPopGroupScore(popGroupMap));

		//System.out.print(briggsMatch.getGroupSizesFromPopMap(randomPopMap,7));
	}

}

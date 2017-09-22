package smartGroups;
import java.util.Arrays;
import java.util.Iterator;
import org.json.*;


public class briggsMatch {
	
	public static String[] briggsList = {"INFP","ENFP","INFJ","ENFJ","INTJ","ENTJ","INTP","ENTP","ISFP","ESFP","ISTP","ESTP","ISFJ","ESFJ","ISTJ","ESTJ"};
	public static JSONObject briggsJSON = new JSONObject();
	
	public static JSONObject briggsReturn(String briggs) {
		/*https://i.pinimg.com/originals/c5/95/d7/c595d7e69ab2afa27ffb0a6f66ac125e.jpg
		5 levels:
		Ideal Match: 100
		Good Match: 80
		OK Match: 60
		Possible Match: 30
		Bad Match: 0		
		*/
		Integer idealScore = new Integer(100);
		Integer goodScore = new Integer(80);
		Integer okScore = new Integer(60);
		Integer possibleScore = new Integer(30);
		Integer badScore = new Integer(0);
		
		String[] briggsIterate = briggsList;
		JSONObject perBriggsJSON = new JSONObject();
		
		if (briggs=="INFP") {
			String[] ideal = {"ENFJ","ENTJ"};
			String[] good = {"INFP","ENFP","INFJ","INTJ","INTP","ENTP"};
			String[] ok = {};
			String[] possible = {};
			String[] bad = {};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else  {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}
		}
			

		else if (briggs=="ENFP"){
			String[] ideal = {"INFJ","INTJ"};
			String[] good = {"INFP","ENFP","ENFJ","ENTJ","INTP","ENTP"};
			String[] ok = {};
			String[] possible = {};
			String[] bad = {};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else  {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="INFJ"){
			String[] ideal = {"ENFP","ENTP"};
			String[] good = {"INFP","INFJ","ENFJ","INTJ","ENTJ","INTP"};
			String[] ok = {};
			String[] possible = {};
			String[] bad = {};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else  {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="ENFJ"){
			String[] ideal = {"INFP","ISFP"};
			String[] good = {"ENFP","INFJ","ENFJ","INTJ","ENTJ","INTP","ENTP"};
			String[] ok = {};
			String[] possible = {};
			String[] bad = {};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else  {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="INTJ"){
			String[] ideal = {"ENFP","ENTP"};
			String[] good = {"INFP","INFJ","ENFJ","INTJ","ENTJ","INTP"};
			String[] ok = {"ISFP","ESFP","ISTP","ESTP"};
			String[] possible = {"ISFJ","ESFJ","ISTJ","ESTJ"};
			String[] bad = {};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
			}	
		}
		
		else if (briggs=="ENTJ"){
			String[] ideal = {"INFP","INTP"};
			String[] good = {"ENFP","INFJ","ENFJ","INTJ","ENTJ","ENTP"};
			String[] ok = {};
			String[] possible = {};
			String[] bad = {};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				
			}	
		}
		
		else if (briggs=="INTP"){
			String[] ideal = {"ENTJ","ESTJ"};
			String[] good = {};
			String[] ok = {"ISFP","ESFP","ISTP","ESTP"};
			String[] possible = {"ISFJ","ESFJ","ISTJ"};
			String[] bad = {};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
			}	
		}
		
		else if (briggs=="ENTP"){
			String[] ideal = {"INFJ","INTJ"};
			String[] good = {};
			String[] ok = {"ISFP","ESFP","ISTP","ESTP"};
			String[] possible = {"ISFJ","ESFJ","ISTJ","ESTJ"};
			String[] bad = {};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
			}	
		}
		
		else if (briggs=="ISFP"){
			String[] ideal = {"ENFJ","ESFJ","ESTJ"};
			String[] good = {};
			String[] ok = {"INTJ","ENTJ","INTP","ENTP","ISFJ","ISTJ"};
			String[] possible = {"ISFP","ESFP","ISTP","ESTP"};
			String[] bad = {"INFP","ENFP","INFJ"};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else if (Arrays.asList(bad).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="ESFP"){
			String[] ideal = {"ISFJ","ISTJ"};
			String[] good = {};
			String[] ok = {"INTJ","ENTJ","INTP","ENTP","ESFJ","ESTJ"};
			String[] possible = {"ISFP","ESFP","ISTP","ESTP"};
			String[] bad = {"INFP","ENFP","INFJ","ENFJ"};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else if (Arrays.asList(bad).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="ISTP"){
			String[] ideal = {"ESFJ","ESTJ"};
			String[] good = {};
			String[] ok = {"INTJ","ENTJ","INTP","ENTP","ISFJ","ISTJ"};
			String[] possible = {"ISFP","ESFP","ISTP","ESTP"};
			String[] bad = {"INFP","ENFP","INFJ","ENFJ"};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else if (Arrays.asList(bad).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="ESTP"){
			String[] ideal = {"ISFJ","ISTJ"};
			String[] good = {};
			String[] ok = {"INTJ","ENTJ","INTP","ENTP","ESFJ","ESTJ"};
			String[] possible = {"ISFP","ESFP","ISTP","ESTP"};
			String[] bad = {"INFP","ENFP","INFJ","ENFJ"};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else if (Arrays.asList(bad).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="ISFJ"){
			String[] ideal = {"ESFP","ESTP"};
			String[] good = {"ISFJ","ESFJ","ISTJ","ESTJ"};
			String[] ok = {"ENTJ","ISFP","ISTP"};
			String[] possible = {"INTJ","INTP","ENTP"};
			String[] bad = {"INFP","ENFP","INFJ","ENFJ"};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else if (Arrays.asList(bad).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="ESFJ"){
			String[] ideal = {"ISFP","ISTP"};
			String[] good = {"ISFJ","ESFJ","ISTJ","ESTJ"};
			String[] ok = {"ENTJ","ESFP","ESTP"};
			String[] possible = {"INTJ","INTP","ENTP"};
			String[] bad = {"INFP","ENFP","INFJ","ENFJ"};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else if (Arrays.asList(bad).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="ISTJ"){
			String[] ideal = {"ESFP","ESTP"};
			String[] good = {"ISFJ","ESFJ","ISTJ","ESTJ"};
			String[] ok = {"ENTJ","ISFP","ISTP"};
			String[] possible = {"INTJ","INTP","ENTP"};
			String[] bad = {"INFP","ENFP","INFJ","ENFJ"};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else if (Arrays.asList(bad).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		else if (briggs=="ESTJ"){
			String[] ideal = {"INTP","ISFP","ISTP"};
			String[] good = {"ISFJ","ESFJ","ISTJ","ESTJ"};
			String[] ok = {"ENTJ","ESFP","ESTP"};
			String[] possible = {"INTJ","ENTP"};
			String[] bad = {"INFP","ENFP","INFJ","ENFJ"};
			for (int i=0;i<briggsIterate.length;i++) {
				if (Arrays.asList(ideal).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],idealScore);
				}
				else if (Arrays.asList(good).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],goodScore);
				}
				else if (Arrays.asList(ok).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],okScore);
				}
				else if (Arrays.asList(possible).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],possibleScore);
				}
				else if (Arrays.asList(bad).contains(briggsIterate[i])) {
					perBriggsJSON.put(briggsIterate[i],badScore);
				}
			}	
		}
		
		
		
	return perBriggsJSON;
	}
	
	
	
	public static Integer briggsScore (String briggs1, String briggs2) {
		Integer score = null;
		
		score = (Integer) briggsMatch.briggsReturn(briggs1).get(briggs2); 
		return score;
	}
	
	
	public static int groupBriggsScore (JSONObject groupJSON) {
		int groupTotalScore = 0;
		int countOfJSON = 0;
		JSONArray JSONKeys = groupJSON.names();

		System.out.print(JSONKeys.opt(0));
		return groupTotalScore;
	}
}

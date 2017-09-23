package smartGroups;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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
	
	public static int combo (int inSize) {
		int total = 0;
		int size = inSize -1;
		while (size>0) {
			total+=size;
			size--;
		}
		return total;
	}
	
	
	public static float groupBriggsAverageScore (HashMap groupMap) {
		//input looks like JEROME CHEN=ENFJ
		int groupTotalScore = 0;
		
		List groupKeySet = new ArrayList(groupMap.keySet());
		int countOfKeys = groupKeySet.size();
		int comboDivider = briggsMatch.combo(countOfKeys);
		
		int offset = 1;

		for (int i=0;i<countOfKeys;i++) {
			for (int j=offset;j<countOfKeys;j++) {
				String briggs1 = (String) groupMap.get(groupKeySet.get(i));
				String briggs2 = (String) groupMap.get(groupKeySet.get(j));
				int currentScore = briggsMatch.briggsScore(briggs1,briggs2).intValue();
				groupTotalScore += currentScore;
			}
			offset++;
		}
		//With more people, it is much greater of a combo divider. 
		float groupAverageScore = (float) groupTotalScore / comboDivider;
		
		return groupAverageScore;
	}

	public static HashMap groupBrigggsPairScores(HashMap groupMap) {
		HashMap finalJSON = new HashMap();

		List groupKeySet = new ArrayList(groupMap.keySet());

		int countOfKeys = groupKeySet.size();
		int comboDivider = briggsMatch.combo(countOfKeys);

		int offset = 1;

		for (int i=0;i<countOfKeys;i++) {
			for (int j=offset;j<countOfKeys;j++) {
				String person1 = (String) groupKeySet.get(i);
				String briggs1 = (String) groupMap.get(groupKeySet.get(i));
				String person2 = (String) groupKeySet.get(j);
				String briggs2 = (String) groupMap.get(groupKeySet.get(j));

				String pair = person1 + "(" + briggs1 + ")" + "$" + person2 + "(" + briggs2 + ")";
				Integer pairScore = briggsMatch.briggsScore(briggs1,briggs2);
				finalJSON.put(pair,pairScore);
			}
			offset++;
		}

		return finalJSON;
	}

	public static float getGroupAverageBriggsFromScoresMap(HashMap groupScoresMap) {

		float totalGroupScore = 0;

		int countOfScores = groupScoresMap.size();

		for (int i=0;i<countOfScores;i++) {
			List groupScoresKeys = new ArrayList(groupScoresMap.keySet());

			String currentKey = (String) groupScoresKeys.get(i);
			//current score

			int currentScore =  (int) groupScoresMap.get(currentKey);
			totalGroupScore += currentScore;
		}

		float averageScoreOfGroup = totalGroupScore / countOfScores;

		return averageScoreOfGroup;
	}

	public static float getAverageFromArray(ArrayList<Float> arrayOfFloat) {
		float score = 0;
		for (int i=0;i<arrayOfFloat.size();i++) {
			score+=arrayOfFloat.get(i);
		}
		score=score/arrayOfFloat.size();
		return score;
	}


	public static float standardDeviationFromMap(HashMap groupScoresMap) {
		//array of all scores without names

		ArrayList<Integer> listOfScores = new ArrayList<>();
		List groupScores = new ArrayList(groupScoresMap.keySet());

		int countOfScores = groupScores.size();

		float averageScoreOfGroup = getGroupAverageBriggsFromScoresMap(groupScoresMap);

		ArrayList<Float> squaredValues = new ArrayList<Float>();


		for (int i=0;i<countOfScores;i++) {
			String currentKey = (String) groupScores.get(i);
			//current score
			int currentScore = (Integer) groupScoresMap.get(currentKey);
			Float currentSquared = (currentScore - averageScoreOfGroup) * (currentScore - averageScoreOfGroup);

			squaredValues.add(currentSquared);
		}

		float squaredAverage = getAverageFromArray(squaredValues);
		System.out.print(squaredAverage);System.out.print('\n');
		float standardDeviation = (float) Math.sqrt((double) squaredAverage);



		return standardDeviation;
	}

	public static HashMap groupAssign(HashMap groupMap, int groupSize) {
		HashMap finalGroupsMap = new HashMap();

		List groupKeySet = new ArrayList(groupMap.keySet());
		//number of values
		int countOfKeys = groupKeySet.size();

		//number of groups to have
		int numberOfGroups = countOfKeys / groupSize;

		//remainder after division - to add into groups
		int remainder = countOfKeys - (numberOfGroups * groupSize);

		// find the total average of the entire list of people
		float totalGroupAverage = groupBriggsAverageScore(groupMap);

		//get the hash of all individual paired scores of entire list of people
		HashMap totalGroupScores = groupBrigggsPairScores(groupMap);
		//System.out.print(totalGroupScores);

		float standardDeviation = standardDeviationFromMap(totalGroupScores);


		System.out.print(standardDeviation);




		return finalGroupsMap;
	}


}

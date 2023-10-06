package dev.parkalex;
import java.util.*;
import static java.lang.System.out;

public class WhoWonTheElection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(WhoWonTheElection.class.getResourceAsStream("votes.txt"));
		int numElections = sc.nextInt();
		for (int i=0;i<numElections;i++) {
			int totalVotes = sc.nextInt();
			Map<String, Integer> votes = new TreeMap<String, Integer>();
			sc.nextLine();
			for (int z=1;z<=totalVotes;z++) {
				String line = sc.nextLine();
//				System.out.println("Added vote for " + line);
				if (!votes.containsKey(line)) {
					votes.put(line, 1);
				} else {
					votes.put(line, votes.get(line)+1);
				}
			}
//			System.out.println(votes);
			
			boolean winnerExists = false;
			String winnerName = "";
			
			for (String candidate : votes.keySet()) {
//				System.out.println((double)votes.get(candidate)/totalVotes);
				if ((double)votes.get(candidate)/totalVotes > 0.5) {
					winnerExists = true;
					winnerName = candidate;
				}
			}
			if (winnerExists) {
				System.out.println(winnerName + " won the election");
			} else {
				System.out.println("Nobody won! A special runoff election will be held.");
			}
			
		}
	}
}

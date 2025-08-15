package repository;

import entity.Team;

public class TeamRepository {

	public static Team getMITeamDetails() {
		
		Team team = new Team();
		
		team.setId(101);
		team.setTeamName("mumbai indians");
		team.setCaptainName("Hardik panday");
		team.setCoachName("jaywardhan");
		team.setIsQualified(true);
		team.setNRR(3.2f);
		
		return team;
	}
public static Team getCSKTeamDetails() {
		
		Team team = new Team();
		
		team.setId(102);
		team.setTeamName("CSK");
		team.setCaptainName("Mahendra singh Dhoni");
		team.setCoachName("Stephen Fleming");
		team.setIsQualified(true);
		team.setNRR(2.2f);
		
		return team;
	}
public static Team getRCBTeamDetails() {
	
	Team team = new Team();
	
	team.setId(103);
	team.setTeamName("RCB");
	team.setCaptainName("virat kohali");
	team.setCoachName("Andy Flower");
	team.setIsQualified(true);
	team.setNRR(3.2f);
	
	return team;
}
public static Team getGTTeamDetails() {
	
	Team team = new Team();
	
	team.setId(104);
	team.setTeamName("GT");
	team.setCaptainName("Shubman Gill");
	team.setCoachName("Ashish Nehra");
	team.setIsQualified(true);
	team.setNRR(4.2f);
	
	return team;
}
public static Team getRRTeamDetails() {
	
	Team team = new Team();
	
	team.setId(105);
	team.setTeamName("RR");
	team.setCaptainName("Sunju Samson");
	team.setCoachName("Rahul Dravid");
	team.setIsQualified(true);
	team.setNRR(3.2f);
	
	return team;
}
public static Team getPBKSTeamDetails() {
	
	Team team = new Team();
	
	team.setId(106);
	team.setTeamName("PBKS");
	team.setCaptainName("Shreyas Iyer");
	team.setCoachName("Ricky Ponting");
	team.setIsQualified(true);
	team.setNRR(3.2f);
	
	return team;
}
public static Team getDCTeamDetails() {
	
	Team team = new Team();
	
	team.setId(107);
	team.setTeamName("DC");
	team.setCaptainName("KL Rahul");
	team.setCoachName("Hemang Badani");
	team.setIsQualified(true);
	team.setNRR(3.2f);
	
	return team;
}
public static Team getSRHTeamDetails() {
	
	Team team = new Team();
	
	team.setId(108);
	team.setTeamName("SRH");
	team.setCaptainName("Pat Cummins");
	team.setCoachName("Daniel vettori");
	team.setIsQualified(true);
	team.setNRR(3.2f);
	
	return team;
}
public static Team getLSGTeamDetails() {
	
	Team team = new Team();
	
	team.setId(109);
	team.setTeamName("LSG");
	team.setCaptainName("Rishabh pant");
	team.setCoachName("Justin Langer");
	team.setIsQualified(true);
	team.setNRR(3.2f);
	
	return team;
}
public static Team getKKRTeamDetails() {
	
	Team team = new Team();
	
	team.setId(110);
	team.setTeamName("KKR");
	team.setCaptainName("Ajinkya Rahane");
	team.setCoachName("Chandrakant pandit");
	team.setIsQualified(true);
	team.setNRR(3.2f);
	
	return team;
}
}

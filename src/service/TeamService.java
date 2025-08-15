package service;

import entity.Team;
import repository.TeamRepository;

public class TeamService {

	 public void printMITeamDetails() {
	  	   
	  	   Team team = TeamRepository.getMITeamDetails();
	  	 
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
		 public void printCSKTeamDetails() {
	  	   
	  	   Team team = TeamRepository.getCSKTeamDetails();
	  	 
	  	   
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
		 public void printRCBTeamDetails() {
	  	   
	  	   Team team = TeamRepository.getRCBTeamDetails();
	  	 
	  	   
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
		 public void printDCTeamDetails() {
	  	   
	  	   Team team = TeamRepository.getDCTeamDetails();
	  	 
	  	   
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
		 public void printGTTeamDetails() {
	  	   
	  	   Team team = TeamRepository.getGTTeamDetails();
	  	 
	  	   
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
		 public void printLSGTeamDetails() {
	  	   
	  	   Team team = TeamRepository.getLSGTeamDetails();
	  	 
	  	   
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
		 public void printKKRTeamDetails() {
	  	   
	  	   Team team = TeamRepository.getKKRTeamDetails();
	  	 
	  	   
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
		 public void printRRTeamDetails() {
	  	   
	  	   Team team = TeamRepository.getRRTeamDetails();
	  	 
	  	   
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
		 public void printSRHTeamDetails() {
	  	   
	  	   Team team = TeamRepository.getSRHTeamDetails();
	  	 
	  	   
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
		 public void printPBKSTeamDetails() {
	  	   
	  	   Team team = TeamRepository.getPBKSTeamDetails();
	  	 
	  	   
	  	   System.out.println(team.getId());
	  	   System.out.println(team.getTeamName());
	  	   System.out.println(team.getCaptainName());
	  	   System.out.println(team.getCoachName());
	  	   System.out.println(team.getIsQualified());
	  	   System.out.println(team.getNRR());
	     }
		 
}

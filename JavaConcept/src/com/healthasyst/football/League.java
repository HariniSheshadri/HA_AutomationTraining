package com.healthasyst.football;

public class League {

	public static void main(String[] args) {
		
		//initialise the player object and load the data
		Player player1=new Player();
		player1.playerName="Raina";
		
		Player player2=new Player();
		player2.playerName="John";
		
		Player player3=new Player();
		player3.playerName="Dhoni";
		
		//create an array and add player details
		Player[] team1Players=new Player[3];
		team1Players[0]=player1;
		team1Players[1]=player2;
		team1Players[2]=player3;
		
		//Load the team amd load the player array details into it
		Team team1=new Team();
		team1.teamName="CSK";
		team1.playerArray=team1Players;
		
		//initialise the players for second team and load the data
		
		Player player4=new Player();
		player4.playerName="Kohli";
		
		Player player5=new Player();
		player5.playerName="ABD";
		
		Player player6=new Player();
		player6.playerName="Yuvi";
		
		//Create an array and add player details into it
		
		Player[] team2Player= {player4,player5,player6};
		
			
				//Load the team
				Team team2=new Team();
				team2.teamName="RCB";
				team2.playerArray=team2Player;
		
		System.out.println("Team1 name: "+team1.teamName);
		System.out.println("Team1 players are: ");
		for(Player S1: team1.playerArray )
		{
			System.out.println(S1.playerName);
		}
		
		System.out.println("Team2 name: "+team2.teamName);
		System.out.println("Team2 players are: ");
		for(Player S2: team2.playerArray )
		{
			System.out.println(S2.playerName);
		}
			
	}

}

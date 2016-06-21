package com.practice.stats;

import java.util.List;

public class Play {
	// fields
	int quarter, minute, second, down, teamWin, toGo, yardLine, seriesFirstDown, nextScore, yards, yardLineDirection,
			penaltyYards;
	String offTeam, defTeam, description, formation, playType, passType, challenger, rushDirection, penaltyTeam,
			penaltyType, blank;
	boolean isRush, isPass, isIncomplete, isTD, isChallenge, isChallengeReversed, isMeasurment, isInterception,
			isFumlbe, isTwoPoint, isTwoPointGood, IsPenaltyAccepted,isSack,isPenalty;

	public Play(List<String> list) {
		System.out.println(list);
		quarter = Integer.parseInt(list.get(2));
		minute = Integer.parseInt(list.get(3));
		second = Integer.parseInt(list.get(4));
		offTeam = list.get(5);
		defTeam = list.get(6);
		down = Integer.parseInt(list.get(7));
		toGo = Integer.parseInt(list.get(8));
		yardLine = Integer.parseInt(list.get(9));
		seriesFirstDown = Integer.parseInt(list.get(11));
		nextScore = Integer.parseInt(list.get(13));
		description = list.get(14);
		teamWin = Integer.parseInt(list.get(16));
		yards = Integer.parseInt(list.get(19));
		formation = list.get(20);
		playType = list.get(21);
		isRush= Integer.parseInt(list.get(24))==0?false:true;
		isPass = Integer.parseInt(list.get(25))==0?false:true;
		isIncomplete=Integer.parseInt(list.get(26))==0?false:true;
		isTD=Integer.parseInt(list.get(27))==0?false:true;
		isSack =Integer.parseInt(list.get(29))==0?false:true;
		isChallenge= Integer.parseInt(list.get(30))==0?false:true;
		isChallengeReversed=Integer.parseInt(list.get(31))==0?false:true;
		isMeasurment=Integer.parseInt(list.get(33))==0?false:true;
		isInterception=Integer.parseInt(list.get(34))==0?false:true;
		isFumlbe=Integer.parseInt(list.get(35))==0?false:true;
		isPenalty = Integer.parseInt(list.get(36))==0?false:true;
		isTwoPoint= Integer.parseInt(list.get(37))==0?false:true;
		isTwoPointGood=Integer.parseInt(list.get(38))==0?false:true;
		IsPenaltyAccepted=Integer.parseInt(list.get(40))==0?false:true;
	}
	
	public String toString(){
		return "data "+ quarter+ minute+ second+ down+ teamWin+ toGo+ yardLine+ seriesFirstDown+ nextScore+ yards+yardLineDirection+penaltyYards
				+offTeam+ defTeam+ description+ formation+ playType+ passType+ challenger+ rushDirection+ penaltyTeam+
				penaltyType;
	}

	public int compareTo(Play play) {
		if (quarter < play.quarter) {
			return -1;
		} else if (quarter > play.quarter) {
			return 1;
		} else {
			if (minute < play.minute) {
				return -1;
			} else if (minute > play.minute) {
				return 1;
			} else {
				if (second < play.second) {
					return -1;
				} else if (second > play.second) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}

}

package cut_the_sticks;

import java.util.Scanner;

public class CutSticks 
{
	public static int mini(int sticks[]) 
	{
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < sticks.length; i++)
		{
			if(sticks[i] == 0)
			{
				continue;
			}
			if(min > sticks[i])
			{
				min = sticks[i];
			}
		}
		return min;
	}
	
	public static void cuts(int sticks[]) 
	{
		System.out.println(sticks.length);
		for(int i = 0; i < sticks.length; i++)
		{
			int countCuts = 0;
			int min = mini(sticks);
			for(int j = 0; j < sticks.length; j++)
			{
				if(sticks[j] != 0)
				{
					sticks[j] -= min;
				}
				if(sticks[j] == 0)
				{
					countCuts++;
					
				}
			}
			if(countCuts != sticks.length)
			{
				System.out.println(sticks.length - countCuts);
			}
			else
			{
				break;
			}
			
		}
	}
	
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int sticks[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			sticks[i] = sr.nextInt();
		}
		
		cuts(sticks);
		
		sr.close();
	}
}

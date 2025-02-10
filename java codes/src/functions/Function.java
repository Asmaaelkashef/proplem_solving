package functions;
import java.util.Scanner;

public class Function {

    public String ClubSys ()
        {
            Scanner asmaa = new Scanner(System.in);

            //storage variables
            String Available_Games [] = { "BallGames" ,"IntelligenceGames" , "Swimming"};
            String GameName [] = {"FootBall" , "HollyBall", "Chess", "Domino" , "swim"};
            String Time [] = {"2:00 PM", "4:00 PM", "6:00 PM"};

            //print games
            int i = 0;
            System.out.println("Games are:");
            for (i = 0 ; i < Available_Games.length ; i++)
            {System.out.println((i + 1) +" " +  Available_Games[i]);}

            //select
            System.out.println("enter 1 to " + Available_Games[0] + " , enter 2 to " + Available_Games[1] + " , enter 3 to " + Available_Games[2]);
            int choise = asmaa.nextInt();
            switch (choise)
            {
                case 1 :
                System.out.println("Ball Games are " + GameName[0] + " and " + GameName[1]);
                System.out.println("enter 1 for " + GameName[0] + " "+ "enter 2 for " + GameName[1]);
                int game = asmaa.nextInt();
                if (game == 1) 
                {System.out.println("you selected " + GameName[0] + " , now select time" );}
                else
                {System.out.println("you selected " + GameName[1] + " , now select time" );}
                //choose time
                System.out.println("times available are");
                for (i = 0 ; i < Time.length ; i++)
                {System.out.println((i + 1) + " "+ Time[i]);}
                System.out.println("enter 1 for " + Time[0] + " enter 2 for " + Time[1] + " enter 3 for " + Time[2]);
                int clock = asmaa.nextInt();
                if (clock == 1) 
                {System.out.println("you have successfully booked at " + Time[0]);}
                if (clock == 2) 
                {System.out.println("you have successfully booked at " + Time[1]);}
                if (clock == 3) 
                {System.out.println("you have successfully booked at " + Time[2]);}
                break;

                case 2 :
                System.out.println("Intelligence Games are " + GameName[2] + " and " + GameName[3]);
                System.out.println("enter 1 for " + GameName[2] + " enter 2 for " + GameName[3]);
                int play = asmaa.nextInt();
                if (play == 1) 
                {System.out.println("you selected" + GameName[2] + " now select time");}
                else
                {System.out.println("you selected " + GameName[3] + " now select time");}
                //choose time
                System.out.println("times available are");
                for (i = 0 ; i < Time.length ; i++)
                {System.out.println((i + 1) + " " + Time[i]);}
                System.out.println("enter 1 for " + Time[0] + " enter 2 for " + Time[1] + " enter 3 for " + Time[2]);
                int cc = asmaa.nextInt();
                if (cc == 1) 
                {System.out.println("you have successfully booked at " + Time[0]);}
                if (cc == 2) 
                {System.out.println("you have successfully booked at " + Time[1]);}
                if (cc == 3) 
                {System.out.println("you have successfully booked at " + Time[2]);}
                break;

                case 3 :
                System.err.println("you selected" + GameName[4] + " now select time");
                //choose time
                System.out.println("times available are");
                for (i = 0 ; i < Time.length ; i++)
                {System.out.println((i + 1) +" " + Time[i]);}
                System.out.println("enter 1 for " + Time[0] + " enter 2 for " + Time[1] + " enter 3 for " + Time[2]);
                int zz = asmaa.nextInt();
                if (zz == 1) 
                {System.out.println("you have successfully booked at " + Time[0]);}
                if (zz == 2) 
                {System.out.println("you have successfully booked at " + Time[1]);}
                if (zz == 3) 
                {System.out.println("you have successfully booked at " + Time[2]);}
                break;
            }
            return "";
        }
    
}

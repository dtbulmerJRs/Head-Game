package headGame;

import commands.CommandTP;
import commands.CommandSpeedUsage;
import commands.CommandTPUsage;
import commands.CommandStop;
import commands.CommandSpeed;
import java.util.Scanner;

/**
 * Listens for commands on the Command Line
 * @author eandr127
 */
public class CommandListener {
    
    /**
     * Listens for commands on the Command Line
     */
    public CommandListener(){
        
        CommandList commands = new CommandList(); 
        String inputString;
        while(true) {
            Scanner sc = new Scanner(System.in);
            inputString = sc.nextLine(); // you could swith it with nextInt(), nextFloat() etc based on yoir need
            if(inputString != null) {
                for(int i = 0; i <= commands.CommandList().length -1; i++){
                    if(inputString.startsWith(commands.CommandList()[i])) {
                        switch(commands.CommandList()[i]){
                            case "/stop":
                                new CommandStop(commands.CommandList());
                            break;
                            case "/speed ":
                                new CommandSpeed(commands.CommandList());
                            break;
                            case "/speed":
                                new CommandSpeedUsage(commands.CommandList());
                            break;
                            case "/tp ":
                                new CommandTP(commands.CommandList());
                            break;
                            case "/tp":
                                new CommandTPUsage(commands.CommandList());
                            break;
                        }        
                    }
                    
                    else {
                        System.out.println("Unknown command.");
                    }
                }
            }
        }
    }
}
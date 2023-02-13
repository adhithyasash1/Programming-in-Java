import java.util.Scanner;	

class Voter{	

// Define appropriate variables for implementing singleton behaviour
// in accordance with the given coded parts and sample output
    
    static int total_no_of_voters;
    static int current_voter_count = 0;
    static Voter new_voter;
    
    private Voter() {                           
		        current_voter_count++;					
    }

    public static Voter getVoter() {
        //implement singleton behaviour
        if(new_voter == null){
            new_voter = new Voter();
            return new_voter;
        }
        return null;
    }

    public void firstVoter(){
		        if(new_voter != null) {
			            EVM new_machine = EVM.getEVM(new_voter);
			            new_machine.startVoting();
		        }
    }

    public void callNewVoter() {
        new_voter = null;
        if (current_voter_count >= total_no_of_voters) {
            return;
        }
        new_voter = new Voter();
        // Write code to setup a new EVM object for the new voter
        EVM evm = EVM.getEVM(new_voter);
        //Ignore the following 6 lines of code
        //but do not delete this code in your submission 
//======================================================================== 
        try {
		            EVM x = EVM.getEVM(null);
			            x.startVoting();
		        }catch(NullPointerException e) {
			            System.out.println("EVM is Singleton");
	        }
//========================================================================  	
	        // Resume writing your code here
	        // Hint: Write code to start voting for the new user on the new EVM
	        evm.startVoting();
    }
}

class EVM{

        // Define appropriate variables for implementing singleton behaviour
        // in accordance with the given coded parts and sample output
        
        static EVM new_evm;
        Voter current_voter;
        static int evm_count = 0;

        private EVM(Voter v) {
            current_voter = v;
		    evm_count++;
        }
        public static EVM getEVM(Voter v) {
            // Implement singleton behaviour
            if(new_evm == null){
                new_evm = new EVM(v);
                return new_evm;
            }
            return null;
        }

        public void startVoting() {
            // Complete voting for the current voter and call the next voter
            // Hint : Use callback here 
            System.out.println("voting under process on EVM number " + evm_count);
            System.out.println("Voting completed for voter " + current_voter.current_voter_count);
            new_evm = null;
            current_voter.callNewVoter();
        }
}


public class Election{
	        
            public static void main(String args[]) {
		            Scanner s = new Scanner(System.in);
		            Voter.total_no_of_voters =  s.nextInt();
		            // Assume input is always non zero
		            Voter v = Voter.getVoter();
		
		            //Trying to create another voter when one voter is in the middle of 
		            //voting process, students can ignore this try-catch block of code
		
				            try {
					                Voter x = Voter.getVoter();
					                x.callNewVoter();
				            } catch(NullPointerException e) {
					                System.out.println("Voter is Singleton");
				            }
				
		            //Starting the first vote of the day
		                v.firstVoter();
	        }
}
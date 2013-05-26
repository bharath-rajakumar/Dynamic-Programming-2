import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_of_weights = 1;
		int temp_input_reader = 0;
		int batch_count = 1;
		int temp = 0;
		ArrayList<Integer> weights = new ArrayList<Integer>((0)); //Input weights given by the user
		ArrayList<Integer> resultant_weights = new ArrayList<Integer>(); 
		Scanner inputReader = new Scanner(System.in);
				
		resultant_weights.add(0);
		
		//Accept weights in batches as long as 0 is not given as input
		while(number_of_weights != 0)
		{			
			//Accept No of weights for each batch
			System.out.println("Enter the number of weights for batch " + batch_count);
			number_of_weights = inputReader.nextInt();
			if(number_of_weights != 0)
			{
				System.out.println("Enter the weights as multiples of 50(and a maximum value of 2000)");
			}
			for(int i = 1; i <= number_of_weights; i++)
			{			
				temp_input_reader = inputReader.nextInt();
				//check if weights are multiples of 50 and no more than 2000
				if((temp_input_reader % 50 == 0) && (temp_input_reader <= 2000))
				{
					weights.add(temp_input_reader);
					//weights_count++;												
				}
				else
				{
					System.out.println("Invalid weight, please enter another weight");
					i = i - 1;
				}											    					
			}
			batch_count++;
		}
		
		System.out.println(weights);
		 
		for(int i = 0; i < weights.size(); i++)
		{
			int resultant_size = resultant_weights.size();
			System.out.println("Weights that can be measured with weight "+ weights.get(i) + " and weights " + resultant_weights + " are: ");
			for (int j = 0; j < resultant_size; j++)
			{
				temp = weights.get(i) + resultant_weights.get(j);
				if(!resultant_weights.contains(temp))
				{	
					resultant_weights.add(temp);
				}
				temp = Math.abs(weights.get(i) - resultant_weights.get(j));
				if(!resultant_weights.contains(temp))
				{
					resultant_weights.add(temp);
				}
				if(!resultant_weights.contains(weights.get(i)))
				{
					resultant_weights.add(weights.get(i));
				}
			}
			System.out.println(resultant_weights);			
		}
				
		//Copy and print only unique weights from the input weights arrayList
	  	Set<Integer> unique_set = new HashSet<Integer>(resultant_weights);
	  	System.out.println("List of unique weights");
	  	System.out.println(unique_set);		
	  	System.out.println(unique_set.size() - 1);
	}
}

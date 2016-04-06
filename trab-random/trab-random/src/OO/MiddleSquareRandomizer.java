package OO;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.math.BigDecimal;



public class MiddleSquareRandomizer implements Randomizer {

	Double constant = 1000000.0;
    ArrayList<Double> seeds = new ArrayList<Double> ();
    double seed;

    public MiddleSquareRandomizer (){
        
    }
    
    public double random(){
    	if (seeds.size() == 0){
            long aux_num = System.currentTimeMillis();
            String str_aux = String.valueOf(aux_num);
            str_aux = str_aux.substring(7,13);
            // System.out.println(str_aux);
            seed = Double.parseDouble(str_aux);
            // System.out.println("entrou no if, seed: " + seed);
        }
        else{
            int y = seeds.size();
            seed = seeds.get(y-1);
            // System.out.println("entrou no else, seed: " + seed);
        }

    	// System.out.println("Seed: " + seed);
    	Double doubleSeed = Math.pow(seed,2.0);
    	// System.out.println("doubleseed: " + doubleSeed);
    	String twiceSeed = new BigDecimal(doubleSeed).toPlainString();
    	// System.out.println("string doubleseed: " +twiceSeed);
    	// System.out.println(twiceSeed.length());
        String subSeed ;
        //int i = (twiceSeed.length() - 6) / 2;
        subSeed = twiceSeed.substring(twiceSeed.length() - 6,twiceSeed.length());
        // System.out.println("subseed: "+ subSeed);
    	double newSeed = Double.parseDouble(subSeed);
        seeds.add(newSeed);
    	// System.out.println("newseed: " + newSeed);

    	Double randomnumber =  newSeed / constant;
    	// System.out.println(randomnumber);

        if (randomnumber >= 1){
            while (randomnumber >1){
                randomnumber = randomnumber / 10;
            }
        }
        else if (randomnumber < 0.0 ){
            while (randomnumber < 0.0 ){
                randomnumber = randomnumber * 10;
            }
        }
    	return randomnumber;
        // return 1.0;

    }


     // public Integer SeedGenerator (){

     // 	List seedList = new ArrayList();
					 
     // 	for (int i = 675248; i < 690000 ; i++ ) {
     // 		seedList.add((i));
     // 	}

     // 	Collections.shuffle(seedList);
     // 	return (( Integer ) seedList.get ( 0 )) .intValue () ;
     // }

}

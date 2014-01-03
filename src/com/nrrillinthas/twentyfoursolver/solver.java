package com.nrrillinthas.twentyfoursolver;
import java.util.ArrayList;

public class solver {
	
	public static int r1,r2,r3,r4;
	//position in number array 1

	public static int s1,s2,s3;
	//position in number array 2

	public static int t1,t2;
	//position in number array 3

	public static int o1,o2,o3;
	//operations represented by 1= add, 2=subtract, 3= multiply and 4=divide
	public static ArrayList<Double> numbers=new ArrayList<Double>();	
	//initial value array
	public static ArrayList<Double> numbers2=new ArrayList<Double>();
	//Value array after first operation
	public static ArrayList<String> numbers2string=new ArrayList<String>();
	//strings associated with they values in numbers2

	public static ArrayList<Double> numbers3=new ArrayList<Double>();
	//Value array after second operation
	public static ArrayList<String> numbers3string=new ArrayList<String>();
	//strings associated with they values in numbers2

	public static double temp;
	public static String ansStr1;
	//definition of the first combination of numbers

	public static String ansStr2;
	//definition of the second combination of numbers

	public static String ansStr3;
	//definition of the third combination of numbers

	private static String finalAnswer;
	
	
	
	
	
	public static String solve(int num1, int num2, int num3, int num4){
		
		numbers.add((double) num1);
		numbers.add((double) num2);
		numbers.add((double) num3);
		numbers.add((double) num4);

		for(o1 = 1; o1 < 5; o1 = o1+1) {
			for(o2 = 1; o2 < 5; o2 = o2+1) {
				for(o3 = 1; o3 < 5; o3 = o3+1) {
					

					//cycle through every order of operations possible

					for(r1 = 0; r1 < 4; r1 = r1+1) {
						for(r2 = 0; r2 < 4; r2 = r2+1) {
							if(r2!=r1){
								for(r3 = 0; r3 < 4; r3 = r3+1) {
									if(r3!=r2 && r3!=r1){
										for(r4 = 0; r4 < 4; r4 = r4+1) {
											if(r4!=r3 && r4!=r2 && r4!=r1){

												//cycle through every possible order of given numbers

												switch(o1){
												case 1:
													temp=numbers.get(r1)+numbers.get(r2);
													ansStr1="("+numbers.get(r1)+"+"+numbers.get(r2)+")";
													break;
												case 2:
													temp=numbers.get(r1)-numbers.get(r2);
													ansStr1="("+numbers.get(r1)+"-"+numbers.get(r2)+")";

													break;
												case 3:
													temp=numbers.get(r1)*numbers.get(r2);
													ansStr1="("+numbers.get(r1)+"*"+numbers.get(r2)+")";

													break;
												case 4:
													temp=numbers.get(r1)/numbers.get(r2);
													ansStr1="("+numbers.get(r1)+"/"+numbers.get(r2)+")";

													break;
												}
												numbers2.clear();
												numbers2.add(temp);
												numbers2.add(numbers.get(r3));
												numbers2.add(numbers.get(r4));

												numbers2string.clear();
												numbers2string.add(ansStr1);
												numbers2string.add(""+numbers.get(r3)+"");
												numbers2string.add(""+numbers.get(r4)+"");

												for(s1 = 0; s1 < 3; s1 = s1+1) {
													for(s2 = 0; s2 < 3; s2 = s2+1) {
														if(s2!=s1){
															for(s3 = 0; s3 < 3; s3 = s3+1) {
																if(s3!=s2 && s3!=s1){
																	switch(o2){
																	case 1:
																		temp=numbers2.get(s1)+numbers2.get(s2);
																		ansStr2="("+numbers2string.get(s1)+"+"+numbers2string.get(s2)+")";
																		break;
																	case 2:
																		temp=numbers2.get(s1)-numbers2.get(s2);
																		ansStr2="("+numbers2string.get(s1)+"-"+numbers2string.get(s2)+")";

																		break;
																	case 3:
																		temp=numbers2.get(s1)*numbers2.get(s2);
																		ansStr2="("+numbers2string.get(s1)+"*"+numbers2string.get(s2)+")";

																		break;
																	case 4:
																		temp=numbers2.get(s1)/numbers2.get(s2);
																		ansStr2="("+numbers2string.get(s1)+"/"+numbers2string.get(s2)+")";

																		break;
																	}
																	numbers3.clear();
																	numbers3.add(temp);
																	numbers3.add(numbers2.get(s3));

																	numbers3string.clear();
																	numbers3string.add(ansStr2);
																	numbers3string.add(numbers2string.get(s3));
																	for(t1 = 0; t1 < 2; t1 = t1+1) {
																		for(t2 = 0; t2 < 2; t2 = t2+1) {
																			if(t1!=t2){
																				switch(o3){
																				case 1:
																					temp=numbers3.get(t1)+numbers3.get(t2);
																					ansStr3=numbers3string.get(t1)+"+"+numbers3string.get(t2);
																					break;
																				case 2:
																					temp=numbers3.get(t1)-numbers3.get(t2);
																					ansStr3=numbers3string.get(t1)+"-"+numbers3string.get(t2);

																					break;
																				case 3:
																					temp=numbers3.get(t1)*numbers3.get(t2);
																					ansStr3=numbers3string.get(t1)+"*"+numbers3string.get(t2);

																					break;
																				case 4:
																					temp=numbers3.get(t1)/numbers3.get(t2);
																					ansStr3=numbers3string.get(t1)+"/"+numbers3string.get(t2);

																					break;
																				}
																				

																				if(temp==24){
																					finalAnswer=ansStr3+"="+24;							
																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		return finalAnswer;
	}
}

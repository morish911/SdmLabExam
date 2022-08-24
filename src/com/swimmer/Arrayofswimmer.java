package com.swimmer;

public class Arrayofswimmer {
public static void AllSwimmerinfo(Swimmer[]allswimmer)
{
	for(Swimmer sw:allswimmer)
	{
		sw.print();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Swimmer sw[]=new Swimmer[3];
      //  sw[0]=new Swimmer("Dhoni","freestyle",6.25F);
    //    sw[1]=new Swimmer("Kholi","Butterfly",4.5f);
    //    sw[2]=new Swimmer("rahul","backstrock",3.5f);
        
        
        Swimmer s1=new Swimmer("Dhoni","freestyle",6.25F);
        Swimmer s2=new Swimmer("Kholi","Butterfly",4.5f);
        Swimmer s3=new Swimmer("rahul","backstrock",3.5f);  
        
        sw[0]=s1;
        sw[1]=s2;
        sw[2]=s3;
        Swimmer object[]= {s1,s2,s3};
        AllSwimmerinfo(object);
        System.out.println(s1.getName());
	}

}
